

class Child extends Thread{
	int j;
	Child(String s){
		super(s);
	    start();
	}
	public void run(){
		for(j=0;j<10;j++){
			System.out.println("           "+getName()+" ="+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		int i;
		Child c1=new Child("Pradip");
		Child c2=new Child("Rajan");
		System.out.println("    Main="+t.isAlive());
		System.out.println("    Child c1="+c1.isAlive());
		System.out.println("    Child c2="+c2.isAlive());
		
		for(i=0;i<10;i++){
			System.out.println("   "+i+" "+t.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("    Main="+t.isAlive());
		System.out.println("    Child c1="+c1.isAlive());
		System.out.println("    Child c2="+c2.isAlive());
	}

}
