package com.company;

import java.util.Random;

import com.company.Pais;

public class Diplomacia implements IEstrategiaStrategy {
Random random = new Random();


    double percentual =  (double) (random.nextInt(10)+1) / 100;

    public void agir(Pais seuPais, Pais inimigo) {


        if (seuPais.economia > inimigo.economia && seuPais.territorio > inimigo.territorio){
            recuarTropas(inimigo);
        }
        else{
            proporCooperacaoEconomica(seuPais, inimigo);
        }



    }


    public void concluir(Pais inimigo) {

        desarmar(inimigo);

        }


    public void recuarTropas(Pais inimigo) {
        System.out.println("As tropas voltaram para seu país de origem");
        concluir(inimigo);
    }

    public void desarmar(Pais inimigo){
        inimigo.nuclear = false;
    }

    public void proporCooperacaoEconomica(Pais seuPais, Pais inimigo) {


            if (seuPais.territorio > inimigo.territorio) {
                seuPais.setEconomia(seuPais.economia + (inimigo.economia * percentual));
                inimigo.setEconomia(inimigo.economia - (inimigo.economia * percentual));
                seuPais.setTerritorio(seuPais.territorio - (seuPais.territorio * percentual));
                inimigo.setEconomia(inimigo.territorio + (seuPais.territorio * percentual));
            }
            else {
                seuPais.setEconomia(seuPais.economia - (seuPais.economia * percentual));
                inimigo.setEconomia(inimigo.economia + (seuPais.economia * percentual));
                seuPais.setTerritorio(seuPais.territorio + (inimigo.territorio * percentual));
                inimigo.setEconomia(inimigo.territorio - (inimigo.territorio * percentual));
            }

            recuarTropas(inimigo);

    }

// foi discutido com o grupo e na teoria não tem sentido só um país ganhar em uma diplomacia então vamos deixar só uma função


//    public void proporCooperacaoTerritorial(Pais seuPais, Pais inimigo){
//seuPais.setTerritorio(seuPais.territorio + (inimigo.territorio * percentual));
//            inimigo.setEconomia(inimigo.territorio - (inimigo.territorio * percentual));
//    }


}

