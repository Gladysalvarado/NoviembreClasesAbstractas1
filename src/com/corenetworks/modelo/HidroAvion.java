package com.corenetworks.modelo;

public class HidroAvion implements Inautico, ObjetoVolador{
    @Override
    public String navegar() {
        return "el hidroAvion esta navegando";
    }

    @Override
    public String atracar() {
        return "el hidroAvion esta atracando";
    }

    @Override
    public String despegar() {
        return "el hidroAvion esta despegando";
    }

    @Override
    public String volar() {
        return "el hidroAvion esta volando";
    }

    @Override
    public String aterrizar() {
        return "el hidroAvion esta aterrizando";
    }

    @Override
    public String toString() {
        return "HidroAvion{}";
    }
}