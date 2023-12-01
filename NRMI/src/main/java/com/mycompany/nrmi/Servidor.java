/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nrmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author aldo
 */
public class Servidor {
    public static void main(String[] args){
        try{
            Registry registry =LocateRegistry.createRegistry(3000);
            Interface anInterface = new ImplementarInterfaz();
            registry.bind("Calculadora", anInterface);
            System.out.println("Servidor corriendo en el puerto 3000");
            }catch(Exception e){
                System.out.println("e.getMenssage()=" + e.getMessage());
        
            }
    } 
}
