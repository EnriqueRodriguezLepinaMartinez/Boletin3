/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author Ricky
 */
public class Consumo {
    private float km, litros, vMed, pGas;
    
    public Consumo(){
    }
    public Consumo(float km1,float litros1,float vMed1,float pGas1){
      km = km1;
      litros = litros1;
      vMed = vMed1;
      pGas = pGas1;
    }
    public float getTempo(){
        float tempo = vMed * km;
        return tempo;
    }
    public float consumoMedio(){
        float cM = 100 * litros / km;
        return cM;
    }
    public float consumoEuros(){
         float euros = pGas * litros;
        return euros;
    }
    public void setKm(float kms){
        km = kms;
    }
    public void setLitros(float ltrs){
        litros = ltrs;
    }
    public void setvMed(float vM){
        vMed = vM;
    }
    public void setPGas(float pG){
        pGas = pG;
    }

    
}
