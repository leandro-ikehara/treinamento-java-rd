package br.com.rd.queroserdev.heranca;

public class Computador extends Equipamento {

	private String marcaComputador;
	private String tipoComputador;
	
	public Computador(){
		
	}
	
	public Computador(int numeroEquipamento, String nomeEquipamento, String marcaComputador, String tipoComputador) {
		super(numeroEquipamento, nomeEquipamento);
		this.marcaComputador = marcaComputador;
		this.tipoComputador = tipoComputador;
	}


	public String getMarcaComputador() {
		return marcaComputador;
	}

	public void setMarcaComputador(String marcaComputador) {
		this.marcaComputador = marcaComputador;
	}

	public String getTipoComputador() {
		return tipoComputador;
	}

	public void setTipoComputador(String tipoComputador) {
		this.tipoComputador = tipoComputador;
	}
	
	public String confereDados(int numeroEquipamento, String marcaComputador) {
		String dadosComputador;
		dadosComputador = numeroEquipamento + " , " + marcaComputador;
		return dadosComputador;
	}
}