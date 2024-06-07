package equipamentos.digitalizadora;

import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Impressora;

public class Scanner implements Digitalizadora, Impressora, Copiadora{
    public void digitalizar() {
        System.out.println("Digitalizando");
    }

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copiar'");
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }
}
