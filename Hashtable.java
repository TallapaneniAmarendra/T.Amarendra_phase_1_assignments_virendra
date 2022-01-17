package AssistedProject;

import java.util.Hashtable;

class HashTableExample{
	public static void main(String[] args){
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"Amar");
        ht.put(2,"Tarak");
        ht.put(3,"charan");
		
		
        System.out.println("Hashtable is "+ht);
        System.out.println("Value of key 2: "+ht.get(2));
        System.out.println("Size of the Hashtable is  "+ht.size());
    }
}