
class Train{
	synchronized void waiting(String tna,int speed){
		System.out.println("Train "+tna+ " Waiting.....");
		 try{ wait();} 
		 catch(Exception e){}
		System.out.println("Train "+tna+" Strart Running..");
	}
	synchronized void Running(){
		notify();
	}
}
class Tname implements Runnable{
	Thread th;
	int speed;
	Train t;
	String tna;
	int i;
	String[] ch=new String[30];
	
	Tname(String tna,Train t,int sp){
	  th=new Thread(this,tna);
	  this.t=t;
	  speed=sp;
	  ch[0]="Karjan";
	  ch[1]="Palej";
	  ch[2]="Bharuch";
	  ch[3]="Ankleswar";
	  ch[4]="Kim";
	  ch[5]="Surat";
	  i=0;
	  this.tna=tna;
	  th.start();
	}
	public void run(){
		while(true){
			  try{ Thread.sleep(speed);} 
			  catch(Exception e){}
			 if(ch[i]=="Surat"){
				 System.out.println("Train "+tna+" Reached The "+ch[i]+" Station");
				 i++;
				 System.exit(0);
			 }
			 else if(ch[i]=="Bharuch"  && tna.equals("Local")){
				 System.out.println("Train "+tna+" Is Reached at "+ch[i]);
				 i++;
				 t.waiting(tna,speed); 
			 }
			 else if(ch[i]=="Ankleswar" && tna.equals("Rajdhani")){ 
				   System.out.println("Train "+tna+" Is Reached at "+ch[i]);
				   i++;
				   t.Running();
			 }
			 else{ 
				 System.out.println("Train "+tna+" Is Pass from "+ch[i]);
				 i++;
			 }
		}
	}
}


public class TrainTraffic {
   public static void main(String []args){
	     Train t1=new Train();
	     Tname t2=new Tname(args[0],t1,4000);
	     try{Thread.sleep(3000);}catch(Exception e){}
	     Tname t3=new Tname(args[1],t1,3000);
   }
}
