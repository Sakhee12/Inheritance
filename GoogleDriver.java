package inheritance;

public class GoogleDriver 
{
	public static void main(String[] args) {
		GoogleEmail g1 = new GoogleEmail("bdjiumfcdi", "vbjsdg", 1785660, "raju@gmail.com", "raju@123");
		g1.sendMail("rani@gmail.com", "HIeeeeeeeee");
		g1.reciecMail("gjfycfcb", "Byeeeeeeee");
		
		
		GoogleDrive g2 = new GoogleDrive("bdjiumfcdi", "vbjsdg", 1785660, "raju@gmail.com", "raju@123");
		g2.add("audio");
		g2.add("photos");
	}
}
