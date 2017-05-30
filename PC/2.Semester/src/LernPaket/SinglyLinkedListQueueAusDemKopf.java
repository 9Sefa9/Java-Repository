package LernPaket;

public class SinglyLinkedListQueueAusDemKopf<Datentyp> {

		private Node first,last;
		private class Node{
			Datentyp item;
			Node next;
		}
		public boolean isEmpty(){
			return first == null;
		}
		//das bleibt nciht gleich. wir referieren zum letzten, f�gen eine node hinzu mit metainformation, anschlie�end ist
		//das n�chste element, also Oldalst.next gleich das allerletzte element last
		public void enqueue(Datentyp item){
			Node Oldlast = last;
			last = new Node();
			last.item = item;
			
			last.next = null;
			// IF BEDINGUNG MUSS GELERNT WERDEN !
			if(isEmpty()){
				first = last;
			}else  Oldlast.next = last;
			
		}//�quivalent zu Stack,  IF BEDINGUNG MUSS GELERNT WERDEN!
		public Datentyp dequeue(){
			Datentyp item = first.item;
			first = first.next;
			if(isEmpty()){
				last = null;
			}
			return item;
			
		}
}
