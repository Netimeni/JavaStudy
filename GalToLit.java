/*
 Упражнение 1.1 page 46
 Программа превода галлоно в литры 
*/
class GalToLit {
 public static void main(String args []) {
  double gallons; // указали что переменная gallons имеет плавающую точку
  double liters; // указали что переменная liters имеет плавающую точку 
  gallons = 10; // присвоили переменной значение 10. Дано 10 галлонов жидкости
  liters = gallons*3.7854; // перевели 10 галлонов в литры
  System.out.println (gallons + " галонам соответстствует " + liters + " литров");
 }
} 
