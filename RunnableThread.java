



class Child2 implements Runnable{
	int i,j,k;
	Thread th;
	Child2(String s,int a,int b){
		//super(s);
		th=new Thread(this,s);
		i=a;
		j=b;
		th.start();
	}
	public void run(){
		for(k=i;k<=j;k++){
			System.out.println("       "+th.getName()+"="+k);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class RunnableThread{

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		Child2 c1=new Child2("A",1,10);
		try{c1.th.join();} catch(Exception e){}
		Child2 c2=new Child2("B",11,20);
		try{c2.th.join();} catch(Exception e){}
		Child2 c3=new Child2("C",21,30);
		
		System.out.println("    Child c1="+c1.th.isAlive());
		System.out.println("    Child c2="+c2.th.isAlive());
		System.out.println("    Child c3="+c3.th.isAlive());

	}
}
