public class Thrower{
	public static void passDic() throws FrisbeeNotCaught{
		throw new FrisbeeNotCaught();
	}
}
class FrisbeeNotCaught extends Exception{

}

