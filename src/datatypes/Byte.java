package datatypes;

public class Byte {
//1 byte ( 8 bits )
	//-128 to 127
	//Default = 0
	
	public static void main(String[] args) {
		byte a = 126;
		 
        // byte is 8 bit value
        System.out.println(a);
 
        a++;
        System.out.println(a);
 
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
 
        // Looping back within the range
        a++;
        System.out.println(a);
    

	}

}
