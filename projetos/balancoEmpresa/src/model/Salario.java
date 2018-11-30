package model;
public class Salario {
    private float gastosJaneiro;
    private float gastosFevereiro;
    private float gastosMarco;
    private float gastosTrimestre;
    private float mediaMensal;

    public float getGastosJaneiro() {
        return gastosJaneiro;
    }

    public float getGastosFevereiro() {
        return gastosFevereiro;
    }

    public float getGastosMarco() {
        return gastosMarco;
    }

    public float getGastosTrimestre() {
        gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        return gastosTrimestre;
    }
    public float getMediaMensal(){
        mediaMensal = gastosJaneiro + gastosFevereiro + gastosMarco / 3;
        return mediaMensal;
    }

    public void setGastosJaneiro(float gastosJaneiro) {
        this.gastosJaneiro = gastosJaneiro;
    }

    public void setGastosFevereiro(float gastosFevereiro) {
        this.gastosFevereiro = gastosFevereiro;
    }

    public void setGastosMarco(float gastosMarco) {
        this.gastosMarco = gastosMarco;
    }

}
