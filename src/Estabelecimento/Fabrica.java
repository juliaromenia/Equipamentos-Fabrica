package Estabelecimento;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        

            impressora.imprimir();
            digitalizadora.digitalizar();
            copiadora.copiar();
    }
}
