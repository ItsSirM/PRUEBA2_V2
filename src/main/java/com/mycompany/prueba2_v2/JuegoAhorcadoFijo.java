package com.mycompany.prueba2_v2;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabra){
        palabraSecreta = palabra;
        palabraActual = "_".repeat(palabraSecreta.length());
        intentos = 5;
    }
 
  
    boolean hasGanado() {
       if(palabraActual.equals(palabraSecreta))
           return true;
       return false;
    }

    @Override
    String actualizarPalabraActual(char letra) {
        for(int i = 0; i<palabraActual.length()-1; i++){
            if(palabraActual.charAt(i)==letra){
                palabraActual = palabraActual.replace(palabraActual.charAt(i), letra);
                System.out.println(palabraActual);
            }
        }   
        return palabraActual;
    }

    @Override
    boolean verificarLetra(char letra) {
        int c=0;
        for(int i = 0; i<palabraSecreta.length()-1; i++){
            if (palabraSecreta.charAt(i)==letra)
                c++;
        }
        
        if (c>0)
            return true;
        return false;
    }

    @Override
    public void inicializarPalabraSecreta() {
        
    }

    @Override
    public void jugar() {
        inicializarPalabraSecreta();
        FIJO_AZAR azar = new FIJO_AZAR();
        azar.setVisible(true);
        azar.setLocationRelativeTo(null);
    }
    
    public void reset(){
        palabraActual = "_".repeat(palabraSecreta.length());
    }
   
}
