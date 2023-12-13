package br.com.senaisp.bauru.richard.secao02;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
	private double custo;
	private boolean ativo;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if (codigo<=0) {
			System.out.println("Valor deve ser maior"
					+ " que zero!");
		} else {
			this.codigo = codigo;
		}
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
