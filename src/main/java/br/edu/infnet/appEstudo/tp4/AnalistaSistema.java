package br.edu.infnet.appEstudo.tp4;

public class AnalistaSistema extends Funcionario{
    private int qtdeSistema;
    private int tempoExperiencia;

    @Override
    public String toString() {
        return super.toString() + " " + qtdeSistema + ", " + tempoExperiencia;
    }
    
    @Override
    public float calcularSalario(){
        return salario + Constantes.VL_SISTEMA * 1000 + tempoExperiencia * Constantes.VL_EXPERIENCIA;
    }

    public int getQtdeSistema() {
        return qtdeSistema;
    }

    public void setQtdeSistema(int qtdeSistema) {
        this.qtdeSistema = qtdeSistema;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }
}


