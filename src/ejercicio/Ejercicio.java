package ejercicio;

import javax.swing.JOptionPane;

/**
 *Nombre de la Clase: Ejercicio
 * Fecha: 18/04/2018
 * Version: 1.0
 * CopyRight: MiguelCoreas
 * @author corea
 */
public class Ejercicio {

    public static void main(String[] args) {
         //variables 
        String nombre[] = new String[999];
        int edad[] = new int[999];
        
        //contadores y acumuladores
        int menu=0;
        int numIngre=0;
        String Historial="";
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1.-INGRESAR\n2.-MOSTRAR\n3.-SALIR\n"));
             
            //Añadido desde GitHub
                switch(menu){
                    case 1:
                        nombre[numIngre] = JOptionPane.showInputDialog("Ingrese el nombre");
                        edad[numIngre] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                        JOptionPane.showMessageDialog(null, "Ingresado Correctamente","Atencion",1);
                        Historial = Historial+"\nRegistro N°"+(numIngre+1)+
                                    "\nNombre: "+nombre[numIngre]+
                                    "\nEdad: "+edad[numIngre];
                        numIngre++;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "HISTORIAL","Atencion",1);
                        for(int i=0; i<numIngre; i++){
                             JOptionPane.showMessageDialog(null, "\nRegistro N°"+(i+1)+
                                   "\nNombre: "+nombre[i]+
                                   "\nEdad: "+edad[i],"Atencion",1);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opcion habilitada","Atencion",0);
                        break;    
                }
        }while(menu!=3); //Fin del Do  

    }
    
}
