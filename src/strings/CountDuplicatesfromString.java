package strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesfromString {

	
	public static void main(String[] args) {  

	    String input = "Big black bug bit a big black dog on his big black nose";  
	    HashMap<String, Integer> dupCount = new HashMap<>();

	       //Converts the string into lowercase  
	    input = input.toLowerCase();  

	    //Split the string into words using built-in function  
	    String words[] = input.split(" ");  


	   // System.out.println("Duplicate words in a given string : ");   
	    for(int i = 0; i < words.length; i++) { 
	        if(dupCount.containsKey(words[i])){
	            int cnt = dupCount.get(words[i]);
	            cnt = cnt + 1;
	            dupCount.put(words[i], cnt);        
	        }else{
	            dupCount.put(words[i], 0);
	        }
	    }

	    for(Map.Entry<String, Integer> test : dupCount.entrySet()){
	        if(test.getValue() > 1)  {
	            System.out.println("Duplicate words in a given string : " +test.getKey() + " : " + test.getValue());
	        }
	    }}}
