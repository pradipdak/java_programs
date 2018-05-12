import java.io.DataOutputStream;
import java.io.FileOutputStream;






class Oddeven implements Runnable{
	Thread th;
    int items;
    String fna;
	String tna;
	Oddeven(String fna,int n,String tna){
		th=new Thread(this,fna);
		items=n;
		this.tna=tna;
		th.start();
	}
	public void run(){
		if(tna=="ODD"){
			try {
				DataOutputStream f1=new DataOutputStream(new FileOutputStream("src//Odd.txt"));
				for(int i=1;i<=items;i++){
					if(i%2==0)
					{
						System.out.print(" "+i);
					    f1.writeInt(i);
					}
					try{Thread.sleep(500);}catch(Exception e){}
					
				}
				f1.close();
			} catch (Exception e1){}
		}
		else if(tna=="EVEN"){
			try {
				DataOutputStream f2=new DataOutputStream(new FileOutputStream("src//Even.txt"));
				for(int i=1;i<=items;i++){
					if(i%2!=0){
					System.out.println(" "+i);
					f2.writeInt(i);
					try{Thread.sleep(600);}catch(Exception e){}
					}
				}
				f2.close();
			} catch (Exception e1) {
			}
		
		
		}
		
	}
}

public class Even_ODD_txt_File 
{
	public static void main(String[] args) 
	{
       Oddeven p1=new Oddeven("Pradip",100,"ODD");
       Oddeven p2=new Oddeven("Shubh",100,"EVEN");
    }
}
