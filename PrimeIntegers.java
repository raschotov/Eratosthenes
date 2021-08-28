public class PrimeIntegers {
	
	public int primeIntegersArray = new int[];
	
	public void setPrime () {
			
		//присваиваем индексам с композитным значением (т.е. не простым числам) ноль
		public void setNonPrimeIntegersToNull () {
			//единица не является простым числом
			OddIntegerArray[0] = 0;
			
			for (int indexOfOddArray = 1; indexOfOddArray < oddArraySize; indexOfOddArray++) {
				//множитель начиная с самого числа 
				for (int multiplier = oddIntegerArray[indexOfOddArray]; multiplier < oddArraySize; multiplier++) {
					int oddValueToRemove = oddIntegerArray[indexOfOddArray] * multiplier;
					for (int indexOfOddArray = 1; indexOfOddArray < oddArraySize; indexOfOddArray++) {
						if (oddIntegerArray[indexOfOddArray] == oddValueToRemove) {
							oddIntegerArray[indexOfOddArray] = 0;
						}
					}
				}
			}
		}
		
		//считаем количество ненулевых чисел для вычисления размера массива простых чисел
		public void countPrimeArraySize () {
			public int primeArraySize = 0;
			for (i=1; i < oddArraySize; i++);
				if (OddIntegerArray[i] != 0) {
					primeArraySize++;
				}
		}
		
		//записываем ненулевые числа в массив простых
		public void setPrimeArray {
			public int primeArray[] = new int[primeArraySize];
			for (int i = 0; i < primeArraySize; i++) {
				for (int j = 0; j < oddArraySize; j++) {
					if (OddIntegerArray[j] != 0) {
						primeArray[i] = OddIntegerArray[j];
					}
				}
			}
		}
	}
}