/* Упражнение по работе с оператором  If
 Присвойте файлу имя IfDemo.java
*/
class IfDemo { 
 public static void main(String args []) {
 int a, b, c;
 a=2;
 b=3;

 if(a < b) System.out.println(a +" меньше " + b); 
  // Следующая строка никогда не может быть  выведена 
 if(a == b) System.out.println("Вы не должны увидеть эту строчку если только a не равно b");
 System.out.println();

 c = a - b; // переменная "с" содержит -1
 System.out.println("c=" + c);
 if(c >= 0) System.out.println("c-не отрицательное число");
 if(c < 0) System.out.println("c-отрицательное число");

 System.out.println();

 c = b - a; // переменная "с" содержит 1
 System.out.println("c=" + c);
 if(c >= 0) System.out.println("c-не отрицательное число");
 if(c < 0) System.out.println("c-отрицательное число");
 }
}
