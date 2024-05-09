//ESTRUTURAS EXCEPCIONAIS
//Tratamento de excecoes

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try {
            
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);//importamos e jogamos no bloco seguro

        } catch (ParseException e) {
            
            e.printStackTrace();

        }
        
        
       
    }
}