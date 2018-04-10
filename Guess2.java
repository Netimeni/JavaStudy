// Вторая версия программы "Угадывание букв" с вложенными операторами

class Guess2 {
 public static void main (String args [])
  throws java.io.IOException {

   char ch, answer = 'H';
   
   System.out.println("Задумана буква от A-H.");
   System.out.print("Попытайтесь ее угадать: ");
   
   ch = (char) System.in.read();
   
   if(ch == answer) System.out.println("Вы угадали!");
   else {
        System.out.print("Извините нужная буква находится ");
         if(ch < answer)
            System.out.println("ближе к концу алфавита");
         else System.out.println("ближе к началу алфавита");
  }
 }
}
