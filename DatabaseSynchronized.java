class Database{
	synchronized void Update(String tna){
		System.out.println(tna+" has Started Updating");
		try{
			Thread.sleep(1000);
		} catch(Exception e){}
		System.out.println(tna+" Finish Update");
	}
	void Read(String tna){
		System.out.println(tna+" has Started Reading");
		try{
			Thread.sleep(1000);
		} catch(Exception e){}
		System.out.println(tna+" Finish Reading");
	}
}
class User implements Runnable{
	Thread th;
	Database c;
	String tna;
	User(String s,Database cc){
		th=new Thread(this,s);
		//c=new Call();
		c=cc;
		tna=s;
		th.start();
	}
	public void run(){
		c.Read(tna);
		if(tna.equals("Super"))
		{
	   			c.Update(tna);
	   	}
		else{
			synchronized(c){
		          c.Update(tna);
			}
		}
	}
}
public class DatabaseSynchronized 
{
	public static void main(String[] args) 
	{
		Database c=new Database();
        User u1=new User("Pradip",c); 
        User u2=new User("Rajan",c);
        User u3=new User("Sachin",c);
        User u4=new User("Super",c);
	}

}
