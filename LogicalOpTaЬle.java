// Упражнение 2.2
// Отображение таблицы истиности  для логической операции
class LogicalOpTaЬle {
 public static void main(String args []) {
  boolean p, q;
  int a, b;
   System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
  
   p = true; q = true;
   System.out.print(p + "\t" +q + "\t");
   System.out.print((p&q) +"\t" +(p|q) +"\t");
   System.out.println((p^q) +"\t" +(!p));
   
   p = true; q = false;
   System.out.print(p + "\t" +q + "\t");
   System.out.print((p&q) +"\t" +(p|q) +"\t");
   System.out.println((p^q) +"\t" +(!p));
   
   p = false; q = true;
   System.out.print(p + "\t" +q + "\t");
   System.out.print((p&q) +"\t" +(p|q) +"\t");
   System.out.println((p^q) +"\t" +(!p));
   
   p = false; q = false;
   System.out.print(p + "\t" +q + "\t");
   System.out.print((p&q) +"\t" +(p|q) +"\t");
   System.out.println((p^q) +"\t" +(!p));

 }
} 
