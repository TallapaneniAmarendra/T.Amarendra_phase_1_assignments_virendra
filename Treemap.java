package AssistedProject;
import java.util.TreeMap;

public class Treemap{
    public static void main(String[] args) {
    	
        TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
        marks.put("Student1", 120);
        marks.put("Student3", 99);
        marks.put("Student5", 130);
        
        
        for(String key: marks.keySet()){
			System.out.println(key  +" : "+ marks.get(key));
        }
    }
}





