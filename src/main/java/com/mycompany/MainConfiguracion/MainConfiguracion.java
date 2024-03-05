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
        
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
    
        configuracion.salvarConfiguracion();
    }
}

