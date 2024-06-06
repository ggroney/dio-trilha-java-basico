//HERANCA
public /*ABSTRACAO*/ abstract class Veiculo {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    /*ABSTRACAO*/
    public abstract void ligar();
}
