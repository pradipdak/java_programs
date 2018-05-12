
class Childe implements Runnable{
		Thread th;
		int num;
		Childe(int n){
		   num=n;
	       th=new Thread(this);
	       th.start();
		}
		public void run(){
	           for(int j=1;j<=10;j++)
	           {
	               System.out.println(num+" * "+j+" = "+(num*j));   
	           }
	           System.out.println("\n");
		}
	}


public class MultiplyTableCommandLineArgument 
{
		public static void main(String[] args) 
		{
			for(int i=1;i<=Integer.parseInt(args[0]);i++){
				Childe c=new Childe(i);	
				try{
					c.th.join();
					Thread.sleep(100);
				}
				catch(Exception e){}
			}  
		}
	}
