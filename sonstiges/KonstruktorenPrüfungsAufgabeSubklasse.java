package Pr�fungsAufgaben;
public class KonstruktorenPr�fungsAufgabeSubklasse extends KonstruktorenPr�fungsAufgabeSuperklasse{
	
	
	public KonstruktorenPr�fungsAufgabeSubklasse(int i1, int i2, int i3, int i4){
		super(i1,i2,i3,i4);
	}
	public KonstruktorenPr�fungsAufgabeSubklasse(int i1, int i2, int i3){
		this(i1,i2,i3,1);
		
	}
	public KonstruktorenPr�fungsAufgabeSubklasse(int i1, int i2){
		this(i1,i2,1,1);
	}
	public KonstruktorenPr�fungsAufgabeSubklasse(int i1){
		this(i1,1,1,1);
	}
	public static void main(String[] args){
		
	KonstruktorenPr�fungsAufgabeSubklasse o1 = new KonstruktorenPr�fungsAufgabeSubklasse(4,6,8,10);
	KonstruktorenPr�fungsAufgabeSubklasse o2 = new KonstruktorenPr�fungsAufgabeSubklasse(5,7,9);
	KonstruktorenPr�fungsAufgabeSubklasse o3 = new KonstruktorenPr�fungsAufgabeSubklasse(6,7);
	KonstruktorenPr�fungsAufgabeSubklasse o4 = new KonstruktorenPr�fungsAufgabeSubklasse(9);
	
	if(o2.i4 ==1)
		System.out.println("ok");
	
	if(o3.i3 == 1 && o3.i4 == 1)
		System.out.println("ok");
	
	if(o4.i2 == 1 && o4.i3 == 1 && o4.i4 == 1)
		System.out.println("ok");
}
}