package com.mycompany.prueba2_v2;
import java.util.Random;
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{
    private Random rng = new Random();
    
    private String palabras[] = new String[10];
    
    public void inicializarPalabraSecreta(){
        int index = rng.nextInt(0, 10);
        palabraSecreta = palabras[index];
    }
    
    public void actualizarPalabraActual(char letra){
        for(int i = 0; i<palabraActual.length()-1; i++){
            if(palabraActual.charAt(i)==letra){
                palabraActual.replace(palabraActual.charAt(i), letra);
            }
        }
    }
    
    public boolean verificarLetra(char letra){
        for(int ix=0; ix<palabraSecreta.length(); ix++){
            if(palabraSecreta.charAt(ix)==letra){
                actualizarPalabraActual(letra);
            }
            else
                return false;
        }
        return true;
    }
    
    public boolean hasGanado() {
       if(palabraActual.equals(palabraSecreta))
           return true;
       return false;
    }
    
    public void jugar(){
        inicializarPalabraSecreta();
        new AZAR_SWING().setVisible(true);
    }
}
