// Угадывание букв
 
class Guess {
 public static void main(String args []) 
  throws java.io.IOException {
   char ch, answer = 'H', ignore;
   
  
    System.out.println("Задумана буква в диапозоне A-K");
    System.out.print("Попытайтесь ее угадать: ");
    ch = (char) System.in.read();
    for(; ch != answer;)
    { 
      System.out.print("Вы не угадали нужная буква находится ");
      if(ch < answer)
          System.out.print("ближе к концу алфавита. Поробуйте еще: ");
      else 
          System.out.print("ближе к началу алфавита. Поробуйте еще: ");

      for(ignore = (char) System.in.read(); ignore != '\n';){}  
      ch = (char) System.in.read();
   }

     
    if(ch == answer)  System.out.println("Вы угададли"); 
 }
}





/* if(ch != answer){
    for(;;) {
    ch = (char) System.in.read();
    System.out.print("Вы не угадали.Попробуйте еще раз: ");
    }}
    else System.out.println("Вы угададли");

 }
}
*/







  
/*
class Guess {
 public static void main(String args [])
  throws java.io.IOException {
   char ch, answer = 'H';


   System.out.println("Задумана буква в диапозоне A-K");
  //do {
    System.out.println("Попытайтесь ее угадать: ");
    //ch = (char) System.in.read();
    for(ch = (char) ' '; ch != answer;){
    ch = (char) System.in.read();
    System.out.println("Вы не угадали.Попробуйте еще раз: ");
    //ch = (char) System.in.read();
    }
 //ch = (char) System.in.read();
   if(ch == answer)  System.out.println("Вы угададли");
    // System.out.println("Вы не угадали");
       while (ch != answer);
 }
}
*/
