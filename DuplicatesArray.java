package ArrayBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesArray {

	public static void main(String[] args) {

String names[]= {"Roney","Rifat","Rahat","Adnan","Rahat","Jisa","Rifat"};

int num[]= {3,5,7,6,3,4};

for(int i=0;i<names.length;i++) {
	          for(int j=i+1;j<names.length;j++) {
		if(names[i].equals(names[j])) {
		
		//System.out.println("Duplicate element is "+ names[i]);
	      
		}
		
	}
  }

	
Set<String> cousin= new HashSet<String>();

for(String name : names) {
	
if(cousin.add(name)==false) {
		
		System.out.println("Duplicate element is "+ name);
	}
	
}

HashMap<Integer, Integer> map = new HashMap<>();
for (int element : num) 
{   
if(map.get(element) == null)
{
map.put(element, 1);
}
else
{
map.put(element, map.get(element)+1);
}
}
Set<Entry<Integer, Integer>> entrySet = map.entrySet();
for (Entry<Integer, Integer> entry : entrySet) 
{               
if(entry.getValue() > 1)
{
System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
}
}

}
	
}
