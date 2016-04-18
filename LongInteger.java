

public class LongInteger {

	// DO NOT CHANGE OR REMOVE THIS LINE (UNTIL STEP 3)
	private SimpleList list = new SLLSimpleList();

	// private SimpleList<? extends Position> list = new ArraySimpleList();

	private Boolean isNegative;
	int digitcount, sizee = 0;
	String outpt;

	public LongInteger(String s) {
		// System.out.println(s);
		this.outpt = s;
		int i;
		
		if (s.charAt(0) == '-') {
			isNegative = true;
		}

		else {

			isNegative = false;
		}

		if (s.charAt(0) == '-') {

			s = s.substring(1);
		}

		digitcount = s.length();

		int len = s.length();
		if ((len % 4) == 0) {

			for (i = len; i >= 3; i--) {
				String b = s.substring(i - 4, i);
				int food = Integer.parseInt(b);

				list.insertLast(food);
				i = i - 3;
				sizee++;
			}
		} else {
			int d, f, g, h;
			for (d = 1; d < 4; d++) {
				f = len + d;

				if (f % 4 == 0) {

					for (h = 0; h < (f - len); h++) {

						s = "0" + s;

					}

				}

			}

			// System.out.println(s);
			int nlen = s.length();

			for (i = nlen; i >= 3; i--) {
				String b = s.substring(i - 4, i);
				int food = Integer.parseInt(b);

				list.insertLast(food);
				i = i - 3;
				sizee++;
			}

		}
		list.fsize(sizee);
	}

	public LongInteger() {

		int a = 2222;

	}

	public void listprint() {

		Position temp =  list.first();

		while (temp != null) {
			
			System.out.format("%04d", temp.getValue());

			System.out.print("->");

			temp = list.after(temp);

		}
		System.out.println();

	}

@SuppressWarnings("unchecked")
public void outtput() {

	/*	
	  Position p;
		if(list.size()>1){
			p = list.last();
		
		if(this.getSign()){
			System.out.print("-");
		}
		
		System.out.print(String.format("%04d",p.getValue()));
		while(list.before(p)!=null){
			System.out.print(String.format("%04d",list.before(p).getValue()));
		
			p = list.before(p);
		}
		
	}
		else if(list.size() == 1){
			if(this.getSign()){
				System.out.print("-");
			}
			p = list.first();
			System.out.print(p.getValue());
			System.out.println();
		}*/
	System.out.println(outpt);
	
	}
	
	public void output() {

		Boolean si = getSign();


		SLLNode temp = (SLLNode) list.first();
		SLLNode previousNode=null;  
		  SLLNode nextNode;
		  SLLNode temp1;
		  SLLNode head;
		  while(temp!=null)  
		  {  
		   nextNode=temp.getNext();
		   temp.setNext(previousNode);
		   previousNode= temp;
		   temp=nextNode;
		  }
		 head = previousNode; 

		 if (si == true){
	System.out.print("-");
		 while (head != null) {
			 if(head == list.last()){
				System.out.print( head.getValue());
				
				head = head.getNext();
				}
			 else {
					System.out.format("%04d",head.getValue());
					head = head.getNext();
				}	
		 }
			System.out.println();
}
else {
	while (head != null) {
		if(head == list.last()){
		System.out.print( head.getValue());
	
		head = head.getNext();
}
		else {
			System.out.format("%04d",head.getValue());
			head = head.getNext();
		}
		
	}
	System.out.println();
}
	
	}

	public void setSign(String str) {

		if (str.charAt(0) == '-') {
			isNegative = true;
		}

		else {

			isNegative = false;
		}

	}

	public boolean getSign() {

		return isNegative;
	}

	public int getDigitCount() {

		return digitcount;

	}

	@SuppressWarnings("unchecked")
	public boolean equalTo(LongInteger i) {

		int coun = i.getDigitCount();
		Boolean isNeg = i.getSign();

		if ((coun == digitcount) && isNeg == isNegative) {

			// System.out.println("value =" + i.list.first().getValue());

			// System.out.println("value =" + list.first().getValue());
			Position a =  i.list.first();
			Position b =  list.first();
			while (a != null && b != null) {
				if (a.getValue() != b.getValue())
					return false;

				a = i.list.after(a);
				b = this.list.after(b);
			}

			return true;

		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean lessThan(LongInteger i) {

		int coun = i.getDigitCount();
		Boolean isNeg = i.getSign();
		
		
		if ((coun == digitcount)) {

			// System.out.println("value =" + i.list.first().getValue());

			// System.out.println("value =" + list.first().getValue());
			Position a =  i.list.first();
			Position b =  list.first();
			while (a != null && b != null) {
				if (a.getValue() > b.getValue())
					return true;

				a = i.list.after(a);
				b = this.list.after(b);
			}

			return false;

		} else if (coun > digitcount) {
			return true;
		} else {
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	public boolean greaterThan(LongInteger i) {

		int coun = i.getDigitCount();
		Boolean isNeg = i.getSign();

		if ((coun == digitcount)) {

			Position a =  i.list.first();
			Position b =  list.first();
			while (a != null && b != null) {
				if (a.getValue() < b.getValue())
					return true;

				a = i.list.after(a);
				b = this.list.after(b);
			}

			return false;

		} else if (coun < digitcount) {
			return true;
		} else {
			return false;
		}

	}

	
	@SuppressWarnings("unchecked")
	public LongInteger add(LongInteger i) {

		Position b =  i.list.first();
		Position a =  list.first();
		int u, initsum = 0, carry = 0, sum;
		Position head = null;
		Position tail = null;
    
		UtilityOperations uo = new UtilityOperations();
		LongInteger object = new LongInteger();
		SimpleList result = object.list;
        Boolean sig = this.getSign();
        Boolean sig2 = i.getSign();
        
        int insign = sig.compareTo(sig2);         
	      
        // if (gre == true){
      
     // WHEN A & B ARE OF SAME SIGNS 
       if(insign == 0){
    	// when both A & B ARE POSITIVE THEN PERFORM A-B 	   
 if (sig == false){
        
		
		int temp = 0;
		while (a != null || b != null) {
			if (a != null && b != null) {
				temp += (Integer) a.getValue() + (Integer) b.getValue();
				carry = uo.overflow(temp);
				u = uo.underflow(temp);

				temp = carry;
				result.insertLast(u);
				
				
				a = this.list.after(a);
				b = i.list.after(b);
			} else {
				if (a != null) {
					temp += (Integer) a.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					a = this.list.after(a);
				}
				if (b != null) {
					temp += (Integer) b.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					b = i.list.after(b);
				}
			}
		}

		 if (carry > 0 ){
			 result.insertLast(carry);
		 }
        
        }
 // when both A & B ARE NEGATIVE THEN PERFORM B-A
       else if (sig == true){
	 int temp = 0;
		while (a != null || b != null) {
			if (a != null && b != null) {
				temp += (Integer) a.getValue() + (Integer) b.getValue();
				carry = uo.overflow(temp);
				u = uo.underflow(temp);

				temp = carry;
				result.insertLast(u);
				a = this.list.after(a);
				b = i.list.after(b);
			} else {
				if (a != null) {
					temp += (Integer) a.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					a = this.list.after(a);
				}
				if (b != null) {
					temp += (Integer) b.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					b = i.list.after(b);
				}
			}
		}

		 if (carry > 0 ){
			 result.insertLast(carry);
		 }
 }
	 
 }
    // when A IS POSITIVE AND B IS NEGATIVE, i.e sig: false, sig2: true
       
       else if(insign <  0){
    	   int borrow = 0;

    		  int temp = 0; 
    		  while(a != null || b != null) { 
    			  
    			  if(a != null && b != null)
    		  { 
    		  if (a.getValue() >= b.getValue()){ 
    		  temp =borrow + (Integer)a.getValue()-(Integer)b.getValue();
    		  borrow =0;
    		  result.insertLast(temp);
    		  
    		  } 
    		  
    		  else {
    	          if(this.list.after(a) != null){
    	        	  
    	        	  String s = Integer.toString(a.getValue());
    	        	  String f = "1" + s;
    	        	  int g = Integer.parseInt(f);
    	                temp = Math.abs(borrow + g - b.getValue());
    	               
    	        	  borrow = -1;
    	        	  
    	                result.insertLast(temp);
    	               
    	          }else if (this.list.after(a) == null){
    	        	 temp = borrow + (Integer)b.getValue()-(Integer)a.getValue();
    	    		  
    	        	  borrow =0;
    	    		  result.insertLast(temp);
    	          }
    	           }
    		 a = this.list.after(a);
    		 b = i.list.after(b);
    		  }
    		   
    		  
    		 else { 
    		  if(a != null) 
    		  {
    		  
    		  temp = Math.abs(borrow + (Integer)a.getValue());
    		  
    		  result.insertLast(temp);
    		  
    		  
    		  a = this.list.after(a); 
    		  } 
    		  if(b != null) {
    		  
    		  temp = Math.abs(borrow + (Integer)b.getValue());
    		  
    		  result.insertLast(temp);
    		  
    		  b = i.list.after(b); 
    		  } 
    		  } 
    		  
    		  }
    	   
       }
    // when A IS NEGATIVE AND B IS POSITIVE i.e sig: true, sig2: false
       else if(insign >  0){
    	   int borrow = 0;

 		  int temp = 0; 
 		  while(a != null || b != null) { 
 			  
 			  if(a != null && b != null)
 		  { 
 		  if (a.getValue() >= b.getValue()){ 
 		  temp =borrow + (Integer)a.getValue()-(Integer)b.getValue();
 		  borrow =0;
 		  result.insertLast(temp);
 		  
 		  } 
 		  
 		  else {
 	          if(this.list.after(a) != null){
 	        	  
 	        	  String s = Integer.toString(a.getValue());
 	        	  String f = "1" + s;
 	        	  int g = Integer.parseInt(f);
 	                temp = Math.abs(borrow + g - b.getValue());
 	               
 	        	  borrow = -1;
 	                result.insertLast(temp);
 	               
 	          }else if (this.list.after(a) == null){
 	        	 temp = borrow + (Integer)b.getValue()-(Integer)a.getValue();
 	    		  
 	        	  borrow =0;
 	    		  result.insertLast(temp);
 	          }
 	           }
 		 a = this.list.after(a); 
 		b = i.list.after(b);
 		  }
 		  
 		  
 		 else { 
 		  if(a != null) 
 		  {
 		  
 		  temp = borrow + (Integer)a.getValue();
 		  
 		  result.insertLast(temp);
 		  
 		  
 		 a = this.list.after(a); 
 		  } 
 		  if(b != null) {
 		  
 		  temp = borrow + (Integer)b.getValue();
 		  
 		  result.insertLast(temp);
 		  
 		  b = i.list.after(b); 
 		  } 
 		  } 
 		  
 		  }
    	   
       }
		return object;

	}

	
	
	
	 @SuppressWarnings("unchecked")
	public LongInteger subtract(LongInteger i) {
	  
		 Position b =  i.list.first();
			Position a =  list.first();
			int u, initsum = 0, carry = 0, sum;
			Position head = null;
			Position tail = null;
	    
			UtilityOperations uo = new UtilityOperations();
			LongInteger object = new LongInteger();
			SimpleList result = object.list;
	        Boolean sig = getSign();
	        Boolean sig2 = i.getSign();
	       
	        
	        int borrow = 0;
	      int insign = sig.compareTo(sig2);         
	      
	       
	      
	     // WHEN A & B ARE OF SAME SIGNS 
	       if(insign == 0){
	    	// when both A & B ARE POSITIVE THEN PERFORM A-B 	   
	 if (sig == false){
	 
	  int temp = 0; 
	  while(a != null || b != null) { 
		  
		  if(a != null && b != null)
	  { 
	  if (a.getValue() >= b.getValue()){ 
	  temp =borrow + (Integer)a.getValue()-(Integer)b.getValue();
	  borrow =0;
	  result.insertLast(temp);
	  
	  } 
	  
	  else {
          if(this.list.after(a) != null){
        	  
        	  String s = Integer.toString(a.getValue());
        	  String f = "1" + s;
        	  int g = Integer.parseInt(f);
                temp = Math.abs(borrow + g - b.getValue());
               
        	  borrow = -1;
                result.insertLast(temp);
               
          }else if (this.list.after(a) == null){
        	 temp = Math.abs(borrow + (Integer)b.getValue()-(Integer)a.getValue());
    		  
        	  borrow =0;
    		  result.insertLast(temp);
          }
           }
	  a = this.list.after(a); 
	  b = i.list.after(b);
	  }
	 
	  
	 else { 
	  if(a != null) 
	  {
	  
	  temp = Math.abs(borrow + (Integer)a.getValue());
	  
	  result.insertLast(temp);
	  
	  
	  a = this.list.after(a); 
	  } 
	  if(b != null) {
	  
	  temp = Math.abs(borrow + (Integer)b.getValue());
	  
	  result.insertLast(temp);
	  
	  b = i.list.after(b); 
	  } 
	  } 
	  
	  }
	  
	 }
	 // when both A & B ARE NEGATIVE THEN PERFORM B-A
	 else if(sig == true){
		 
		 int temp = 0; 
		  while(b != null || a != null) { 
			  
			  if(b != null && a != null)
		  { 
		  if (b.getValue() >= a.getValue()){ 
		  temp =borrow + (Integer)b.getValue()-(Integer)a.getValue();
		  borrow =0;
		  result.insertLast(temp);
		  
		  } 
		  
		  else {
	          if(i.list.after(b) != null){
	        	  
	        	  String s = Integer.toString(b.getValue());
	        	  String f = "1" + s;
	        	  int g = Integer.parseInt(f);
	                temp = Math.abs(borrow + g - a.getValue());
	               
	        	  borrow = -1;
	                result.insertLast(temp);
	               
	          }else if (i.list.after(b) == null){
	        	 temp = Math.abs(borrow + (Integer)a.getValue()-(Integer)b.getValue());
	    		  
	        	  borrow =0;
	    		  result.insertLast(temp);
	          }
	           }
		 b = i.list.after(b); 
		  a = this.list.after(a);
		  }
		 
		  
		 else { 
		  if(b != null) 
		  {
		  
		  temp = Math.abs(borrow + (Integer)b.getValue());
		  
		  result.insertLast(temp);
		  
		  
		  b = i.list.after(b); 
		  } 
		  if(a != null) {
		  
		  temp = Math.abs(borrow + (Integer)a.getValue());
		  
		  result.insertLast(temp);
		  
		  a = this.list.after(a); 
		  } 
		  } 
		  
		  }
		 
	 }
	       }
	    // when A IS POSITIVE AND B IS NEGATIVE, i.e sig: false, sig2: true
	       else if(insign <  0){
	    	   
	    	   int temp = 0;
	   		while (a != null || b != null) {
	   			if (a != null && b != null) {
	   				temp += (Integer) a.getValue() + (Integer) b.getValue();
	   				carry = uo.overflow(temp);
	   				u = uo.underflow(temp);

	   				temp = carry;
	   				result.insertLast(u);
	   				a = this.list.after(a);
	   				b = i.list.after(b);
	   			} else {
	   				if (a != null) {
	   					temp += (Integer) a.getValue();
	   					carry = uo.overflow(temp);
	   					u = uo.underflow(temp);

	   					temp = carry;
	   					result.insertLast(u);
	   					a = this.list.after(a);
	   				}
	   				if (b != null) {
	   					temp += (Integer) b.getValue();
	   					carry = uo.overflow(temp);
	   					u = uo.underflow(temp);

	   					temp = carry;
	   					result.insertLast(u);
	   					b = i.list.after(b);
	   				}
	   			}
	   		}

	   		 if (carry > 0 ){
	   			 result.insertLast(carry);
	   		 }
	           
	           }
	       
	       // when A IS NEGATIVE AND B IS POSITIVE i.e sig: true, sig2: false
	       else if(insign >  0){
	    	   
	    	   int temp = 0;
		   		while (a != null || b != null) {
		   			if (a != null && b != null) {
		   				temp += (Integer) a.getValue() + (Integer) b.getValue();
		   				carry = uo.overflow(temp);
		   				u = uo.underflow(temp);

		   				temp = carry;
		   				result.insertLast(u);
		   				a = this.list.after(a);
		   				b = i.list.after(b);
		   			} else {
		   				if (a != null) {
		   					temp += (Integer) a.getValue();
		   					carry = uo.overflow(temp);
		   					u = uo.underflow(temp);

		   					temp = carry;
		   					result.insertLast(u);
		   					a = this.list.after(a);
		   				}
		   				if (b != null) {
		   					temp += (Integer) b.getValue();
		   					carry = uo.overflow(temp);
		   					u = uo.underflow(temp);

		   					temp = carry;
		   					result.insertLast(u);
		   					b = i.list.after(b);
		   				}
		   			}
		   		}

		   		 if (carry > 0 ){
		   			 result.insertLast(carry);
		   		 }
		           
	    	   
	       }
	       
	  return object; 
	  }
	 
@SuppressWarnings("unchecked")
public LongInteger add2(LongInteger i){
	


		Position b =  i.list.first();
		Position a =  list.first();
		int u, initsum = 0, carry = 0, sum;
		Position head = null;
		Position tail = null;
    
		UtilityOperations uo = new UtilityOperations();
		LongInteger object = new LongInteger();
		SimpleList result = object.list;
        Boolean sig = false;
        Boolean sig2 = false;
        
        	   
 int temp = 0;
		while (a != null || b != null) {
			if (a != null && b != null) {
				temp += (Integer) a.getValue() + (Integer) b.getValue();
				carry = uo.overflow(temp);
				u = uo.underflow(temp);

				temp = carry;
				result.insertLast(u);
				
				
				a = this.list.after(a);
				b = i.list.after(b);
			} else {
				if (a != null) {
					temp += (Integer) a.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					a = this.list.after(a);
				}
				if (b != null) {
					temp += (Integer) b.getValue();
					carry = uo.overflow(temp);
					u = uo.underflow(temp);

					temp = carry;
					result.insertLast(u);
					b = i.list.after(b);
				}
			}
		}

		 if (carry > 0 ){
			 result.insertLast(carry);
		 }
		 return object;
        }
	
	

	  @SuppressWarnings("unchecked")
	public LongInteger multiply(LongInteger i) {
		 
		  LongInteger mulRes = new LongInteger();

		  UtilityOperations UO = new UtilityOperations();

		  int bNode = 0;int uNode = 0;
		  int mulOF = 0;int carry = 0;
		  int Znode = 0;int mulTemp = 0;

		  Position RNode =  i.list.first();



		  while (RNode != null) {

		  bNode = RNode.getValue();

		  LongInteger tempRes = new LongInteger();

		  Position LNode =  list.first();



		  while (LNode != null) {



		  if (list.isFirst(LNode)) {

		  for (int Index = 0; Index < Znode; Index++) {

		  tempRes.list.insertLast(0);

		  }

		  }


		  uNode = LNode.getValue();

		  mulTemp = (bNode * uNode) + carry;



		  carry = UO.overflow(mulTemp);

		  mulOF = UO.underflow(mulTemp);



		  tempRes.list.insertLast(mulOF);



		  if (this.list.after(LNode) == null) {

		  tempRes.list.insertLast(carry);

		  carry = 0;

		  }

		  LNode = this.list.after(LNode);

		  }
		  mulRes = mulRes.add2(tempRes);

		  RNode = i.list.after(RNode);

		  Znode = Znode + 1;

		  }

		  return mulRes;
		  
		 
		  }
	  
	  public LongInteger power(int p) {
		 
		 	  LongInteger pow = new LongInteger();
		  
		  if(p>=5){
			  
			  pow = this.multiply(this);
			  pow = pow.multiply(pow);
			  pow = pow.multiply(this);
		  }
		  if(p>=10)
		  {
			  pow = pow.multiply(pow);
			  if(p == 20){
				  pow = pow.multiply(pow);
			  }
			  if(p==30){
				  
				  pow = pow.multiply(pow).multiply(pow);
				  
			  }
			  
		  }
		 
		  
	  return pow;
	  }
	 

}
