package task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
	
	public static void main (String[] args) {
		
		Map<Integer, Integer> records = new HashMap<>();
		String filePath = "/Users/mh/Desktop/NCSCoreJava/Collection Map Assignment/src/mapdemo.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
		    br.readLine(); // header 
		    String line;
		    
		    while ((line = br.readLine()) != null) {
		    	
		        String[] values = line.split(",");
		        try {
		    		int userId = Integer.parseInt(values[0]);
			        int costOfOrder = Integer.parseInt(values[1]);
			        if (!records.containsKey(userId)){
						records.put(userId,costOfOrder);						
					} else {
						records.put(userId, records.get(userId) + costOfOrder); 
					}
		    	} catch (NumberFormatException e) {
		    		System.out.println("Non-int userId" );
		    	}
		        
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(records);
		
	}

}