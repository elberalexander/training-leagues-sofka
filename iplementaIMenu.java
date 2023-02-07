/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naves.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author elber
 */
public class iplementaIMenu implements IMenu {
 ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList    ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList  
    @Override
    public void insertarNave(String nombreDeLaNave, String Mision, boolean EnServicio, String AgenciaALaQuePertenece) {
     Nave nave1=new Nave(nombreDeLaNave, Mision, EnServicio,AgenciaALaQuePertenece);
            ListaNaves.add(nave1);    
    }

    @Override
    public void listarNave() {
    JOptionPane.showMessageDialog(null, this.ListaNaves, "LISTA NAVES",JOptionPane.INFORMATION_MESSAGE);  
    for(Nave a:ListaNaves)
       System.out.println(a.toString());
    }

    @Override
    public void buscarNave(String nombreDeLaNave) {
      
    }
    
}
