package com.empresa.model;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	
	private int velocidadeAtual;
	private int txVariacao = 5;
	
	public Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}


	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}


	public int getTxVariacao() {
		return txVariacao;
	}


	public void setTxVariacao(int txVariacao) {
		this.txVariacao = txVariacao;
	}


	public void acelerar() {
		if(getVelocidadeAtual() + getTxVariacao() > VELOCIDADE_MAXIMA) {
			setVelocidadeAtual(VELOCIDADE_MAXIMA);
		}else {
			setVelocidadeAtual(getVelocidadeAtual() + getTxVariacao());
		}	
	}
	
	public void frear() {
		if(getVelocidadeAtual() >= getTxVariacao()) {
			setVelocidadeAtual(getVelocidadeAtual() - getTxVariacao());
		}else {
			setVelocidadeAtual(0);
		}	
	}
	
	public String toString() {
		return "Velocidade Atual -> " + getVelocidadeAtual() + "km/h.";
	}

}
