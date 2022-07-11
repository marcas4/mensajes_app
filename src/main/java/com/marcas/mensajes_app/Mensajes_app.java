/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.marcas.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Marcia Castro
 */
public class Mensajes_app {

    public static void main(String[] args) {
     /*    Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.print(e);
        }*/
     
      Scanner sc = new Scanner(System.in);
       
       int opcion=0;
       
       do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
            }
           
       }while(opcion != 5);
    }
}
