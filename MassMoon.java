/* Самостоятельная работа
Вычисление массы тела на луне 
*/
class MassMoon {
 public static void main (String args[]) {
 double masserth, massmoon; // Задал плавающие переменные masserth(масса тела на Земле) и massmoon(масса птела на Луне)
 int persent, coeff; // Задал целые переменные persent=100% и coeff коэфицент разницы силы тяжести на Земле и Луне в "%"
   masserth = 90.0;
   persent=100;
   coeff=17;
{
   massmoon=masserth/persent*coeff;
  System.out.println("масса тела на луне составляет " + massmoon + " кг");
  } 
 }
}
