package student;

public class Student 
{
	//Attributes
	int sId;
	String sName;
	String sPhoneNo;
	String sAddress;
	
	public Student()
	{
		
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPhoneNo() {
		return sPhoneNo;
	}
	public void setsPhoneNo(String sPhoneNo) {
		this.sPhoneNo = sPhoneNo;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPhoneNo=" + sPhoneNo + ", sAddress=" + sAddress + "]";
	}
	

}
