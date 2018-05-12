





class Factorial implements Runnable{
	int fact=1,num,i;
	Thread th;
	String na;
	Factorial(String s,int n,String na){
	  th=new Thread(this,s);
	  num=n;
	  this.na=na;
	  th.start();  
	}
	public void run(){
		if(na=="fact"){
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Factorial Of ("+num+") is ->"+fact);
		}
		else if(na=="pow"){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Math.pow(num,num));
		}
	}
}
/*class Power implements Runnable{
	int n,e;
	Thread th;
	Power(String s,int a,int b){
         th=new Thread(this,s);
         n=a; e=b;
         th.start();
	}
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Math.pow(n, e));
	}
}*/

public class FactorialandPower 
{
	public static void main(String[] args) 
	{
       Factorial f1=new Factorial("Pradip",6,"fact");
       Factorial f2=new Factorial("Rajan",6,"pow");
       //Power p1=new Power("Rajan",4,3);

	}
}
