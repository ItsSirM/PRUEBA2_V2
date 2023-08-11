package com.mycompany.prueba2_v2;
import java.util.Random;
import java.util.Scanner;
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{
    private Scanner scanner = new Scanner(System.in);
    private Random rng = new Random();
    
    private String palabras[] = new String[10];
    palabras[0] = "gaviota";
    palabras[1] = "azotea";
    palabras[2] = "espacio";
    palabras[3] = "grano";
    palabras[4] = "seguridad";
    palabras[5] = "base";
    palabras[6] = "aceitar";
    palabras[7] = "trepar";
    palabras[8] = "polilla";
    palabras[9] = "adulto";
    
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
        while (intentos>0){
            char letra = scanner.next().charAt(0);
            verificarLetra(letra);
            if (verificarLetra(letra)==true){
                if(hasGanado()==true){
                    System.out.println("Has Ganado");
                }
                else
                    System.out.println("Perdiste Lmao");
            }
            else
                intentos--;
        }
    }
}
