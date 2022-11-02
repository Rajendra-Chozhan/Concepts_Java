package strings;

import java.util.Scanner;

public class RemoveVowels {

	
	public static void main(String[] args) {
		String c= "";
		String vowel= "aeiouAEIOU";
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		
		
		for( int i=0;i< s.length();i++){
			
			
		if( vowel.indexOf(s.charAt(i)) ==-1){
		c+=s.charAt(i);
		}
		}
		System.out.println(c);
		}
}
