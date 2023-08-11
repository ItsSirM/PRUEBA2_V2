package com.mycompany.prueba2_v2;



import java.util.Random;
import java.util.ArrayList;
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{
    private Random rng = new Random();
    
    public ArrayList<String> palabras;
    
    public JuegoAhorcadoAzar(){
        palabras = new ArrayList();
        
        palabras.add("gaviota");
        palabras.add("eiffel");
        palabras.add("torre");
        palabras.add("ciudad");
        palabras.add("ciudad");
        palabras.add("erick");
    }
    
     
    public void inicializarPalabraSecreta(){
        int index = rng.nextInt(0, 10);
        palabraSecreta = palabras.get(index);
    }
    
    public String  actualizarPalabraActual(char letra){
        for(int i = 0; i<palabraActual.length()-1; i++){
            if(palabraActual.charAt(i)==letra){
                palabraActual = palabraActual.replace(palabraActual.charAt(i), letra);
            }
        }
        return palabraActual;
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
