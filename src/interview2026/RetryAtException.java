package interview2026;

public class RetryAtException {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
		    try {
		    	//button.click();//main requirement
		        throw new Exception(); // This forces an immediate jump to the catch block
		        //String s = null; s.length();
		        //int x = 10 / 0;
		    }
		    catch(Exception e){
		        System.out.println("In Catch Block: "+i);
		        // Note: Your original code has an extra i++, which will make it skip iterations
		    }
		}
	}
}
