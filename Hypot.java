/* 
 Определение длинны гипотенузы, исходя из
 длинны ктетов, по теореме Пифагора
*/
class Hypot {
 public static void main (String args []) {
   double x, y, z;
    
    x=3;
     System.out.println("Длинна первого катетета равна " +x);
    
    y=4;
     System.out.println("Длинна второго катетета равна " +y);
    
    z=Math.sqrt(x*x+y*y);
     System.out.println("Длинна гипотенузы равна: " +z);
  }
}
