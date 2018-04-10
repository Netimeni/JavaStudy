
class FindNatNum {
 public static void main(String args []) {
 int a;

 for(a=2; a<=100; a++) {
 	 if((a==2)||
	(a==3)||
	(a==5)||
	(a==7)||
  	((a%2 != 0)&& 
  	(a%3 != 0)&&
  	(a%5 != 0)&& 
 	(a%7 != 0))) 
 System.out.println(a);
}
// System.out.println();
  
 }
}   

