package ArrayBasic;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateArrayStringMap {

	public static void main(String[] args) {
		String names[]= {"Roney","Rifat","Rahat","Adnan","Rahat","Jisa","Rifat"};

		HashMap<String, Integer> map = new HashMap<>();
		for (String name : names) 
		{   
		if(map.get(name) == null)
		{
		map.put(name, 1);
		}
		else
		{
		map.put(name, map.get(name)+1);
		}
		
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		//System.out.println(entrySet);
		for (Entry<String, Integer> entry : entrySet) 
		{  
		
			//System.out.println(entry.getKey());	
			
		
		
			if(entry.getValue() > 1)
			{
			System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
			
			}
		
		
		}
		}
		

}
