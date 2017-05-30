package PrüfungsAufgaben;
public class KonstruktorenPrüfungsAufgabeSubklasse extends KonstruktorenPrüfungsAufgabeSuperklasse{
	
	
	public KonstruktorenPrüfungsAufgabeSubklasse(int i1, int i2, int i3, int i4){
		super(i1,i2,i3,i4);
	}
	public KonstruktorenPrüfungsAufgabeSubklasse(int i1, int i2, int i3){
		this(i1,i2,i3,1);
		
	}
	public KonstruktorenPrüfungsAufgabeSubklasse(int i1, int i2){
		this(i1,i2,1,1);
	}
	public KonstruktorenPrüfungsAufgabeSubklasse(int i1){
		this(i1,1,1,1);
	}
	public static void main(String[] args){
		
	KonstruktorenPrüfungsAufgabeSubklasse o1 = new KonstruktorenPrüfungsAufgabeSubklasse(4,6,8,10);
	KonstruktorenPrüfungsAufgabeSubklasse o2 = new KonstruktorenPrüfungsAufgabeSubklasse(5,7,9);
	KonstruktorenPrüfungsAufgabeSubklasse o3 = new KonstruktorenPrüfungsAufgabeSubklasse(6,7);
	KonstruktorenPrüfungsAufgabeSubklasse o4 = new KonstruktorenPrüfungsAufgabeSubklasse(9);
	
	if(o2.i4 ==1)
		System.out.println("ok");
	
	if(o3.i3 == 1 && o3.i4 == 1)
		System.out.println("ok");
	
	if(o4.i2 == 1 && o4.i3 == 1 && o4.i4 == 1)
		System.out.println("ok");
}
}