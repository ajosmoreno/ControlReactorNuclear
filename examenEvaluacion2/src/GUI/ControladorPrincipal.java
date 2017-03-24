package GUI;

import Modelo.ControlReactor;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Manuel Moreno Córdoba
 */
public class ControladorPrincipal {
    
    //Atributos del controlador
    private JFramePrincipal vistaPrincipal;
    private ControlReactor controlReactor;
    
    /**
     * Constructor de la clase para conectar el controlador con la vista
     * @param vistaPrincipal 
     */
    public ControladorPrincipal(JFramePrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;
    }
    
    /**
     * Método para inicializar la tabla y el fichero
     */
    public void iniciar(){
        try{
            int numeroBarras = Integer.parseInt(vistaPrincipal.getjTextFieldBarras().getText());
            File archivo = new File(vistaPrincipal.getjTextFieldLog().getText());
            controlReactor = new ControlReactor(numeroBarras, archivo);
            rellenarTabla();
            //Activamos y desactivamos los botones necesarios
            vistaPrincipal.getjButtonSube().setEnabled(true);
            vistaPrincipal.getjButtonBaja().setEnabled(true);
            vistaPrincipal.getjButtonEmergencia().setEnabled(true);
            vistaPrincipal.getjTableBarras().setEnabled(true);
            vistaPrincipal.getjButtonIniciar().setEnabled(false);
            vistaPrincipal.getjTextFieldBarras().setEnabled(false);
            vistaPrincipal.getjTextFieldLog().setEnabled(false);
        } catch(NumberFormatException ex){
            vistaPrincipal.mostrarError("No has introducido un número de barras correcto.");
        } catch(IOException ex){
            vistaPrincipal.mostrarError("No se ha podido escribir el archivo para el log.");
        }
    }
    
    /**
     * Rellenamos la tabla
     */
    public void rellenarTabla(){
        int numeroBarras = controlReactor.devolverNumeroBarras();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] valorBarra = new String[numeroBarras];
        //Añadimos las columnas
        for(int i = 0; i < numeroBarras; i++){
            modelo.addColumn(i + 1);
        }
        //Añadimos las filas
        for(int i = 0; i < numeroBarras; i++){
            for(int j = 0; j < numeroBarras; j++){
                if(controlReactor.estadoBarra(i, j)) valorBarra[j] = "B";
                else valorBarra[j] = "S";  
            }
            modelo.addRow(valorBarra);
        }
        //Ponemos el modelo a la tabla
        vistaPrincipal.getjTableBarras().setModel(modelo);
    }
    
    /**
     * Subimos la barra seleccionada
     */
    public void subirBarra(){
        if(vistaPrincipal.getjTableBarras().getSelectedRow() < 0){
            vistaPrincipal.mostrarError("No hay ninguna barra seleccionada.");
        } else{
            try{
                String valorActual = vistaPrincipal.getjTableBarras().getValueAt(vistaPrincipal.getjTableBarras().getSelectedRow(), vistaPrincipal.getjTableBarras().getSelectedColumn()).toString();
                if(valorActual != "S"){
                    controlReactor.subirBarra(vistaPrincipal.getjTableBarras().getSelectedRow(), vistaPrincipal.getjTableBarras().getSelectedColumn());
                    rellenarTabla();
                } else{
                    vistaPrincipal.mostrarError("La barra ya está subida.");
                }
            } catch(IOException ex){
                vistaPrincipal.mostrarError("Error al escribir en el log.");
            }
        }
    }
    
    /**
     * Bajamos la barra seleccionada
     */
    public void bajarBarra(){
        if(vistaPrincipal.getjTableBarras().getSelectedRow() < 0){
            vistaPrincipal.mostrarError("No hay ninguna barra seleccionada.");
        } else{
            try{
                String valorActual = vistaPrincipal.getjTableBarras().getValueAt(vistaPrincipal.getjTableBarras().getSelectedRow(), vistaPrincipal.getjTableBarras().getSelectedColumn()).toString();
                if(valorActual != "B"){
                    controlReactor.bajarBarra(vistaPrincipal.getjTableBarras().getSelectedRow(), vistaPrincipal.getjTableBarras().getSelectedColumn());
                    rellenarTabla();
                } else{
                    vistaPrincipal.mostrarError("La barra ya está bajada.");
                }
            } catch(IOException ex){
                vistaPrincipal.mostrarError("Error al escribir en el log.");
            }
        }
    }
    
    /**
     * Bajamos todas las barras porque estamos en una situación crítica
     */
    public void emergencia(){
        for(int i = 0; i < controlReactor.devolverNumeroBarras(); i++){
            for(int j = 0; j < controlReactor.devolverNumeroBarras(); j++){
                try{
                    controlReactor.bajarBarra(i, j);
                } catch(IOException ex){
                    vistaPrincipal.mostrarError("Error al escribir en el log.");
                }
            }
        }
        rellenarTabla();
        vistaPrincipal.mostrarMensaje("Reactor reiniciado.");
    }
}
