CRIANDO SISTEMA VALIDACAO PROCESSO SELETIVO
Cases
Vamos explorar alguns outros cenários, com fluxo condicionais, repetições e excepcionais.

Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:
Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;
Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.

Case 2: Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam selecionados apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao salário base.
// Array com a lista de candidatos
String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
// Método que simula o valor pretendido
import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
