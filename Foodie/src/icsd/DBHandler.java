package icsd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

//import javax.servlet.http.HttpSession;

//import jdk.nashorn.internal.ir.RuntimeNode.Request;
//import net.ucanaccess.jdbc.Session;
import oracle.jdbc.pool.OracleDataSource;

public class DBHandler {

	public Connection getDBcon()
	{
		Connection con=null;
		try {
			OracleDataSource ods=new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			con=ods.getConnection("sachin1","icsd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return con;
	}
	
	public LinkedList<Comp> getCompanytable()
	{
		LinkedList<Comp> lst= new LinkedList<>();
		Connection con=getDBcon();
		try {
			PreparedStatement stmt =con.prepareStatement("select * from company");
			ResultSet rset=stmt.executeQuery();
			
			
			while(rset.next())
			{
				String strCompId=rset.getString("companyid");
				String strCompName=rset.getString("companyname");
				String strCompDesc=rset.getString("companydesc");
				String strCompImg=rset.getString("companyimg");
				
				Comp c1= new Comp(strCompId,strCompName,strCompDesc,strCompImg);
				lst.add(c1);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public LinkedList<Prod> getProductTable(String strcpid)
	{
         
		LinkedList<Prod> lst=new LinkedList<>();
		Connection con=getDBcon();
		try {
			PreparedStatement stmt =con.prepareStatement("select * from cproducts1 where companyid=?");
			stmt.setString(1, strcpid);
			ResultSet rset=stmt.executeQuery();
			
			while(rset.next())
			{
				String strProdId=rset.getString("productid");
				String strProdNm=rset.getString("productname");
				String strProdDesc=rset.getString("productdesc");
				String strProdPrice=rset.getString("productprice");
				String strProdImg=rset.getString("productimg");
				
				Prod p1=new Prod(strcpid,strProdId,strProdNm,strProdDesc,strProdPrice,strProdImg);
				lst.add(p1);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public Cart getCartitem(String strprodid)
	
	{
		Cart c=null;
       System.out.println(strprodid+"a1 prod id");
		Connection con=getDBcon();
		try {
			PreparedStatement stmt =con.prepareStatement("select * from cproducts1 where productid=?");
			stmt.setString(1,strprodid);
			ResultSet rset=stmt.executeQuery();
			
			if(rset.next())
			{
				String strCompId=rset.getString("companyid");
				String strProdId=rset.getString("productid");
				String strProdName=rset.getString("productname");
				String strProdDesc=rset.getString("productdesc");
				String strProdPrice=rset.getString("productprice");
				String strProdimg=rset.getString("productimg");
		 c=new Cart(strCompId,strProdId,strProdName,strProdDesc,Integer.parseInt(strProdPrice),strProdimg);
System.out.println(c+" a1 obj disp");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return c;
	
	}
	
	public void userVerify(String strunm ,String strp)
	{
		
	}
}
