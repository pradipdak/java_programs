import java.util.Scanner;









class Marks{
	//Thread th;
	Scanner scan=new Scanner(System.in);
	int age;
	int id;
	String name;
	int cssa,daa,os;
	float per;
	Marks(int a,int b,String n){
		//th=new Thread(this);
		age=a;
		id=b;
		name=n;
	}
  void run(){
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("** Students **");
		System.out.println("AGE="+age);
		System.out.println("ID="+id);
		System.out.println("NAME="+name);
	    System.out.println("\n Enter The Subject Marks Below");
	    System.out.print("\nCSSA->");
	    cssa=scan.nextInt();
	    System.out.print("\nDAA->");
	    daa=scan.nextInt();
	    System.out.print("\nOS->");
	    os=scan.nextInt();
	    per=(cssa+daa+os)/3;
	    System.out.print("\n\n PERCENTAGE IS->"+per );
		
	}
}







public class StudentCLass_Marks 
{
	public static void main(String[] args) 
	{
		
		
		Marks ma[]=new Marks[5];
		for(int p=0;p<(args.length)/3 ;p=p+3){
			ma[p]=new Marks(Integer.parseInt(args[p]),Integer.parseInt(args[p+1]),args[p+2]);
			ma[p].run();
		}
		/*int i=0,j=1,k=2;
		for(int p=0;  p<(args.length/3);    p++)
		{
        Marks m=new Marks(Integer.parseInt(args[i]),Integer.parseInt(args[j]),args[k]);
        i=i+3;
        j=j+3;
        k=k+3;
        try{
        	m.th.join();
        }
        catch(Exception e){}
		}*/
	}

}
