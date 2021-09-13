package br.com.rd.queroserdev.heranca;

public class Equipamento {
	private String nomeEquipamento;
	private int numeroEquipamento;
	
	public Equipamento() {
		
	}
	
	public Equipamento(int numeroEquipamento, String nomeEquipamento) {
		this.numeroEquipamento = numeroEquipamento;
		this.nomeEquipamento = nomeEquipamento;
	}

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}

	public int getNumeroEquipamento() {
		return numeroEquipamento;
	}

	public void setNumeroEquipamento(int numeroEquipamento) {
		this.numeroEquipamento = numeroEquipamento;
	}
	
}