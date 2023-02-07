package naves;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import naves.modelo.*;
public class main 
{

    public static void main(String[] args) 
    {
//   IMenu datos= new Nave(nombreDeLaNave,Mision,EnServicio, AgenciaALaQuePertenece);
        // TODO code application logic here
     //ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList   
     //----------------------------------------------------------------------
     //Nave nave;
      //  Nave nave=new Nave(nombreDeLaNave, Mision, EnServicio,AgenciaALaQuePertenece);
        IMenu datos= new iplementaIMenu();
      CERRAR:
  while(true)
  { String opcion=JOptionPane.showInputDialog(null,
          "1 -Insertar Nave\n"
          + "2 -Listar Nave\n" 
          + "3 -Buscar Nave\n"
          + "4 -salir",
          "Ingrese una opcion",3);
  
   switch(opcion)
    {
        case "1":
            String nombreDeLaNave=JOptionPane.showInputDialog(null,
                    "INGRESE EL NOMBRE DE LA NAVE","Nombre de la nave",3);
            String Mision=JOptionPane.showInputDialog(null,
                    "INGRESE LA MISION DE LA NAVE","Mision a la que esta destinada",3);
            String Servicio=JOptionPane.showInputDialog(null,
                    "INGRESE false o true para indicar si la nave esta en servicio","Esta en servicio?",3);
           Boolean EnServicio=Boolean.parseBoolean(Servicio);
            String AgenciaALaQuePertenece=JOptionPane.showInputDialog(null,
                    "INGRESE AGENCIA A LA QUE PERTENECE","Agencia",3);
           // ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList
             // ListaNaves.add(new Nave("Apolo",carga,"EE,UU", "EE,UU"));
            
         //  Nave nave=new Nave(nombreDeLaNave, Mision, EnServicio,AgenciaALaQuePertenece);
     //      IMenu datos= new iplementaIMenu();        
            datos.insertarNave(nombreDeLaNave, Mision,EnServicio,AgenciaALaQuePertenece);
            
//            ListaNaves.add(nave1);
//            System.out.println(nave.listarNave()); 
            
//             for(Nave a:ListaNaves)
//             {System.out.println(a.toString());
//             }
            break;
        case"2":  
           //IMenu datos= new Nave();
            
            datos.listarNave();
         // ListaNaves.nave1();
            
            break;
        case "3":
//            nombrePelicula=JOptionPane.showInputDialog(
//                    null,
//                    "INGRESE EL NOMBRE DE LA PELICULA",
//                    "Ingrese",3);
//            peliculas.buscarPelicula(nombrePelicula);
        case "4":
           break CERRAR;
        default:
            JOptionPane.showMessageDialog(null,
                    "OPCION INCORRECTA\n"
            + "VUELVE A INGRESAR UNA\n"
            + "OPCION CORRECTA\n"
            + "LAS OP`CIONES SON DEL 1 AL 4",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            
    }
  }
        
        
     //----------------------------------------------------------------------   
     /*   Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el nombre del nave");
        String carga=sc.nextLine();
        ArrayList<Nave> ListaNaves= new ArrayList<Nave>();//defino un ArrayList
 //       Nave nave1=new Nave("Apolo",carga,true,"EE,UU");
        ListaNaves.add(new Nave("Apolo",carga,"EE,UU", "EE,UU"));//instanciamos el objeto Nave
        ListaNaves.add(new Nave("creep","mantenimiento","EE,UU", "EE,UU"));
// Nave nave1=new Nave("Apolo",carga,true,"EE,UU");
        //nave1.setMision(carga);
//        System.out.println(nave1.getMision());*/
//        for(Nave e :ListaNaves)
//        {
//            System.out.println(e.recuperarDatos());
//        }
        
    }
    
}
