
public class Principal {
	public static void main(String[] args){
		
		Elemento e = new Elemento("123");
		Elemento e1 = new Elemento("321");
		
		
		Pilha p = new Pilha();
		
		p.push(e);
		p.push(e1);
		
		p.listar();
		System.out.println("Quantidade atual de valores na pilha: " + p.getQnt() + "\r\n");
		
	
		p.pop();
		p.listar();
		System.out.println("Quantidade tual de valores na pilha: " + p.getQnt() + "\r\n");
		
		
	}
}
