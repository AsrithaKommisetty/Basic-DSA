package fat.prep;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> mark=new HashMap<String, Integer>();
		mark.put("oops", 98);
		mark.put("cn", 78);
		mark.put("dbms", 88);
		mark.put("oops", 66);
		
		System.out.println(mark);
		
		System.out.println(mark.get("cn"));
		
		mark.remove("dbms");
		System.out.println(mark);
		
		mark.remove("cn",88);
		System.out.println(mark);
		
		System.out.println(mark.containsKey("cn"));
		System.out.println(mark.containsValue(78));
		
		Set s=mark.entrySet();
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> me=(Map.Entry)i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		//display names of subject where marks >75
		System.out.println("display names of subject where marks >75");
		s=mark.entrySet();
		i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> me=(Map.Entry)i.next();
			int val=(int)me.getValue();
			if(val >75) {
				System.out.println(me.getKey());
			}
		}

	}

}
