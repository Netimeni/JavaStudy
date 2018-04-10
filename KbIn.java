// Чтение символов с ввода клавиатурой


class KbIn {
 public static void main (String args []) 
  throws java.io.IOException {
 
   char ch;
   System.out.print("Нажмите любую, а затем ENTER: ");
   ch = (char) System.in.read(); // Ввести символ
   System.out.println("Вы ввел:" + ch);
 }
}
  
