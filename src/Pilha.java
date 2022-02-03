
public class Pilha {

	private int qnt;
	private Elemento topo;

	public Pilha() {
		this.qnt = 0;
		this.topo = null;
	}

	public void push(Elemento e) {
		if (this.qnt == 0) {

			this.topo = new Elemento();

			this.topo.setConteudo(e.getConteudo());
			this.topo.setAnterior(null);
			this.topo = e;
			qnt++;

		} else {

			e.setAnterior(this.topo);

			this.topo = e;
			qnt++;

		}

	}

	public void pop() {
		this.qnt--;
		this.topo = this.topo.getAnterior();
		
	}

	public void listar() {

		Elemento e = this.topo;

		while (e != null) {

			System.out.println(e.getConteudo());
			e = e.getAnterior();
		}
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public Elemento getTopo() {
		return topo;
	}

	public void setTopo(Elemento topo) {
		this.topo = topo;
	}

}
