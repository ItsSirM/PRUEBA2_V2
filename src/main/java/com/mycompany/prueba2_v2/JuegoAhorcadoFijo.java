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
            if (palabraActual.charAt(i)==letra)
                return true;
        }
        return false;
    }

    @Override
    public void inicializarPalabraSecreta() {
        palabraSecreta = palabraActual;
    }

    @Override
    public void jugar() {
        inicializarPalabraSecreta();
        FIJO_AZAR azar = new FIJO_AZAR();
        azar.setVisible(true);
        azar.setLocationRelativeTo(null);
    }
    
   
}
