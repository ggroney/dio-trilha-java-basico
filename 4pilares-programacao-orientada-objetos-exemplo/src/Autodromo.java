//ENCAPSULAMENTO
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897897897897");
        //jeep.ligar();

        Moto cb300 = new Moto();
        cb300.setChassi("45468769987");
        //cb300.ligar();
        
        //POLIFORMISMO
        Veiculo qualquerVeiculo = cb300;

        qualquerVeiculo.ligar();
    }
}
