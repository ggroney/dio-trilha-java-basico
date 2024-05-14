import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase4 {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}	
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			//elas precisarão sofre alterações
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		

	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

	
	static double valorPretendido() {
     	return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}