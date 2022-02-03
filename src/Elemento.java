
public class Elemento {
	private String conteudo;
	private Elemento anterior;
	
	public Elemento(String conteudo){
		this.conteudo = conteudo;
		this.anterior = anterior;
	}
	public Elemento(){
		
	}
	
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Elemento getAnterior() {
		return anterior;
	}
	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}
	
	

}
