package icsd;

public class Comp {

	 String strCompId,strCompName,strCompDesc,strCompImg;
	 public Comp(){
		 
	 }

	public Comp(String strCompId, String strCompName, String strCompDesc, String strCompImg) {
		super();
		this.strCompId = strCompId;
		this.strCompName = strCompName;
		this.strCompDesc = strCompDesc;
		this.strCompImg = strCompImg;
	}

	@Override
	public String toString() {
		return "Comp [strCompId=" + strCompId + ", strCompName=" + strCompName + ", strCompDesc=" + strCompDesc
				+ ", strCompImg=" + strCompImg + "]";
	}

	public String getStrCompId() {
		return strCompId;
	}

	public void setStrCompId(String strCompId) {
		this.strCompId = strCompId;
	}

	public String getStrCompName() {
		return strCompName;
	}

	public void setStrCompName(String strCompName) {
		this.strCompName = strCompName;
	}

	public String getStrCompDesc() {
		return strCompDesc;
	}

	public void setStrCompDesc(String strCompDesc) {
		this.strCompDesc = strCompDesc;
	}

	public String getStrCompImg() {
		return strCompImg;
	}

	public void setStrCompImg(String strCompImg) {
		this.strCompImg = strCompImg;
	}

}
