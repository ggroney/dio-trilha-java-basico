package lanchonete;

import lanchonete.atendimento.atendente;
import lanchonete.atendimento.cozinha.almoxarife;
import lanchonete.atendimento.cozinha.cozinheiro;
import lanchonete.cliente.cliente;

public class estabelecimento {
	public static void main(String[] args) {
		cozinheiro cozinheiro = new cozinheiro();
								
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		atendente atendente = new atendente();
		atendente.servindoMesa();

		atendente.receberPagamento();
		
		
		cliente cliente = new cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
	}
}