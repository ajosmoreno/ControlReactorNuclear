package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase ControlReactor de la que crearemos objetos
 * @author José Manuel Moreno Córdoba
 */
public class ControlReactor {
    
    //Atributos del Control del reactor
    private File log;
    private boolean[][] estadoBarras;
    
    /**
     * Constructor que recibe los parámetros del número de barras y el archivo donde guardaremos un log
     * @param n Número de barras del reactor
     * @param archivo Archivo donde guardaremos el log
     * @throws IOException Error cuando no se puede crear el archivo del log
     */
    public ControlReactor(int  n, File archivo) throws IOException{
        estadoBarras = new boolean[n][n];
        log = archivo;
        if(!log.exists()) log.createNewFile();
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                estadoBarras[i][j] = true;
            }
        }
    }
    
    /**
     * Método para subir una barra
     * @param i Fila de la barra
     * @param j Columna de la barra
     * @throws IOException 
     */
    public void subirBarra(int i, int j) throws IOException{
        if(!log.exists()) log.createNewFile();
        estadoBarras[i][j] = false;
        PrintWriter pw = new PrintWriter(new FileWriter(log, true));
        String cadena = System.currentTimeMillis() + "," + i + "," + j + ",SUBIR";
        pw.println(cadena);
        pw.close();       
    }
    
    /**
     * Método para bajar una barra
     * @param i Fila de la barra
     * @param j Columna de la barra
     * @throws IOException 
     */
    public void bajarBarra(int i, int j) throws IOException{
        if(!log.exists()) log.createNewFile();
        estadoBarras[i][j] = true;
        PrintWriter pw = new PrintWriter(new FileWriter(log, true));
        String cadena = System.currentTimeMillis() + "," + i + "," + j + ",BAJAR";
        pw.println(cadena);
        pw.close();
    }
    
    /**
     * Método que devuelve el valor de una barra en concreto
     * @param i Fila de la barra
     * @param j Columna de la barra
     * @return Valor de la barra
     */
    public boolean estadoBarra(int i, int j){
        return estadoBarras[i][j];
    }
    
    /**
     * Método para bajar todas las barras
     * @throws IOException 
     */
    public void emergencia() throws IOException{
        for(int i = 0; i < estadoBarras.length; i++){
            for(int j = 0; j < estadoBarras.length; j++){
                bajarBarra(i, j);
            }
        }
    }
    
    /**
     * Devuelve el número de barras del control del reactor.
     * @return 
     */
    public int devolverNumeroBarras(){
        return estadoBarras.length;
    }
}
