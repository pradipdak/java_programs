import java.util.Stack;






class Stdent{
	int age;
	String name;
	Stdent(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return "age= "+age+" Name="+name;
	}
}



public class Collection_to_SpecifyClass 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		   
		   s1.push(new Integer(10));
		   s1.push(new Double(2.3));
		   s1.push(new Float(5.4f));
		   s1.push(new String("Pradip"));
		   s1.push(new String("Kumar"));
		   s1.push(new String("Dak"));
		   s1.push(new Long(210220132));
		   
		   System.out.println(s1.search(2.3));
		   while(!s1.empty()){
			   System.out.println(" "+s1.pop());
		   }
		   
		   Stack<Stdent> s2=new Stack<Stdent>();
		   s2.push(new Stdent(10,"PRadip"));
		   s2.push(new Stdent(2,"Dak"));
		   s2.push(new Stdent(5,"Rahul"));
		   
		   
		   
		   while(!s2.empty()){
			   System.out.println(" "+s2.pop());
		   }
		   
		   
		   
	}

}
