package trainee02;

public class Nodo {
	private int val;
	private Nodo next;
	
	public Nodo(){
		this.val = 0;
		this.next = null;
	}
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	
}
