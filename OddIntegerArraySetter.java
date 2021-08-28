import java.util.Scanner;

public class OddIntegerArraySetter{
	
	public int OddIntegerArray[] = new int[oddArraySize];
	public static void setOddIntegerArray(int oddArraySize) {
		//задаём нулевой элемент массива для заполнения нечётными числами
		int i=0;
		//и первое число от которого считать
		int j=1;
		while (i < arraySize) {
			if (j%2 ==1)
				{
					OddIntegerArray[i] = j;
					i++;
					j++;
				}
			else {
				j++;
			}
		}
		//массив заполнен простыми числами
	}
}