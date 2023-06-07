package exceptionhandling;

public class TryCatchExample1 {  
    
    public static void main(String[] args) {  
          
        int data=50/0; //may throw exception   
          
        System.out.println("rest of the code");  
          
    }  
      
}  

/*
 * There might be 100 lines of code after the exception. If the exception is not
 * handled, all the code below the exception won't be executed.
 */