package iterator.recursiveDir;

public class File extends FileComponent
{
	private String name, content;
	
	public File(String name, String content)
	{
		this.name = name;
		this.content = content;
	}
	
	// 공통
	public String getName() 
	{
		return name;
	}

	public void print() 
	{
		System.out.println("File : " + getName() + " : " + getContent());
	}

	// For leaf
	public String getContent()
	{
		return content;
	}
}
