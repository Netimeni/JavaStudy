/*
Самостоятельная работа 
Преобразовать дюймы в метры. Вывести таблицу до 24 дюймов. Через каждые 12 дюймов ставить пустую строку.
Первый дюйм вывести "дюйму" дальше "дюймам"
*/
class MetrToInch {
 public static void main(String args []) {
  double metres, inches; //  задали плавающие переменные 
  int counter; // Задаем целое значениее счетчику строк

  counter=0; //Задаем начальное значение counter
  for(inches=1; inches <= 24; inches++) { // задали цикл с начальным паараметром 1 считать до 24 с увеличением на 1
  metres= inches/39.37; // преобразовываем дюймы в метры
  
  if (inches ==1) { // проверка если равно 1 то пишем дюйму ...
   System.out.println(inches + " дюйму " + metres + " метров");
  }
  if (inches !=1) { //  провкрка если не равен 1 то пишем дюймам
   System.out.println(inches + " дюймам " + metres + " метров");
  }
  counter++; // Увеличивает значение счетчика строк на +1
  if (counter==12) { //Если счетчик достигает значения 12
   System.out.println();
   counter =0;
   }
  } 
 }
}
