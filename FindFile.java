import java.io.File;
import java.util.Scanner;


public class FindFile 
{
	public static void main(String[] args) 
	{
		String fna,d;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the File Name->");
		fna=scan.nextLine();
		System.out.println("Enter the Drive Name->");
		d=scan.nextLine();
		
		File f=new File(d);
		if(!f.isDirectory()){
			System.out.println(d+" Is Not Directory.");
			System.exit(0);
		}
		
				
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
	}

}
