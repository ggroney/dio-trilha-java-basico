//CONDICIONAL COMPOSTA
public class ResultadoEscolar {
    public static void main(String[] args) {
        //CONDICAO TERNARIA
        int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
        
        
        /*int nota = 10;
       
       if(nota >= 7)
        System.out.println("Aprovado");
        //CONDICIONAL ENCADEADA
        else if (nota >= 5 && nota < 7)//true ou false
        System.out.println("Prova de recuperação");

        else
        System.out.println("Reprovado");*/
    }
}
