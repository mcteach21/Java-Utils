package mc.reflection;

import java.lang.reflect.Method;

public class ReflectionTests {

	public static void main(String[] args) {
		
		String class_name="mc.reflection.User";
		try
		{
			
			Class<?> cls = Class.forName(class_name);
			Object obj = cls.newInstance();
			
			Method[] methods =  cls.getDeclaredMethods();
			for( int i = 0 ; i < methods.length ; i++ )
				System.out.println("Method Name : "+methods[i].getName());
			
			Method m = cls.getMethod("setId", new Class[] {int.class} );
			m.invoke(obj, new Object[] {1});
			m = cls.getMethod("setName", new Class[] {String.class} );
			m.invoke(obj, new Object[] {"Homer"});
			
			System.out.println("*****************");
			System.out.println(obj+" "+obj.getClass().getSimpleName());
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}

	}

}
