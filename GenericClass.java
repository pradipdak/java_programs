
class BOX<T,V>
{
	 T len; V wid;
	 BOX(T l,V w){
		 len=l;
		 wid=w;
	 }
     public String toString(){
    	 return "LEN IS->"+len+" WID->"+wid;
     }
     void show(){
    	 System.out.println("\n LEN="+len);
    	 System.out.println(" WID="+wid);
     }
}

public class GenericClass 
{
	public static void main(String[] args) 
	{
     BOX<Integer,Float>b1=new BOX<Integer,Float>(10,2.4f);   b1.show();  
     BOX<Float,String>b2=new BOX<Float,String>(4.5f,"DAKSSS");   b2.show();  
     BOX<String,Double>b3=new BOX<String,Double>("PRADIP",4.5);   b3.show();  
     //BOX<Long>b4=new BOX<Long>(3493040443,3434344443);   b4.show();  
     BOX<Double,Long>b5=new BOX<Double,Long>(9.4,(long)112123123);   b5.show();  
	}

}
