package TevfikInformatik;

public class ExponentielleGlaettung1 {

	public static void main(String[] args) {
		System.out.println(smooth(10.0));
	}

	static double smooth(double value) {

		double smoothValue = 3.0;
		// vllt eine while schleife ?
		if((0<=smoothValue) && (smoothValue<=1)) {
			 value = smoothValue * value + (1 - smoothValue) * smooth(value - 1);
		}else 
		return smoothValue;
		return smoothValue;

	}
}
