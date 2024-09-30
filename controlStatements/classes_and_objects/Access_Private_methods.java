package classes_and_objects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Access_Private_methods {


		public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {// TODO Auto-generated method stub

//			Class ClassB= Class.forName("ClassA");
//			Object o= ClassB.newInstance();
//			Method m=ClassB.getDeclaredMethod("talk", null);
//			m.setAccessible(true);
//			m.invoke(o, null);
			
			
			Class c=ClassA.class;
			Object obj=c.newInstance();
			//Method mt=c.getDeclaredMethod("talk", null);
			Method[] we=c.getDeclaredMethods();
			System.out.println(we.length);
			
			
//				we[0]=c.getDeclaredMethod("talk", null);
//				we[1]=c.getDeclaredMethod("walk", null);
//				we[1].setAccessible(true);
//				we[1].invoke(obj, args);
				
				
				
			
			for(int i=1;i<we.length;i++)
			{
				
				we[i]=c.getDeclaredMethod(we[i].getName(), null);
				
				we[i].setAccessible(true);
				we[i].invoke(obj, args);
			}
			
			
			
		}

	}

	 class ClassA{
		
		protected static String name="raju";
		private static String age="28";
		
		public static void main(String[] args) {
			
		}
		
		private static void talk()
		{
			System.out.println("name= "+name + " age= "+age);
		}
		
		private static void walk()
		{
			System.out.println("can walk");
		}
	}
	
 
