

public class ArraySimpleList implements SimpleList<ArrayEntry> {
	
	// # of positions in the list
	private int n = 0;
	
	// Current size of array
	private int arraySize = 10;
	
	int len;
	

    
	public ArraySimpleList() {
        
		n = 0;
        arraySize = 10;
    
    }
	ArrayEntry e[] = new ArrayEntry[arraySize+10];
    
    public void insertFirst(int value) {
    	
    	if(n==0){    		
    		e[0] = new ArrayEntry(value,n);
    		n++;    		
    	}
    	
    	else{
    		
    		ArrayEntry e1[] = new ArrayEntry[arraySize];
    		e1= e;
    		
    		if(n==arraySize){
    			
    			e= new ArrayEntry[arraySize*2];
    			arraySize = arraySize*2;
    		}
    		
    		e[0] = new ArrayEntry(value,0);
    //		System.arraycopy(e1, 0, e, 0, arraySize);
    		for(int i = 1;i<=arraySize;i++){
    				e[i] = e1[i];
    				if(i==e1.length){

    					i = arraySize+1;
    			}    			
    		
    		
    		n++;
    		
    		}
    		
    		
    		
    	}
    		
    		
    		
    	}
    public void insertLast(int value) {
    
    	
    	 
if(n==0){    	
    		
    		e[0] = new ArrayEntry(value,n);
    		n++;    		
    	}
    	
    	else{
    		if(n==arraySize){
    				ArrayEntry e1[] = new ArrayEntry[arraySize];
    	    		e1= e;
    				e= new ArrayEntry[arraySize*2];
    				for(int i = 0;i<arraySize;i++){
    					
        				e[i] = e1[i];
        				if(i==e1.length){

        					i = arraySize+1;
        				} 
        				
    				}
    				arraySize = arraySize*2;
    				}
    			e[n] = new ArrayEntry(value,n);
    			n++;
        		
    	}
    }
    
    
    public ArrayEntry first() {
    	
    	
    	return e[0];
    }

    public ArrayEntry last() {
        return e[n-1];
    }

    public boolean isFirst(ArrayEntry p) {
    	 if(p == e[0]){
    		  
    		  return true;
    	  }
    	  else {
    		  
    		  return false;
    	  }
    	        
    }

    public boolean isLast(ArrayEntry p) {
    	if(p == e[n-1]){
  		  
  		  return true;
  	  }
  	  else {
  		  
  		  return false;
  	  }
    }

    public ArrayEntry before(ArrayEntry p) {
    	int ind;
  	 if( p == e[0]){
  		 return null;
  	 }
  	else {
  	     
  	    ind = p.getIndex();
  	    	 ind--;
  	    	 }
  	    return e[ind];
    }

    public ArrayEntry after(ArrayEntry p) {
   int ind;
    	if(p == e[n-1]){
    		 return null;
    	 }
    	 else {
     
    ind = p.getIndex();
    	 ind++;
    	 }
    return e[ind];
    	 
    }

    public boolean isEmpty() {
    	if(e[0] == null){
        	return true;
        }
        else {
        	return false;
        }      
    }

    public void fsize(int t){
    	len = t;
    }
    public int size() {
        
    
    return len;
    }
    
}

