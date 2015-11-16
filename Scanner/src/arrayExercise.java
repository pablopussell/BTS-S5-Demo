
public class arrayExercise {

	public static void main(String[] args) {
		double[] data = {37.5478484, 73.836236, 836.8475465, 26.847464, 73673.747463, 734.7237367};
		System.out.println("the sum of your data = " + sum(data));
		System.out.println("the average of your data = " + avg(data));
		System.out.println("the max value of your data = " + max(data));
		System.out.println("the min value of your data = " + min(data));
	}
	private static double sum(double[] data) {
		double additionTotal = 0;
		for (double number:data){
			additionTotal+=number;
		}
		return additionTotal;
	}
	private static double avg(double[] data) {
		double sum = sum(data);
		double averageTotal=sum/data.length;
		return averageTotal;
	}
	private static double max(double[] data) {
		double max = data[0];
		for (double number:data){
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
	private static double min(double[] data) {
		double min = data[0];
		for (double number:data){
			if(min > number) {
				min = number;
			}
		}
		return min;
	}

}
