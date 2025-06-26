package inheritance;

public class College extends Univerisity
{
	String cname;
	String grade;
	int cCode;
	String address,principal;
	int noOfDept;
	
	public College()
	{
		
	}
	
	
	College(String cname,String grade,String address,String principal,int cCode,int noOfDept,String uname, 
			String vc, String uLoc,String utype,int code)
	{
		
		this.code=code;
		this.uLoc=uLoc;
		this.uname=uname;
		this.utype=utype;
		this.vc=vc;
		
		this.address =address;
		this.cCode=cCode;
		this.cname=cname;
		this.grade=grade;
		this.principal=principal;
		this.noOfDept=noOfDept;
	}
	
	public void displayCollege()
	{
		displayUniverisity();
		System.out.println("COLLEGE NAME:"+cname);
		System.out.println("COLLEGE GRADE:"+grade);
		System.out.println("COLLEGE ADDRESS"+address);
		System.out.println("COLLGE PRINCIPAL:"+principal);
		System.out.println("COLLEGE CODE:"+cCode);
		System.out.println("NO OF DEPT IN COLLEGE:"+noOfDept);
		System.out.println("--------------------------------------------------");
		
		
	}
	
	
}
