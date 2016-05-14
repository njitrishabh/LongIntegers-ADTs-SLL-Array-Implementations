
public class SLLSimpleList implements SimpleList<SLLNode> {

    private SLLNode head;
	private SLLNode tail;
	// private static int len = 0;
	 int len;
    public SLLSimpleList() {
   
        
    	
    }
    
    
    public void insertFirst(int value) {
    	 
    	SLLNode node = new SLLNode(value);
        
    	if(head==null)
    	{
    	
    		head=node;
    		
    		tail = node;
    		
    	//len++;	
    	}
    	else
    	{
    		
    		
    		head.setNext(node);
    		
    		head=node;
    		
    	//len++;
    	}
	
    }
    
    
    public void insertLast(int value) {
        
    	SLLNode node = new SLLNode(value);
        
        	if(head==null)
        	{
        		head=node;
        		
        		tail = node;
        	//	len++;
        		
        	}
        	else
        	{
        
        		
        	  	tail.setNext(node);
        	  	tail=node;
        //	len++;
        	//System.out.println(node.getValue());
        	
        	}
    	
    }
    
    
    public SLLNode first() {
   
    	
    	return head;
    	
    }

    public SLLNode last() {
    
    return tail;    
    }

    public boolean isFirst(SLLNode p) {
        
  if(p == head){
	  
	  return true;
  }
  else {
	  
	  return false;
  }
  
    }

    public boolean isLast(SLLNode p) {
    	if(p == tail){
    		  
    		  return true;
    	  }
    	  else {
    		  
    		  return false;
    	  }
    	
    }

   public SLLNode before(SLLNode p) {

	   SLLNode currentnode = first();
	   SLLNode ab = null;
	 if( p == head){
		 return null;
	 }
	 else {
		 
		 while(currentnode.getNext() != null){
		       if(currentnode.getNext() == p)
		          ab = currentnode;
		       else
		          currentnode = currentnode.getNext();
		   return null;
		 }
	 return ab;
	 }
	   
	   
    }

 public SLLNode after(SLLNode p) {

	 if(p == tail){
		 return null;
	 }
	 else {
 SLLNode aft;
 aft = p.getNext();
 
 return aft;
	 }
 }

    public boolean isEmpty() {
        
    if(head == null){
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

