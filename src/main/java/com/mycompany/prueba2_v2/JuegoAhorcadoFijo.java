/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2_v2;

/**
 *
 * @author AdminColeexz
 */
public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabra){
        palabraSecreta = palabra;
        palabraActual = "_".repeat(palabraSecreta.length());
    }
 
  
    boolean hasGanado() {
       if(palabraActual.equals(palabraSecreta))
           return true;
       return false;
    }

    @Override
    void actualizarPalabraActual(char letra) {
        for(int i = 0; i<palabraActual.length()-1; i++){
            if(palabraActual.charAt(i)==letra){
                palabraActual.replace(palabraActual.charAt(i), letra);
            }
        }
    }

    @Override
    boolean verificarLetra(char letra) {
        for(int i = 0; i<palabraActual.length()-1; i++){
            if (palabraActual.charAt(i)==letra){
                return true;
            }
        }
        return false;
    }

    @Override
    public void inicializarPalabraSecreta() {
        
    }
    
}