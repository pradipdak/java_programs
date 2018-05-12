import java.util.Scanner;

public class FirstThread {
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		int i, n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Name Is->" + t.getName());
		t.setName("Msu");
		System.out.println("Enter NO->");
		n = scan.nextInt();
		for (i = 0; i <= n; i++) {
			System.out.println("Hello World I am Alive Always.");
			System.out.println(" " + i + " name=" + t.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n " + t.isAlive());
		System.out.println("\n\n " + t.isDaemon());
	}
}
