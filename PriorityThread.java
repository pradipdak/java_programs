


class Racer implements Runnable{
	Thread th;
	int runs;
    boolean b;
	Racer(String s,int p){
		th=new Thread(this,s);
		th.setPriority(p);
		runs=0; 
		b=true;
		th.start();
	}
	public void run(){
		while(b){
			runs++;
		}
	}
	void stop(){
		b=false;
	}
}
public class PriorityThread 
{
	public static void main(String[] args)
	{
	   Racer r1=new Racer("Pradip",5);
	   //try{r1.th.join();}catch(Exception e){}
	   Racer r2=new Racer("Sachin",1);
	   
	   System.out.println("Pradip="+r1.th.getPriority());
       System.out.println("Sachin="+r2.th.getPriority());
       
       try {
		Thread.sleep(100);
       }
       catch (InterruptedException e) {}
       
       r1.stop();
       r2.stop();
       
       System.out.println("Pradip="+r1.runs);
       System.out.println("Sachin="+r2.runs);
       
       
	}
}
