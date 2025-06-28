package inheritance;

public class GoogleDrive extends Google
{
	int photos,audio,doc,bin,videos;
	
	public GoogleDrive()
	{
		
	}
	
	GoogleDrive(int photos,int audio,int doc,int bin,int videos)
	{
		this.photos=photos;
		this.audio=audio;
		this.bin=bin;
		this.doc=doc;
		this.videos=videos;
	}
	
	GoogleDrive( String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.email=email;
		this.turnover = turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void add(String fileType)
	{
		switch (fileType)
		{
		case "photos":
		case "Photos":{
			System.out.println("photo added!");
			photos++;
		}
		break;
		case "Video":
		case "video":
		case "videos":
		{
			System.out.println("Video Added");
			videos++;
		}
		break;
		case "Audio":
		case "audio":
		{
			System.out.println("Audio Added");
			audio++;
		}
		break;
		case "Doc":
		case "doc":
		{
			System.out.println("Docs Added");
			doc++;
		}
		break;
		default:
			System.out.println("Invalid type");
		}
	}
	
	public void delete(String fileType)
	{
		switch (fileType) {
		case "photos":
		case "Photos":{
			System.out.println("photo deleted!");
			photos--;
			bin++;
			
		}
		break;
		case "Video":
		case "video":
		case "videos":
		{
			System.out.println("Photo deleted");
			videos--;
			bin++;
		}
		break;
		case "Audio":
		case "audio":
		{
			System.out.println("Audio deleted");
			audio--;
			bin++;
		}
		break;
		case "Doc":
		case "doc":
		{
			System.out.println("Docs deleted");
			doc--;
			bin++;
		}
		break;
		default:
			System.out.println("Invalid type");
		}
	}
	
	public void displayGoogleDrive()
	{
		System.out.println("BIN:"+bin);
		System.out.println("AUDIO"+audio);
		System.out.println("VIDEO"+videos);
		System.out.println("PHOTOS:"+photos);
		System.out.println("DOCUMENTS:"+doc);
		System.out.println("--------------------------");
	}
}
