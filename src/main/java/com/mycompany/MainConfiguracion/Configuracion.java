/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MainConfiguracion;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author wsant
 */
public class Configuracion {
    
    //Si se cumple el principio de OCP, ya que las clases deben estar abiertas para la extensión pero cerradas para la modificación.
    //utiliza una colección de objetos RecursoPersistente para manejar diferentes tipos de configuraciones.
    
    //Si cumple con el principio de LISKOV
    Vector<RecursoPersistente> conf = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() { //itera sobre la colección y llama al método load() de cada objeto, sin necesidad de saber el tipo específico de cada configuración.
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());

        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext();) {
            i.next().load();
        }
    }

    public void salvarConfiguracion() { //itera sobre la colección y llama al método save() de cada objeto, sin necesidad de saber su tipo específico.
        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext();) {
            i.next().save();
        }
    }
}
