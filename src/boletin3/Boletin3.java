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
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumo n1 = new Consumo();
        n1.setLitros(50f);
        n1.setPGas(1.57f);
        Consumo n2 = new Consumo(34f, 232f, 10f,1.4f);
        System.out.println(n2.consumoMedio());
        n2.setLitros(70f);
    }
    
}
