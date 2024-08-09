package com.company;

public class Main {

    public static void main(String[] args) {

        País pais1 = new País("Russia", 200000, true);
        País pais2 = new País("Ucrania", 50000, false);


        if(pais1.getQtd_Soldados() > pais2.getQtd_Soldados()){
            pais1.setEstrategia(new AtacarSozinho());
            pais1.declararGuerra(pais2);
        }
        else{
            pais1.setEstrategia(new Diplomacia());
            pais1.declararGuerra(pais2);
        }

    }
}
