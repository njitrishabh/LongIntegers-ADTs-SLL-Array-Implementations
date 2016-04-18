

import java.io.*;

public class pmain {

public static void main(String args[])throws IOException{
	
	String strarr[] = {"2222", "99999999","-246813575732","180270361023456789","1423550000000010056810000054593452907711568359","-350003274594847454317890",
"29302390234702973402973420937420973420937420937234872349872934872893472893749287423847",
"-98534342983742987342987339234098230498203894209928374662342342342356723423423",
"8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612"
	};
	


	LongInteger cobj[] = new LongInteger[9];
	
	for(int j =0; j<9; j++){	
	
	cobj[j]= new LongInteger(strarr[j]);
	
	}
	

	//SLLNode node = new SLLNode (1);
	SLLSimpleList obj2 = new SLLSimpleList();
	
	for(int y=0; y<9; y++){
	cobj[y].listprint();
	cobj[y].setSign(strarr[y]);	
	cobj[y].outtput();
	
	
	System.out.println("isNegative =" + cobj[y].getSign());
	System.out.println("digit_count =" + cobj[y].getDigitCount());
	System.out.println();
	}
	
	char alphabet = '@';
	char alpha = 'A';    
	for(int i=0; i<9; i++){
		
		alphabet++;
		
		System.out.println("comparing " + alphabet + " to each Long Integers");
		System.out.println();
		for(int x=0; x<9; x++){
			System.out.println("comparing " + alphabet + "-" + alpha++ );
			System.out.println("equal to = " + cobj[i].equalTo(cobj[x]));
			System.out.println("lessThan = " + cobj[i].lessThan(cobj[x]));
			System.out.println("greaterThan = " + cobj[i].greaterThan(cobj[x]));
			
						
		}
		
				alpha ='A';
		System.out.println();
		
		}
	
	int a = 2222;
	int b = 99999999;
	UtilityOperations obj3 = new UtilityOperations();

	System.out.println("overflow A =" + obj3.overflow(a));
	System.out.println("overflow B =" + obj3.overflow(b));
	System.out.println("underflow A =" + obj3.underflow(a));
	System.out.println("underflow B =" + obj3.underflow(b));
	System.out.println("no. of digits in A =" + obj3.digits(a));
	System.out.println("no. of digits in B =" + obj3.digits(b));


	System.out.println();
	System.out.println(" // PROJECT STEP-2 BEGINS //");
	System.out.println();
	// Setting sign for ADD function, ADD conditions begin
	LongInteger l9;
	char alphabe = '@';
	char alph = 'A';
	for(int k=0; k<9; k++){
alphabe++;
		
		System.out.println("adding " + alphabe + " to each Long Integers");
		
			System.out.println();
		for(int p=0; p<9; p++){
			System.out.println("adding " + alphabe + "+" + alph++ );
			l9 = cobj[k].add(cobj[p]);
		//	System.out.println("add = " + l9);
			
			 char addsign = strarr[k].charAt(0);
		 char addsign2 = strarr[p].charAt(0);
		 if(addsign == '-' && addsign2 != '-'){
			 
				l9.setSign(strarr[k]);
				l9.output(); 
		 }
		 else if (addsign == '-' && addsign2 == '-'){
			 
				l9.setSign(strarr[k]);
				l9.output(); 
		 }
		 else if(addsign != '-' && addsign2 == '-') {
			 
				l9.setSign(strarr[p]);
				l9.output(); 
		 }
		 else {
			 
				l9.setSign(strarr[k]);
				l9.output();
		 }
		}
		alph ='A';
		
		 System.out.println();
			
}
	// ADDITION conditions end	
	
	
	// Setting sign for subtract function, subtract conditions begin
	LongInteger l6;
	char alphab = '@';
	char alp = 'A';
	for(int i=0; i<9; i++){
alphab++;
		
		System.out.println("subtracting " + alphab + " to each Long Integers");
		
			System.out.println();
		for(int x=0; x<9; x++){
			System.out.println("subtracting " + alphab + "-" + alp++ );
			l6 = cobj[i].subtract(cobj[x]);
			
	 char subsign = strarr[i].charAt(0);
	 char subsign2 = strarr[x].charAt(0);
	 if(subsign == '-' && subsign2 != '-'){
		 
			l6.setSign(strarr[i]);
			l6.output(); 
	 }
	 else if (subsign == '-' && subsign2 == '-'){
		 
			l6.setSign("1111");
			l6.output(); 
	 }
	 else if(subsign != '-' && subsign2 == '-') {
		 
			l6.setSign(strarr[i]);
			l6.output(); 
	 }
	 else {
		 
			l6.setSign(strarr[i]);
			l6.output();
	 }
	 }
		alp ='A';
		
		 System.out.println();
			
}
// subtract conditions end	 

	// Multiplication conditions start
	LongInteger l3;
	char alppp = '@';
	char al = 'A';
	for(int i=0; i<9; i++){
alppp++;
		
		System.out.println("multiplying " + alppp + " to each Long Integers");
		
			System.out.println();
		for(int x=0; x<9; x++){
			System.out.println("multiplying " + alppp + "*" + al++ );
			l3 = cobj[i].multiply(cobj[x]);
	 char mulsign = strarr[i].charAt(0);
	 char mulsign2 = strarr[x].charAt(0);
	
	 if(mulsign == '-' && mulsign2 != '-'){
		 
			l3.setSign(strarr[i]);
			l3.output(); 
	 }
	 else if (mulsign == '-' && mulsign2 == '-'){
		 
			l3.setSign(strarr[0]);
			l3.output(); 
	 }
	 else if(mulsign != '-' && mulsign2 == '-') {
		 
			l3.setSign(strarr[x]);
			l3.output(); 
	 }
	 else {
		 
			l3.setSign(strarr[i]);
			l3.output();
	 }
		}
		al ='A';
		
		 System.out.println();
			
}
	// Multiplication conditions end
	
	// Power conditions start
	LongInteger l11;
	char alpp11 = '@';
	char all11 = 'A';
	for(int i=0; i<9; i++){
alpp11++;
if(strarr[i].charAt(0) == '-'){
		System.out.print( alpp11 + " power of 5 = ");
		
   l11=	cobj[i].power(5);
  
 l11.setSign("-1111");
	
 l11.output();
}	
else {
	System.out.print( alpp11 + " power of 5 = ");
	
	   l11=	cobj[i].power(5);
	  
	 l11.setSign("1111");
		
	 l11.output();
}
 all11 ='A';
	
		
}System.out.println();
	LongInteger l12;
	char alpp12 = '@';
	char all12 = 'A';
	for(int i=0; i<9; i++){
alpp12++;
		
		System.out.print( alpp12 + " power of 10 = ");
		
   l12=	cobj[i].power(10);
  
 l12.setSign("9999");
	l12.output();
	all12 ='A';
	
		
}
	System.out.println();	
	LongInteger l13;
	char alpp13 = '@';
	char all13 = 'A';
	for(int i=0; i<9; i++){
alpp13++;
		
		System.out.print( alpp13 + " power of 20 = ");
		
   l13=	cobj[i].power(20);
  
 l13.setSign("9999");
	l13.output();
	all13 ='A';
	
		
}System.out.println();
	LongInteger l14;
	char alpp14 = '@';
	char all14 = 'A';
	for(int i=0; i<9; i++){
alpp14++;
		
		System.out.print( alpp14 + " power of 30 = ");
		
   l14=	cobj[i].power(30);
  
 l14.setSign("9999");
	l14.output();
	all14 ='A';
	
		
}					System.out.println();
	
	 // Power conditions end
	

	System.out.println(" Test Case 5 ");
	System.out.println();
LongInteger J = cobj[1].add(cobj[2]);
J.setSign(strarr[1]);
	
LongInteger K = cobj[2].add(cobj[3]);
K.setSign(strarr[2]);
LongInteger L = cobj[8].add(cobj[8]);
L.setSign(strarr[8]);
LongInteger M = cobj[0].add(cobj[8]);
M.setSign(strarr[0]);

LongInteger N = cobj[1].add(K);
N.setSign("-1111");
System.out.print("K = ");
K.output();

LongInteger O = cobj[0].subtract(cobj[3]);
O.setSign(strarr[0]);
LongInteger P = cobj[2].subtract(cobj[3]);
P.setSign(strarr[2]);
LongInteger Q = cobj[3].subtract(cobj[2]);
Q.setSign(strarr[3]);



LongInteger R = L.subtract(L);
R.setSign("1111");
System.out.print("L = ");
L.output();
System.out.print("R = ");
R.output();


LongInteger S = P.subtract(O);
S.setSign("-1111");
System.out.print("S = ");
S.output();

LongInteger T = N.subtract(Q);
T.setSign("-1111");
System.out.print("T = ");
T.output();
System.out.print("Q = ");
Q.output();

LongInteger U = cobj[0].multiply(cobj[3]);
U.setSign("1111");
System.out.print("U = ");
U.output();

LongInteger V = cobj[1].multiply(cobj[2]);
V.setSign("-1111");
System.out.print("V = ");
V.output();

LongInteger W = cobj[3].multiply(cobj[3]);
W.setSign("1111");
System.out.print("W = ");
W.output();

LongInteger X = O.multiply(cobj[8]);
X.setSign("1111");
System.out.print("X = ");
X.output();
System.out.print("O = ");
O.output();

LongInteger Y = J.multiply(P);
Y.setSign("-1111");
System.out.print("Y = ");
Y.output();
System.out.print("J = ");
J.output();
System.out.print("P = ");
P.output();

LongInteger Z = M.multiply(N);
Z.setSign(strarr[0]);
System.out.print("Z = ");
Z.output(); 
System.out.print("M = ");
M.output();
System.out.print("N = ");
N.output();




}

}
