import java.io.File;
import java.util.Scanner;


public class FileList {

	public static void main(String[] args) 
	{
	
		String fna;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the Folder Name->");
		fna=scan.nextLine();
		File f=new File(fna);
		String[] flist=f.list();
		int a=0,b=0;
		for(int i=0;i<flist.length;i++){
			if(flist[i].endsWith(".ini")){
				File ff=new File(f,flist[i]);   // Only Flist[i] Not pass Bcoz It Pass Only Current File.
				if(ff.isFile()){
					a++;
				}
				else{
					b++;
				}
			System.out.println(" "+flist[i]);
			}
			
			}
		
		File fold=new File("src//pradip");
        fold.mkdir();
        
       System.out.println("Files="+a);
       System.out.println("Folders="+b);
	}

}
