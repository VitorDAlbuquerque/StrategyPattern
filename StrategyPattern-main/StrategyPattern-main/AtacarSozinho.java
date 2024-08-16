package com.company;

public class AtacarSozinho implements IEstrategiaStrategy {

    public void agir(País inimigo){
        System.out.println("\n PLantar evidencias falsas \n soltar bombas \n Derrubar governo");

    }
    public void concluir(País inimigo) {

        System.out.println("\n Estabelecer governo amigo");
    }


}
