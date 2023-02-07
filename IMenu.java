
package naves.modelo;

public interface IMenu {
    void insertarNave(String nombreDeLaNave, String Mision, boolean EnServicio, String AgenciaALaQuePertenece1);
     void listarNave();
     void buscarNave(String nombreDeLaNave);
    
}
