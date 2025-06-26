package inheritance;

public class Department extends College
{
	String type,hod;
	int lec,noOfStudent,seats;
	
	public Department()
	{
		
	}
	
	Department(String type,String hod,int lec,int noOfStudent,int seats,String cname,String grade,String address,
			String principal,
			int cCode,int noOfDept,String uname,String vc, String uLoc,String utype,int code)
	{
		this.type=type;
		this.hod=hod;
		this.lec=lec;
		this.noOfStudent=noOfStudent;
		this.seats=seats;
		
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
	
	public void displayDept()
	{
		displayCollege();
		System.out.println("SEATS:"+seats);
		System.out.println("NO OF STUDENT:"+noOfStudent);
		System.out.println("DEPARTMENTS TYPE:"+type);
		System.out.println("DEPARTMENTS HOD"+hod);
		System.out.println("NO OF LECTURERS:"+lec);
		
		
		
		
	}
	
	
}
