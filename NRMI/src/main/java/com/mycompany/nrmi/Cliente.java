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
public class Cliente {
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",3000);
            Interface anInterface =(Interface) registry.lookup("Calculadora");
            float resultadosuma = anInterface.suma(20, 30);
            System.out.println("El resultado de la suma es : " + resultadosuma);
        }catch(Exception e){
            System.out.println("Error = " + e.getMessage());
            
        }
    }
    
}
