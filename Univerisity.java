package inheritance;

public class Univerisity 
{
	String uname,vc,uLoc,utype;
	int code;
	
	public Univerisity()
	{
		
	}
	
	public Univerisity(String uname,String vc, String uLoc,String utype,int code)
	{
		this.code=code;
		this.uLoc=uLoc;
		this.uname=uname;
		this.utype=utype;
		
		this.vc=vc;
		
	}
	
	public void displayUniverisity()
	{
		System.out.println("UNIVERSITY CODE:"+code);
		System.out.println("UNIVERSITY LOCATION"+uLoc);
		System.out.println("UNIVERSITY NAME:"+uname);
		System.out.println("UNIVERSITY TYPE:"+utype);
		System.out.println("UNIVERSITY VC:"+vc);
		
	}
	
}
