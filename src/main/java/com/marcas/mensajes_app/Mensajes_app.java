/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.marcas.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author Marcia Castro
 */
public class Mensajes_app {

    public static void main(String[] args) {
         Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
