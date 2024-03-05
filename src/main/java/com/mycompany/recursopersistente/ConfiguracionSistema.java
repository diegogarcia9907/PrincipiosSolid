/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursopersistente;

/**
 *
 * @author wsant
 */
public class ConfiguracionSistema implements RecursoPersistente{

    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}
