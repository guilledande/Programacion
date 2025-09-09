/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico7;

/**
 *
 * @author CS
 */
public class ValidadorReservas {
    
    private boolean[] asientos;
    
    public ValidadorReservas(int capacidad){
    asientos= new boolean[capacidad]; //false libre, true ocpado

    }
    
    public void reservarAsientos(int numeroAsiento)throws AsientoInvalidoException, AsientoOcupadoException, SalaLlenaException{
    
    if(numeroAsiento<1 || numeroAsiento> asientos.length){
    throw new AsientoInvalidoException("Asiento invalido, debe estar entre 1 y "+asientos);
    }    
    
    if (asientos[numeroAsiento-1]){
    throw new AsientoOcupadoException("Asiento ocipado, elija otro");
    }
    asientos[numeroAsiento-1]=true;
    if(salaLlena()){
    throw new SalaLlenaException("La sala esta llena");
    }
    }
    
    public boolean salaLlena() {
        for (boolean ocupado : asientos) {
            if (!ocupado) return false;
        }
        return true;
    }
    public void mostrarAsientos() {
    System.out.print("Estado de los asientos: ");
    for (int i = 0; i < asientos.length; i++) {
        String etiqueta = "A" + (i + 1);
        System.out.print("[" + etiqueta + (asientos[i] ? " OCUPADO" : " LIBRE") + "] ");
    }
    System.out.println();
}

}
    


