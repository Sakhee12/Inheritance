package inheritance;

public class GoogleEmail extends Google
{
	int mails;
	int bin;
	int sent,inbox;
	
	public GoogleEmail()
	{
		
	}
	
	public GoogleEmail(int mails,int inbox,int bin,int sent)
	{
		this.bin=bin;
		this.inbox=inbox;
		this.mails=mails;
		this.sent=sent;
	}
	
	public GoogleEmail( String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.email=email;
		this.turnover = turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void sendMail(String email,String Content)
	{
		System.out.println("Mail Sent");
		sent++;
		
	}
	
	public void reciecMail(String email,String content)
	{
		System.out.println("You have recieved a mail");
		inbox++;
		mails++;
		
	}
	
	public void deleteMail(String email)
	{
		mails--;
		bin++;
	}
	
	public void displayGoogleEmail()
	{
		System.out.println("INBOX"+inbox);
		System.out.println("BIN"+bin);
		System.out.println("MAILS"+email);
		System.out.println("SENT"+sent);
	}
	
}
