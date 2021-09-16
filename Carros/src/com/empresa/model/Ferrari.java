package com.empresa.model;
import com.empresa.interfaces.*;

public class Ferrari extends Carro implements IEsportivo, ILuxo {
	private boolean  ativarTurbo;
	private boolean  ativarArCondicionado;
	
	public Ferrari() {
		this(400);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	public void acelerar() {
		setVelocidadeAtual(getVelocidadeAtual() + getTxVariacao());
	}
	
	@Override
	public void ativarTurbo() {
		ativarTurbo = true;
		setTxVariacao(35);
	}
	
	@Override
	public void desativarTurbo() {
		ativarTurbo = false;
		setTxVariacao(15);
	}

	@Override
	public void ativarTracaoQuatroRodas() {
		System.out.println("Não se aplica a este modelo");
		
	}

	@Override
	public void ativarArCondicionado() {
		ativarArCondicionado = true;
		
	}

	@Override
	public void desativarArCondicionado() {
		ativarArCondicionado = false;
		
	}
	
	public int getVariacao() {
		if(ativarTurbo && !ativarArCondicionado) {
			return 35;
		}else if(ativarTurbo && ativarArCondicionado) {
			return 30;
		}else if(!ativarTurbo && !ativarArCondicionado) {
			return 20;
		}else {
			return 15;
		}	
	}

}
