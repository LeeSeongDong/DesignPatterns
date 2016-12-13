package iterator.recursiveDir;

import java.util.ArrayList;
import java.util.Iterator;

public class Dir extends FileComponent
{
	private ArrayList<FileComponent> fileComponents = new ArrayList<FileComponent>(); //generic collection으로 변경할 것.
	private String name;
	
	public Dir(String name)
	{
		this.name = name;
	}
	
	// 공통
	public String getName() 
	{
		return name;
	}

	public void print() 
	{
		System.out.println("Dir : " + getName());
		Iterator iterator = fileComponents.iterator();

		while (iterator.hasNext()) 
		{ 
			FileComponent fileComponent = (FileComponent)iterator.next();
			fileComponent.print(); // 각 child에게 print() 위임
		}
	}

	// For composite
	public void add(FileComponent fileComponent) 
	{ 
		fileComponents.add(fileComponent);
	}

	public void remove(FileComponent fileComponent) 
	{ 
		fileComponents.remove(fileComponent);
	}

	public FileComponent getChild(int i) 
	{ 
		return fileComponents.get(i);
	}
}
