package proxy.virtual;

public class ImageTestDrive 
{
	public static void main(String[] args) 
	{
		Image img1 = new ProxyImage("image1");
		Image img2 = new ProxyImage("image2");
		
		img1.showImage();
		img2.showImage();
	}
}
