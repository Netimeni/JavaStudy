// Демонстрация динамической инициализации
class DynInit {
 public static void main (String args []) {
  double radius=4, height=5;
   // Переменная volume инициализируется динамически
   // во время выполнения программы
   //  System.out.println(Math.pow(radius,2));
       
     double volume = 3.1416*height*Math.pow(radius,2);
   System.out.println("Объем:" + volume);
  }
}

