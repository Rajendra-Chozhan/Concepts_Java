package topics;

public class TestFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try{  
			   int data=25/5;  
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e)
		 {
				  System.out.println(e);
		 }  
			  finally{
				  System.out.println("finally block is always executed");
				  }  
			  System.out.println("rest of the code...");  
			  }  

}
