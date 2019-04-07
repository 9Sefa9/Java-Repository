public class ExceptionTest{
	public static void main(String[] args){
		try{

			throw new ArrayIndexOutOfBoundsException();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("finallystatement");
		}
	}
}