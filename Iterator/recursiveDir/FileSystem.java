package iterator.recursiveDir;

public class FileSystem 
{
	private FileComponent root;
	
	public FileSystem(FileComponent root)
	{
		this.root = root;
	}
	
	public void dir()
	{
		root.print();
	}
}
