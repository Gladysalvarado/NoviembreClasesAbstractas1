package com.corenetworks.presentacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class PolimorfismoInstrumentoMu {
    public static void main(String[] args) {
        InstrumentoMusical guido= new Guitarra("yamaja","largas y cortas");
        InstrumentoMusical batata= new Bateria("lorens",8);
        InstrumentoMusical ham = new Flauta("puki","madera");
        InstrumentoMusical[] instrumentos = {guido,batata,ham};
        for (InstrumentoMusical elemento:
        instrumentos){
            System.out.println(elemento.emitirSonido());
            System.out.println(elemento.toString());
        }

for (int i=0; i<instrumentos.length;i++){
        System.out.println(instrumentos [i].emitirSonido());
    System.out.println(instrumentos [i].toString());

}



    }
}
