package br.com.rd.queroserdev.heranca;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento equip = new Equipamento(0, "Dell");
		Computador cpu = new Computador(0, "Vostro XP 5", "Dell", "notebook");
		
		System.out.println("Exibir dados dos 2 objetos: ");
		System.out.println("\nNúmero do equipamento: " + equip.getNumeroEquipamento() +
							"\nNome do equipamento: " + equip.getNomeEquipamento() + 
							"\nTipo do computador: " + cpu.getTipoComputador() + 
							"\nMarca do computador: " + cpu.getMarcaComputador());
		System.out.println("----------------------------");
		System.out.println("Exibir dados da classe Equipamento: ");
		System.out.println("\nNúmero do equipamento: " + equip.getNumeroEquipamento());
		System.out.println("Nome do equipamento: " + equip.getNomeEquipamento());
		System.out.println("----------------------------");
		System.out.println("Exibir dados da classe Computador: ");
		System.out.println("\nMarca do computador: " + cpu.getMarcaComputador());
		System.out.println("Tipo do computador: " + cpu.getTipoComputador());
	}

}
