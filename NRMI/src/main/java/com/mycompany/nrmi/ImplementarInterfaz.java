/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author aldo
 */
public class ImplementarInterfaz extends UnicastRemoteObject implements Interface{
    
    protected ImplementarInterfaz() throws RemoteException{
        super();
    }

    @Override
    public float suma(float n1, float n2) throws RemoteException {
        return n1 + n2;
    }

    @Override
    public float resta(float n1, float n2) throws RemoteException {
        return n1 - n2;
    }

    @Override
    public float division(float n1, float n2) throws RemoteException {
        return n1 / n2;
    }

    @Override
    public float multiplicación(float n1, float n2) throws RemoteException {
        return n1 * n2;
    }
    
}
