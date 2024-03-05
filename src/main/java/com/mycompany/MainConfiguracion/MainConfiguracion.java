/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MainConfiguracion;

/**
 *
 * @author wsant
 */
public class MainConfiguracion {
   
    public static void main(String[] args) {
        
        //Crea una instancia de la clase Configuracion
        Configuracion configuracion = new Configuracion();
        
        // Cargar la configuración llamando al método cargarConfiguracion() de la instancia configuracion
        configuracion.cargarConfiguracion();
        
        // Salvar la configuración llamando al método salvarConfiguracion() de la instancia configuracion
        configuracion.salvarConfiguracion();
    }
}

