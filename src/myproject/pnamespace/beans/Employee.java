package myproject.pnamespace.beans;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	private Account acc;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("------------------------------------");
		System.out.println("Employee Id 	: "+eid);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Address : "+eaddr);
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("--------------------------------------");
		System.out.println("Account Number 	: "+acc.getAccNo());
		System.out.println("Account Holder Name :"+acc.getAccName());
		System.out.println("Account Type    : "+acc.getAccType());
		System.out.println("Account Balance	: "+acc.getBalance());
	}

}
