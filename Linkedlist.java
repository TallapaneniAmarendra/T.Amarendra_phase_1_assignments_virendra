package AssistedProject;
import java.util.Iterator;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String a[]){
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Amar");  
	      names.add("tarak");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       

		
	}
}
}
 
