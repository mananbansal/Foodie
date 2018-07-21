package icsd;

public class Cart {
     
	public Cart(){
		
	}
	public Cart(String strCompId, String strProdId, String strProdName, String strProdDesc, int strProdPrice,
			String strProdimg) {
		super();
		this.strCompId = strCompId;
		this.strProdId = strProdId;
		this.strProdName = strProdName;
		this.strProdDesc = strProdDesc;
		this.strProdPrice = strProdPrice;
		this.strProdimg = strProdimg;
	}

	@Override
	public String toString() {
		return "Cart [strCompId=" + strCompId + ", strProdId=" + strProdId + ", strProdName=" + strProdName
				+ ", strProdDesc=" + strProdDesc + ", strProdPrice=" + strProdPrice + ", strProdimg=" + strProdimg
				+ "]";
	}

	public String getStrCompId() {
		return strCompId;
	}

	public void setStrCompId(String strCompId) {
		this.strCompId = strCompId;
	}

	public String getStrProdId() {
		return strProdId;
	}

	public void setStrProdId(String strProdId) {
		this.strProdId = strProdId;
	}

	public String getStrProdName() {
		return strProdName;
	}

	public void setStrProdName(String strProdName) {
		this.strProdName = strProdName;
	}

	public String getStrProdDesc() {
		return strProdDesc;
	}

	public void setStrProdDesc(String strProdDesc) {
		this.strProdDesc = strProdDesc;
	}

	public int getStrProdPrice() {
		return strProdPrice;
	}

	public void setStrProdPrice(int strProdPrice) {
		this.strProdPrice = strProdPrice;
	}

	public String getStrProdimg() {
		return strProdimg;
	}

	public void setStrProdimg(String strProdimg) {
		this.strProdimg = strProdimg;
	}

	String strCompId,strProdId,strProdName,strProdDesc,strProdimg;
	int strProdPrice;
}
