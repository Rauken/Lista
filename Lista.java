package trainee02;

public class Lista {
	private Nodo ini;
	private int size;
	
	public Lista(){
		ini = null ;
		size = 0;
	}
	
	public boolean esVacia(){
		return ini == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void Addfinal(int val){
		Nodo nw = new Nodo();
		nw.setVal(val);
		if(esVacia()){
			ini = nw;
		}else{
			Nodo aux = ini;
			while(aux.getNext() != null){
				aux = aux.getNext();
			}
			aux.setNext(nw);
		}
		size++;
	}
	
	public void addIni(int val){
		Nodo nw = new Nodo();
		nw.setVal(val);
		if(esVacia()){
			ini = nw;
		}else{
			nw.setNext(ini);
			ini = nw;
		}
		size++;
	}

	public void insertRef(int ref, int val){
		Nodo nw = new Nodo();
		nw.setVal(val);
		if(!esVacia()){
			Nodo aux = ini;
			while(aux.getVal() != ref){
				aux= aux.getNext();
			}
			Nodo next = aux.getNext();
			aux.setNext(nw);
			next.setNext(next);
		}
		size++;
	}

	public void insertPos(int pos, int val){
		
		if(pos >=0 && pos <= size){
			Nodo nw = new Nodo();
			nw.setVal(val);
			
			if(pos == 0){
				nw.setNext(ini);
				ini = nw;
			}else{
				if(pos == size){
					Nodo aux = ini;
					while(aux.getNext() != null){
						aux = aux.getNext();
					}
					aux.setNext(nw);
				}else{
					Nodo aux = ini;
					for(int i=0; i <(pos-1);i++){
						aux = aux.getNext();
					}
					Nodo next = aux.getNext();
					aux.setNext(nw);
					nw.setNext(next);
				}
				
			}
			size++;
		}
		
	}

	public int getVal(int pos) throws Exception{
		
		if(pos >= 0 && pos < size){
			if(pos == 0){
				return ini.getVal();
			}else{
				Nodo aux = ini;
				for(int i=0; i< pos; i++){
					aux = aux.getNext();
				}
				return aux.getVal();
			}
		}else{
			throw new Exception("Posicion Inexistente en la lista");
		}
		
	}

	public boolean search(int ref){
		
		Nodo aux = ini;
		boolean found= false;
		while(aux != null && found != true){
			if(ref == aux.getVal()){
				found = true;
			}else{
				aux.getNext();
			}
		}
		return found;
	}

	public int getPos(int ref) throws Exception{
		
		if(search(ref)){
			Nodo aux = ini;
			int cont = 0;
			while(ref != aux.getVal()){
				cont++;
				aux = aux.getNext();
			}
			return cont;
		}else{
			throw new Exception("Valor inexistente en la lista");
		}
	}

	public void editByref(int ref, int val){
		
		if(search(ref)){
			Nodo aux = ini;
			while(aux.getVal() != ref){
				aux = aux.getNext();
			}
			aux.setVal(val);
		}
	}

	public void editBypos(int pos, int val){
		
		if(pos >=0 && pos <= size){
			if(pos == 0){
				ini.setVal(val);
			}else{
				Nodo aux = ini;
				for(int i=0; i<pos;i++){
					aux = aux.getNext();
				}
				aux.setVal(val);
			}
		}
	}
	
	public void remByref(int ref){
		
		if(search(ref)){
			if(ini.getVal() == ref){
				ini = ini.getNext();
			}else{
				Nodo aux = ini;
				while(aux.getNext().getVal() != ref){
					aux = aux.getNext();
				}
			Nodo next = aux.getNext().getNext();	
			aux.setNext(next);
			}
			size--;
		}
	}

	public void remBypos(int pos){
		if(pos >= 0 && pos < size){
			if(pos==0){
				ini = ini.getNext();
			}else{
				Nodo aux = ini;
				for(int i=0; i< pos-1;i++){
					aux = aux.getNext();
				}
				Nodo next = aux.getNext();
				aux.setNext(next.getNext());
			}
			size--;
		}
	}

	public void delete(){
		
		ini = null;
		size =0;
	}

	public void list(){
		if(!esVacia()){
			Nodo aux = ini;
			int i=0;
			while(aux != null){
				System.out.print(i+".["+aux.getVal()+"] -> ");
				aux = aux.getNext();
				i++;
			}
		}
	}
	
}//clase