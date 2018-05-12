import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Print_10_NUm_In_File 
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner scan=new Scanner(System.in);
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("src//Data.txt"));
			for(i=1;i<=10;i++){
				System.out.println("Enter NO->");
				n=scan.nextInt();
				dos.writeInt(n);
			}
			dos.close();
			
		DataInputStream dis=new DataInputStream(new FileInputStream("src//data.txt"));	
		int s=0;
		for(i=1;i<=10;i++){
			n=dis.readInt();
			s=s+n;
		}
		System.out.println("\n SUM->"+s);			
		} catch (Exception e){}
		
	}

}
