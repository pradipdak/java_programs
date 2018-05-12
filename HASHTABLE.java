import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.w3c.dom.html.HTMLTableRowElement;










class Student2{
	int age;
	String name;
	Student2(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return "age= "+age+" Name="+name;
	}
}




public class HASHTABLE {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		 Hashtable ht=new Hashtable();
		   
		   ht.put("10",new Integer(10));
		   ht.put("2.3",new Double(2.3));
		   ht.put("5.4",new Float(5.4f));
		   ht.put("pra",new String("Pradip"));
		   ht.put("kum",new String("Kumar"));
		   ht.put("dk",new String("Dak"));
		   ht.put("lng",new Long(210220132));		   
		   
		   System.out.println(" "+ht.get("lng"));
		   Enumeration e=ht.elements();         //Enumeration is InterFace.
		   while(e.hasMoreElements()){
			   System.out.println(" "+e.nextElement());
		   }
 	}

}
