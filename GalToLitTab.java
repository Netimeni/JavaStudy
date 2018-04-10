/*
Упражнение 1.2
Эта програ а отображает таблицу перевода галлонов в литры.
Присвойте файлу с исходным кодом имя GalToLitTaЬle.java
*/
class GalToLitTab {
 public static void main(String args []) {
  double gallons, liters;
  int counter; // Задаем целое значениее счетчику строк

  counter=0; //Задаем начальное значение counter
  for(gallons=1; gallons < 100; gallons++) {
  liters= gallons*3.7854; // преобразовываем галлоны в литры
  System.out.println(gallons + " галлонам соответствует " + liters + " литров");
  counter++; // Увеличивает значение счетчика строк на +1
  if (counter==10) { //Если счетчик достигает значения 10 
   System.out.println();
   counter =0;
   }
  } 
 }
}
