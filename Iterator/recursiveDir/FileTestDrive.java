package iterator.recursiveDir;

public class FileTestDrive 
{
	public static void main(String[] args)
	{
		FileComponent root = new Dir("C:");
		FileComponent user = new Dir("user");
		FileComponent etc = new Dir("etc");
		FileComponent LSD = new Dir("LSD");
		FileComponent aa = new File("aa.txt", "aaaaaaaa");
		
		root.add(user);
		root.add(etc);
		user.add(LSD);
		LSD.add(aa);
		
		FileSystem fs = new FileSystem(root);
		fs.dir();
	}
}
