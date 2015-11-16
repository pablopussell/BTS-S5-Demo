
public class Arrays {

	public static void main(String[] args) {
		int[] unidimensionalArray = new int[3];
		//or
		int[] unidimensionalArray2 = new int[] {10, 20, 30};
		//or
		int[] unidimensionalArray3 = {10, 20, 30};
		unidimensionalArray[0] = 10;
		unidimensionalArray[1] = 20;
		unidimensionalArray[2] = 30;
		
		String [][] multiDimensionalArray = new String[2][3];
		multiDimensionalArray [0][0] = "10";
		multiDimensionalArray [0][1] = "20";
		multiDimensionalArray [0][2] = "20";
		multiDimensionalArray [1][0] = "20";
		multiDimensionalArray [1][1] = "20";
		multiDimensionalArray [1][2] = "20";
		
		//for each number in the array do this:
		for(String[] number:multiDimensionalArray) {
			
		}
	}

}
