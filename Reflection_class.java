import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflection_class 
{
	public static void main(String[] args) 
	{
        try {
			Class c=Class.forName("java.util.Scanner");
			int i;
			
			Field f[]=c.getFields();
			System.out.println("\n FIELDS=");
			for(i=0;i<f.length;i++){
				System.out.println(" "+f[i]);
			}
			
			Constructor con[]=c.getConstructors();
			System.out.println("\n CONSTRUCTORS=");
			for(i=0;i<con.length;i++){
				System.out.println(" "+con[i]);
			}
			
			Method m[]=c.getMethods();
			System.out.println("\n METHODS=");
			for(i=0;i<m.length;i++){
				System.out.println(" "+m[i]);
			}
			Annotation a[]=c.getAnnotations();
			System.out.println("\n ANNOTATIONS=");
			for(i=0;i<a.length;i++){
				System.out.println(" "+a[i]);
			}
		} 
        catch (ClassNotFoundException e) {
			e.printStackTrace();
		}       		
	}

}
