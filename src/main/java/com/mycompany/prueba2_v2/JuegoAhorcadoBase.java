/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2_v2;

/**
 *
 * @author AdminColeexz
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado{
    
    String palabraSecreta;
    String palabraActual;
    int intentos;
    
    abstract void actualizarPalabraActual(char letra);
    abstract boolean verificarLetra(char letra);
    abstract boolean hasGanado();
    
    
    @Override
    public void jugar(){
        
    }
    
   
}
