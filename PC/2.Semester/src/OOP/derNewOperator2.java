
public class derNewOperator2 extends derNewOperator1 {


	public derNewOperator2(int sch�ler, String name, String fach){
	this.Sch�ler = sch�ler;
	this.Name  	= name;
	this.Fach		= fach;
	
	}
	public void setSch�ler(int sch�ler){
		this.Sch�ler = sch�ler;
	}
	public int getSch�ler(int sch�ler){
		
		return this.Sch�ler;
		
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return this.Name;
	}
	public void setFach(String fach){
		this.Fach = fach;
	}
	public String getFach(){
		return this.Fach;
	}
	public String toString(){
		return "Die Klasse besteht aus "+Sch�ler+" Sch�lern, Die Lehrerin hei�t:"+Name+" und Unterrichtet: "+Fach+"";
	}
}
