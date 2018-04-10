/* 
 Напишите программу, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
 Предумотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
*/

class ReadSymb {
 public static void main (String args [])
  throws java.io.IOException {
   char ch, ignore;
   int i=0;

  for(;;) { 
   System.out.print("Введите символ с клавиатуры: ");
   ch = (char) System.in.read();
    if( ch == ' ') 
     i++;
    do {
   ignore = (char) System.in.read();
    } while (ignore != '\n');     
   if(ch == '.') break; 
    System.out.println("Попробуйте еще");
//    System.out.println("Вы нажали пробел:" +i + "раз");     
          }    
  System.out.println("Программа завершена вы нажали:" +ch);
  if(i == 1) 
  System.out.println("Вы нажали пробел:" +i + " раз");
  else System.out.println("Вы нажали пробел:" +i + " раза"); 
 }
}


