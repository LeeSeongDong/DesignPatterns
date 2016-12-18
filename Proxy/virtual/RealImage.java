package proxy.virtual;

public class RealImage implements Image
{
	private String fileName;
	
	public RealImage(String fileName)
	{
		this.fileName = fileName;
		loadImageFromDisk();
	}
	
	private void loadImageFromDisk()
	{
		System.out.println("load " + fileName + "!!");
	}
	
	public void showImage()
	{
		System.out.println("Show Image!!");
	}
}
