
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





class Student1{
	int age;
	String name;
	Student1(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return "age= "+age+" Name="+name;
	}
}



public class ArrayList_Collection_Class
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
	   List s1=new ArrayList();
	   
	   System.out.println(" SIZE OF VECTOR=>"+s1.size());
	   
	   s1.add(new Integer(10));
	   s1.add(new Double(2.3));
	   s1.add(new Float(5.4f));
	   s1.add(new String("Pradip"));
	   s1.add(new String("Kumar"));
	   s1.add(new String("Dak"));
	   s1.add(new Long(210220132));
	   
	  System.out.println(" "+ s1.get(4));
	  // System.out.println(" SIZE OF VECTOR=>"+s1.size());
	   
	   Iterator it=s1.iterator();
	   while(it.hasNext()){
		   System.out.println(" "+it.next());
	   }
	  /* for(int i=0;i<s1.size();i++){
		   System.out.println(" "+s1.get(i));
	   }*/
	   
	  // System.out.println(" SIZE OF VECTOR=>"+s1.size());
	   
	   List s2=new ArrayList();
	   
	   s2.add(new Student1(19,"DAKPRADIP"));
	   s2.add(new Student1(20,"SACHIN"));
	   s2.add(new Student1(21,"SHUBH"));
	   
	  // System.out.println(" SIZE OF VECTOR=>"+s2.size());
	   
	   s2.add(2,new Studen(23,"RAhi"));
	   s2.remove(1);
	   
	   for(int i=0;i<s2.size();i++){
		   System.out.println(" "+s2.get(i));
	   }
	   System.out.println(" SIZE OF VECTOR=>"+s2.size());
	}

}
