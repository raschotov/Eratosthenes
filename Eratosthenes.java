import java.util.Scanner;

public class Eratosthenes {

	public static int LargestRequiredInt;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Поиск простых чисел решетом Эратосфена");
		System.out.println("Введите максимальное число N");
		LargestRequiredInt = sc.nextInt();
		
		System.out.println("Было введено число");
		System.out.println(LargestRequiredInt);
		
		
		//создаём нечётный массив
		setOddIntegerArray();
		//выводим массив нечётных чисел
		displayOddIntegerArray();
		
		//ищем простые числа
		
		//выводим массив
	}
}