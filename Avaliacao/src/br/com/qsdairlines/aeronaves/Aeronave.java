package br.com.qsdairlines.aeronaves;

public class Aeronave {
	private String modeloAeronave;
	private Double combustivel;
	private int qtdMaxPassageiros;
	private Double consumoPorKm;
	public String getModeloAeronave() {
		return modeloAeronave;
	}
	public void setModeloAeronave(String modeloAeronave) {
		this.modeloAeronave = modeloAeronave;
	}
	public Double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Double combustivel) {
		this.combustivel = combustivel;
	}
	public int getQtdMaxPassageiros() {
		return qtdMaxPassageiros;
	}
	public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
		this.qtdMaxPassageiros = qtdMaxPassageiros;
	}
	public Double getConsumoPorKm() {
		return consumoPorKm;
	}
	public void setConsumoPorKm(Double consumoPorKm) {
		this.consumoPorKm = consumoPorKm;
	}
	

}
