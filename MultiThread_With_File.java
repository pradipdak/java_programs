import java.util.Stack;


class ProducerConsumer implements Runnable{
	Thread th;
	Stack<Integer> s1;
    int items;
    String fna;
	ProducerConsumer(String fna,int n,Stack s1){
		th=new Thread(this,fna);
		items=n;
		this.s1=s1;
		this.fna=fna;
		th.start();
	}
	public void run(){
		try{
		if(fna=="Producer"){
		for(int i=1;i<=items;i++){
			s1.push(new Integer(i));
		    Thread.sleep(500);
		}
		
		}
		else if(fna=="Consumer"){
		for(int i=1;i<=10;i++){
			System.out.print(" "+s1.pop());
			Thread.sleep(600);
		}
		
		}
		}
		catch(Exception e){}
		
	}
}
public class MultiThread_With_File 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s1=new Stack<Integer>();
       ProducerConsumer p1=new ProducerConsumer("Producer",7,s1);
       ProducerConsumer p2=new ProducerConsumer("Producer",7,s1);
       ProducerConsumer c1=new ProducerConsumer("Consumer",7,s1);
       
        
       try{
    	   Thread.sleep(600);
       }
       catch(Exception e){}
       
       
	}

}
