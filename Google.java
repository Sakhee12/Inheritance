package inheritance;

public class Google 
{
	String ceo;
	String hq;
	double turnover;
	
	String email;
	String pass;
	
	public Google()
	{
		
	}
	
	public Google( String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.email=email;
		this.turnover = turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void login(String email,String pass)
	{

		if(this.email==email && this.pass==pass)
		{
			System.out.println("Login Sucessfull");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
	
	public void displayGoogle()
	{
		System.out.println("CEO:" +ceo);
		System.out.println("HQ:" +hq);
		System.out.println("TURNOVER:" +turnover);
		System.out.println("---------------------------------------------------");
	}
}
