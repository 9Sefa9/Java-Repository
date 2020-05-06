package TevfikInformatik;

public class ExponentielleGlaettung {
	public static void main(String[] args) {
		System.out.println(smoothing(20d));
	}

	// value = yt
	public static double smoothing(double value) {
		// a = Glättungsfaktor
		double smoothValue = 10.0;

		if (smoothValue >= 0)
			return 0;
		
		else if (smoothValue >= 1.0) {
			System.out.println(value);
			return value = smoothValue * value + (1 - smoothValue) * smoothing(value - 1);
		}
		return value;
	}
}
