
public class UtilityOperations {
    
    public static int overflow(int t) {
      
    	if(t>9999){
    //	int num;
          		t = t/10000;
          	//	num = t%10000;
    		 // return num;
          		return t;
    	}
    	else {
    		return 0;
    	}
    	
 }
    
    public static int underflow(int t) {
    	
    	
        	int num;
             
              		num = t%10000;
        		  return num;
        	}
        	
        
    public static int digits(int t) {
        
    	int n = t;
    	int length = (int)(Math.log10(n)+1);
    	
    	return length;
    
    }
    
}

