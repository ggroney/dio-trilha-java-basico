// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
      
        //FOR EACH
        //Forma abreviada
	    for(String aluno : alunos) {
        System.out.println("Nome do alune é " + aluno);
      }

        //FOR ARRAY
        /*for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/
    }
}