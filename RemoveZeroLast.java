public class RemoveZeroLast {

	public static void main(String[] args) {
		int[] numbers = { 0, 12, 34, 10, 2, 41, 0, 8, 12, 54, 0, 5, 90 };

		int inputArrLength = numbers.length;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				numbers[count++] = numbers[i];
			}
		}
		while (count < inputArrLength) {
			numbers[count++] = 0;
		}
		
		for(int data:numbers){
                       System.out.print(data+" ");
                }
	
	}
}
