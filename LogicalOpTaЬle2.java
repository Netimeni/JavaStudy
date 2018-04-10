// Упражнение 2.2
// Отображение таблицы истиности  для логической операции
class LogicalOpTaЬle2 {
 public static void main(String args []) {
  boolean p, q;
  int a=1, b=0; // Примем что true это "1", а false это "0"
   System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
  
   p = true; q = true;
     if(p) System.out.print(a + "\t"); 
       else System.out.print(b + "\t");
    
     if(q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
     
     if(p&q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
      
     if(p|q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(p^q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(!p) System.out.println(a + "\t");
       else System.out.println(b + "\t");
 
   
   p = true; q = false;
   if(p) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p&q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p|q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(p^q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(!p) System.out.println(a + "\t");
       else System.out.println(b + "\t");

   
   p = false; q = true;
     if(p) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p&q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p|q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(p^q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(!p) System.out.println(a + "\t");
       else System.out.println(b + "\t");

   
   p = false; q = false;
     if(p) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p&q) System.out.print(a + "\t");
       else System.out.print(b + "\t");

     if(p|q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(p^q) System.out.print(a + "\t");
       else System.out.print(b + "\t");
 
     if(!p) System.out.println(a + "\t");
       else System.out.println(b + "\t");
  }
} 
