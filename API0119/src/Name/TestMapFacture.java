package Name;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapFacture {
public static void main(String[] args) {
	List<String>legs1Cabin = new ArrayList<String>();
	legs1Cabin.add("lowFare");
	legs1Cabin.add("first");
	
	List<String>legs2Cabin = new ArrayList<String>();
	legs2Cabin.add("first");
	legs2Cabin.add("bedroom");
	
	List<String>legs3Cabin = new ArrayList<String>();
	legs1Cabin.add("lowFare");
	legs3Cabin.add("first");
	legs3Cabin.add("bedroom");
	
	Map<String,List<String>> legtoclass = new HashMap<String,List<String>>();
	legtoclass.put("legs1", legs1Cabin);
	legtoclass.put("legs2", legs2Cabin);
	legtoclass.put("legs3", legs3Cabin);
	
	for(String info:legtoclass.keySet()){
		System.out.println(info +"");
		System.out.println(legtoclass.get(info));
	}
}
}
