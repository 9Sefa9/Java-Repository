public class MeaningOfLife{
	public static void main(String[]a){
		try{
		func();
		}catch(DontPanic d){
			d.printStackTrace();
		}
	}
	public static void func() throws DontPanic{
		throw new DontPanic();
	}
	
}