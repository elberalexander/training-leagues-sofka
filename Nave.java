
package naves.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import naves.main;
public class Nave  {
//-----Atributos------ 
    ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList    ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList   
    private String nombreDeLaNave;
    private String Mision;
    private boolean EnServicio;
    private String AgenciaALaQuePertenece;
  //-----------Constructor-----   
    public Nave(String nombreDeLaNave, String Mision, boolean EnServicio, String AgenciaALaQuePertenece) {
       this.nombreDeLaNave = nombreDeLaNave;
       this.Mision = Mision;
       this.EnServicio = EnServicio;
       this.AgenciaALaQuePertenece = AgenciaALaQuePertenece;
    }

    public Nave() {
    }
  //----------------Metodos get y set---------------------
    public String getNombreDeLaNave() {
        return nombreDeLaNave;
    }

    public void setNombreDeLaNave(String nombreDeLaNave) {
        this.nombreDeLaNave = nombreDeLaNave;
    }

    public String getMision() {
        return Mision;
    }

    public void setMision(String Mision) {
        this.Mision = Mision;
    }

    public boolean isEnServicio() {
        return EnServicio;
    }

    public void setEnServicio(boolean EnServicio) {
        this.EnServicio = EnServicio;
    }

    public String getAgenciaALaQuePertenece() {
        return AgenciaALaQuePertenece;
    }

    public void setAgenciaALaQuePertenece(String AgenciaALaQuePertenece) {
        this.AgenciaALaQuePertenece = AgenciaALaQuePertenece;
    }
//    ------------Metodos---------------------------
//    public void ListarNaves() {
//        JOptionPane.showMessageDialog(null, this.ListaNaves, "LISTA DE PELICULAS",JOptionPane.INFORMATION_MESSAGE);
    @Override
    public String toString()
    {
        return "Nave{" + "nombreDeLaNave=" + nombreDeLaNave + ", Mision=" + Mision + ", EnServicio=" + EnServicio + ", AgenciaALaQuePertenece=" + AgenciaALaQuePertenece + '}' ;
    }        

//    }

   

       

    

   

   
    
}
