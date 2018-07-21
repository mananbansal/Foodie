package icsd;

public class Prod {

String	strcpid,strProdId,strProdNm,strProdDesc,strProdPrice,strProdImg;
  
    public Prod()
    {
    	
    }

public Prod(String strcpid, String strProdId, String strProdNm, String strProdDesc, String strProdPrice,
		String strProdImg) {
	super();
	this.strcpid = strcpid;
	this.strProdId = strProdId;
	this.strProdNm = strProdNm;
	this.strProdDesc = strProdDesc;
	this.strProdPrice = strProdPrice;
	this.strProdImg = strProdImg;
}

@Override
public String toString() {
	return "Prod [strcpid=" + strcpid + ", strProdId=" + strProdId + ", strProdNm=" + strProdNm + ", strProdDesc="
			+ strProdDesc + ", strProdPrice=" + strProdPrice + ", strProdImg=" + strProdImg + "]";
}

public String getStrcpid() {
	return strcpid;
}

public void setStrcpid(String strcpid) {
	this.strcpid = strcpid;
}

public String getStrProdId() {
	return strProdId;
}

public void setStrProdId(String strProdId) {
	this.strProdId = strProdId;
}

public String getStrProdNm() {
	return strProdNm;
}

public void setStrProdNm(String strProdNm) {
	this.strProdNm = strProdNm;
}

public String getStrProdDesc() {
	return strProdDesc;
}

public void setStrProdDesc(String strProdDesc) {
	this.strProdDesc = strProdDesc;
}

public String getStrProdPrice() {
	return strProdPrice;
}

public void setStrProdPrice(String strProdPrice) {
	this.strProdPrice = strProdPrice;
}

public String getStrProdImg() {
	return strProdImg;
}

public void setStrProdImg(String strProdImg) {
	this.strProdImg = strProdImg;
}
}
