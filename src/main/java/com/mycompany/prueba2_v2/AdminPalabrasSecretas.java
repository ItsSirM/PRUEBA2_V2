/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba2_v2;

import java.util.ArrayList;
import java.util.Random;

public class AdminPalabrasSecretas {
    
    ArrayList<String> palabrasSecretas;
    private Random random;

    public AdminPalabrasSecretas() {
        palabrasSecretas = new ArrayList<>();
        random = new Random();
    }

    public void agregarPalabraSecreta(String palabra) {
        palabrasSecretas.add(palabra);
    }

    public String seleccionarPalabraAzar() {
        int indiceAzar = random.nextInt(palabrasSecretas.size());
        return palabrasSecretas.get(indiceAzar);
    }
    
}
