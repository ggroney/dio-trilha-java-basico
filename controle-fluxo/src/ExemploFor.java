/* SINTAXE FOR
//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
*/

//EXEMPLO: Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:

// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		//FOR
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println("Contando carneirinhos " + carneirinhos );
		}
        System.out.println("Joaozinho dormiu ");
	}
}