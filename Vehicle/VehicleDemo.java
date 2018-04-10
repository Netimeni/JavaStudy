// В этом классе объявляется класс типа Vehicle

class VehicleDemo {
 public static void main(String arga []) {
  Vehicle minivan = new Vehicle();
  int range;

  // Присвоить значение полям в объекте minivan
  minivan.passengers = 7;
  minivan.fuelcap = 16;
  minivan.mpg = 21;

  // расчитатть дальность поездки при полном баке 
  range = minivan.fuelcap * minivan.mpg;
  System.out.println("Минивэн может провезти " + minivan.passengers + " на расстояние " + range + " миль");
 }
}  
