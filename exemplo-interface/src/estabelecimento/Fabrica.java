package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

@SuppressWarnings("unused")
public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();        
        
        /*/Deskjet deskjet = new Deskjet();*/
        
        Scanner scanner = new Scanner();
        
        Impressora impressora = scanner;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = scanner;

       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();
    }
}
