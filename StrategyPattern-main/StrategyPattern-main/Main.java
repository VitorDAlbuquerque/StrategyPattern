package com.company;

public class Main {

    public static void main(String[] args) {



        País pais1 = new País("Russia", 200000, true, 10000, 90000);
        País pais2 = new País("Ucrania", 50000, false, 2000, 20000);



        if(pais1.isNuclear() && pais2.isNuclear()){
            pais1.setEstrategia(new Diplomacia());
        }

        else if(pais1.getQtd_Soldados() >= pais2.getQtd_Soldados()){
            pais1.setEstrategia(new AtacarSozinho());
        }

        else{
            pais1.setEstrategia(new AliancaVizinho());
        }
        pais1.declararGuerra(pais2);



    }
}
