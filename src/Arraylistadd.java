

import java.util.ArrayList;

public class Arraylistadd {
	 public static void main(String args[])
		{
		 
		 ArrayList al=new ArrayList();
		 
		 System.out.println(al.size());
		 
		 al.add("welcome");
		 al.add(10);
		 al.add(10.142);
		 al.add('c');
		 
		 System.out.println("elements in the arraylist are :" +al);
		 
		 System.out.println(al.size());
		 
		 al.add(2,"training");
		 al.add(1,1234);
		 System.out.println(al.size());
		 System.out.println("elements in the arraylist are :" +al);
		 
		 al.remove(10.142);
		 System.out.println("elements in the arraylist are :" +al);
		 
		 

}
}