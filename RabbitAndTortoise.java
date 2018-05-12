
class Track
{
	synchronized void tunnel(String s,long  sp)
	{
		System.out.println(" "+s+" Is Enter In Tunnel ...");
		try{ Thread.sleep(sp); } 
		catch(Exception e){}
		System.out.println(" "+s+" Is Croosed The Tunnel...");
	}
	synchronized void sleep()
	{
		System.out.println("Rabbit is Sleeping...");
		try { wait(); } 
		catch (Exception e) {}
		System.out.println("Rabbit was Wake Up....");
	}
	synchronized void wakeup()
	{
		notify();
	}
}
class Runner implements Runnable{
	Thread th;
	Track t;
	String rna;
	int miles;
	long  sp;
	Runner(String s,Track t,long sp){
		th=new Thread(this);
		this.t=t;
		rna=s;
		this.sp=sp;
		miles=0;
		th.start();
	}
	public void run(){
	  while(true){ 
		  try{ Thread.sleep(sp);} 
		  catch(Exception e){}
		  miles++;
		  System.out.println(" "+rna+" Is Completed "+miles+" Miles");
		  
		  if(miles==10){
			  System.out.println(rna+" Is Won Race!!!");
			  System.exit(0);
		  }
		  else if(miles==3){
			    t.tunnel(rna,sp);
		  }
		  else if(miles==6 && rna.equals("Rabbit")){
			  t.sleep();	   		  
		  }
		  else if(miles==8 && rna.equals("Tortoise")){
			    t.wakeup();
		  }
	  }
	}
}

public class RabbitAndTortoise 
{
	public static void main(String[] args) 
	{
        Track t=new Track();
        Runner r1=new Runner("Rabbit",t,3000);
        Runner r2=new Runner("Tortoise",t,5000);     
	}

}
