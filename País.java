package com.company;

public class País {

    String nome;
    int Qtd_Soldados;
    boolean nuclear;
    private IEstrategiaStrategy estrategia;

    public País(String nome, int qtd_Soldados, boolean nuclear) {
        this.nome = nome;
        Qtd_Soldados = qtd_Soldados;
        this.nuclear = nuclear;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_Soldados() {
        return Qtd_Soldados;
    }

    public void setQtd_Soldados(int qtd_Soldados) {
        Qtd_Soldados = qtd_Soldados;
    }

    public boolean isNuclear() {
        return nuclear;
    }

    public void setNuclear(boolean nuclear) {
        this.nuclear = nuclear;
    }

    public IEstrategiaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IEstrategiaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void declararGuerra(País inimigo){

this.estrategia.atacar(inimigo);
this.estrategia.concluir(inimigo);
    }

}
