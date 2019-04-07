public class Pair<X,Y>{
	private X x;
	private Y y;
	
	public Pair(X x, Y y){
	this.x = x;
	this.y = y;
	}
	public X first(){
		return this.x;
	}
	public Y second(){
		return this.y;
	}
}