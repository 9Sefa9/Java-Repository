public class exponentielleGlaettung{
	
	public double smoothing(double value){
		double smoothValue = .0; 

		double last;
		double current = smoothValue *value +(1-smoothValue))*last;	
		smoothValue = current;

		return smoothValue;
	}



}