/* Пригласить пользователя ввести число от 1 до 23. Проверить входит ли число в заданный диапазон. Из введенного занчения построить
   половину пирамиды с основание из введенного количества знаков #, вся пирамида должна бть выавнена по правому краю
*/


class Pyramid {
 public static void main(String args []) 
  throws java.io.IOException {
 
 int x =0 , i, y, z, g;
 char s=')', n= '#', ignore;  
// do{
 System.out.println("Введите число от 1 до 23: ");
 x = (int) System.in.read();  // Понять почему не видит введенное значение
    do{ 
ignore = (char) System.in.read();
    } while (ignore != '\n'); 
//}while(x>0 & x<=23); 
 for(i=1;i<=x;i++){
   for(z=x-i;z>=0;z--){
    System.out.print(s);}
   for(y=0;y<i;y++){  
    System.out.print(n);}
     System.out.println();
    
  }
 }
}
