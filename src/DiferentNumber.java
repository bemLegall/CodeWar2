
public class DiferentNumber {
	static int stray(int[] numbers) {
		int unico = numbers[0];
		for (int i = 0; i <= numbers.length - 1; i++) {
			int[] igual = new int[numbers.length];
			igual[i] = numbers[i];

			if (i + 1 < numbers.length) {
				if (numbers[i] != unico && numbers[i] != numbers[i + 1]) {
					unico = numbers[i];
				}
			}
			if (unico == numbers[0] && unico == numbers[1]) {
				unico = numbers[numbers.length - 1];
			}
		}

		return unico;
	}
}
