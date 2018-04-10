class AddMeth {
 public static void main(String args []) {
  Vehicle minivan = new Vehicle();
  Vehicle sportcar = new Vehicle();
  
  int range1, range2;
  
 //Присвоить значение полям minivan 
 minivan.passengers = 7;
 minivan.fuelcap = 16;
 minivan.mpg = 21;
 
 // Присвоить значение полям sportcar
 sportcar.passengers = 2;
 sportcar.fuelcap = 14;
 sportcar.mpg = 12;
 
 System.out.print("Минивэн может провезти " + minivan.passengers + " пассажиров. ");
  minivan.range();	
 
 System.out.print("Спорткар может провезти " + minivan.passengers + " пассажиров. ");
  sportcar.range();
 }
}
