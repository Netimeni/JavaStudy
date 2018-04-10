class MassMoon2 {      
public static void main(String[] args) {
	// приветствие пользователя;
		System.out.println("Данная программа поможет Вам узнать свой вес на Луне ;-)");
		System.out.println("");
		System.out.println("Итак, начнем!"); 
	//Scanner - принимаем с клавиатуры введенный пользователем свой вес;
		//Scanner conin = new Scanner(System.in);
                Scanner conin = new Scanner(System.in);
                int i;
                if (conin.hasNextint()) i = conin.nextint();
		System.out.println ();
		System.out.print ("Чему равен Ваш вес на Земле, кг? : ");
		double weightPeopleEarth = conin.nextInt();
	//вычисляем вес пользователя на Луне;
		double weightPeopleMoon = weightPeopleEarth*0.17;
	//выводим ответ на консоль;
		System.out.println("");
		System.out.println("Ваш вес на Луне равен " + weightPeopleMoon + " кг.");
		
	}
}
