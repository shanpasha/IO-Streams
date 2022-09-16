package Fileinput;

public class DataStoresIntoTxt {
	long accountNum;
	String name;
	String isfc;
	String mobileNum;
	public DataStoresIntoTxt(long accountNum, String name, String isfc, String mobileNum) {
		
		this.accountNum = accountNum;
		this.name = name;
		this.isfc = isfc;
		this.mobileNum = mobileNum;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsfc() {
		return isfc;
	}
	public void setIsfc(String isfc) {
		this.isfc = isfc;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "dataStoresIntoTxt [accountNum=" + accountNum + ", name=" + name + ", isfc=" + isfc + ", mobileNum="
				+ mobileNum + "]";
	}
	
	
	
}
