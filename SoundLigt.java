/* Вычисление растояния от наблюдателя
 до источника звука(молния)
*/

class SoundLigt {
 public static void main (String args[]) {
  System.out.println("Вычисляем расстояние до источника звука S");
  System.out.println("Задаем параметры: Время распространения=t(c) , скорость распространения=V(фут/с)"); 
 
  double S, V, t;
     V=1100;
     t=7.2;
     S = V * t;
      
       System.out.println("Растояние до источника звука равно " +S +" (футов)");
 }    
}
