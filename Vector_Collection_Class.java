import java.util.Vector;





class Studen{
	int age;
	String name;
	Studen(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return "age= "+age+" Name="+name;
	}
}



public class Vector_Collection_Class
{
	public static void main(String[] args)
	{
	   Vector s1=new Vector(5,1);
	   
	   System.out.println(" SIZE OF VECTOR=>"+s1.size()+" CAPACITY IS="+s1.capacity());
	   
	   s1.addElement(new Integer(10));
	   s1.addElement(new Double(2.3));
	   s1.addElement(new Float(5.4f));
	   s1.addElement(new String("Pradip"));
	   s1.addElement(new String("Kumar"));
	   s1.addElement(new String("Dak"));
	   s1.addElement(new Long(210220132));
	   
	   
	   System.out.println(" SIZE OF VECTOR=>"+s1.size()+" CAPACITY IS="+s1.capacity());
	   
	   
	   for(int i=0;i<s1.size();i++){
		   System.out.println(" "+s1.get(i));
	   }
	   
	   System.out.println(" SIZE OF VECTOR=>"+s1.size()+" CAPACITY IS="+s1.capacity());
	   
	   Vector s2=new Vector(5,1);
	   
	   s2.addElement(new Studen(19,"DAKPRADIP"));
	   s2.addElement(new Studen(20,"SACHIN"));
	   s2.addElement(new Studen(21,"SHUBH"));
	   
	   System.out.println(" SIZE OF VECTOR=>"+s2.size()+" CAPACITY IS="+s2.capacity());
	   
	   s2.insertElementAt(new Studen(23,"RAhi"),2);
	   s2.removeElementAt(1);
	   
	   for(int i=0;i<s2.size();i++){
		   System.out.println(" "+s2.get(i));
	   }
	   System.out.println(" SIZE OF VECTOR=>"+s2.size()+" CAPACITY IS="+s2.capacity());
	}

}
