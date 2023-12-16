

public class ClasseObjeto {
	private String nome;
	public ClasseObjeto(String pNome) {
		setNome(pNome);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getNome() + " Morri");
		super.finalize();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
