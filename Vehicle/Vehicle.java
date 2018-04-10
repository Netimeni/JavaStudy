class Vehicle {
 int passengers; // кол-во пассажиров
 int fuelcap; // объем бака
 int mpg;    // расход топлива галлон на милю

 void range() {
  System.out.println("Дальность- " + fuelcap * mpg + " миль");
 }
}
