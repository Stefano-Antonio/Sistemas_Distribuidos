/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

/**
 *
 * @author stimp
 */
import java.rmi.*;

public interface InterfazRemota extends Remote {

    public String holaMundo() throws RemoteException;

    String holaMundo();

}
