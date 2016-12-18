package proxy.virtual;

public class ProxyImage implements Image
{
	private String fileName;
	private Image image;
	
	public ProxyImage(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void showImage()
	{
		if(image == null)
		{
			image = new RealImage(fileName);
		}
		image.showImage();
	}
}
