package com.empresa.interfaces;

// interface
public interface ILuxo {
	
	public void ativarArCondicionado();
	
	public void desativarArCondicionado();
	
	public default int regularNivelAr() {
		return 1;
	}


}
