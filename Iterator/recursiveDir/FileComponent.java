package iterator.recursiveDir;

public class FileComponent 
{
	// 공통
	public String getName() 
	{
		throw new UnsupportedOperationException(); 
	}

	public void print() 
	{
		throw new UnsupportedOperationException(); 
	}

	// For composite
	public void add(FileComponent fileComponent) 
	{ 
		throw new UnsupportedOperationException(); 
	}

	public void remove(FileComponent fileComponent) 
	{ 
		throw new UnsupportedOperationException();
	}

	public FileComponent getChild(int i) 
	{ 
		throw new UnsupportedOperationException(); 
	}

	// For leaf
	public String getContent()
	{
		throw new UnsupportedOperationException();
	}
}
