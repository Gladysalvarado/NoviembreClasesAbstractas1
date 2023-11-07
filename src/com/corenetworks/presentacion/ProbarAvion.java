package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarAvion {
    public static void main(String[] args) {
        //instanciar un avión con nombre de objeto ax2
        Avion ax2 = new Avion("guacamayo");
        //Polimorfismo
        ObjetoVolador ax3 = new Avion("rojo");

        ObjetoVolador ave1= new Ave();

        ObjetoVolador clarcKen = new SuperMan();

        ObjetoVolador ha1 = new HidroAvion();

        ObjetoVolador []voladores={ax2, ax3, ave1, clarcKen, ha1};

        for (ObjetoVolador elemento: voladores){
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());
            System.out.println(elemento.toString());
            if (elemento instanceof Ave){
                System.out.println(((Ave) elemento).hacerNido());
                System.out.println(((Ave) elemento).ponerHuevo());
            }
            if (elemento instanceof SuperMan){
                System.out.println(((SuperMan) elemento).saltarEdificio());
                System.out.println(((SuperMan) elemento).pararBala());
            }
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).atracar());
                System.out.println(((HidroAvion) elemento).navegar());
            }

        }
        Barcaza b1 = new Barcaza();
        Inautico[] nauticos = {b1, ( Inautico) ha1};
        for (Inautico elemento: nauticos){
            System.out.println(elemento.navegar());
            System.out.println(elemento.atracar());
            if (elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).despegar());
                System.out.println(((HidroAvion) elemento).aterrizar());
                System.out.println(((HidroAvion) elemento).volar());
            }
        }
    }
}

