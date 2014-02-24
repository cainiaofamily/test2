package Name;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
public static void main(String[] args) {
	Map m = new HashMap();
	for(int i =0;i<args.length;i++){
		
		if(m.get(args[i])==null){
			m.put(args[i], 1);
			
		}else{
			
			m.put(args[i],(Integer)m.get(args[i]));
		}
		System.out.println("m");
	}
}
}
