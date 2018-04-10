/*
 Вычисление числа кубческих дюймов, в кубе обЪемом в 1 куб. милю
*/

class Inches {
  public static void main(String args []) {
   long im=63360;
     System.out.println("В одной миле " +im +" дюймов");
   double ci;
   int  a=3;
    ci= Math.pow (im,a); // Класс Math метод pow- возведение в степень
     System.out.printf("В одной кубической миле %.0f %s%n ", + ci, " дюймов"); //Вывод форматированой строки %.0f float 0-знаков после запятой, %s%n-вывод символов и перевод строки
 }
}
   
