/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegProyecto_Eje2;

import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class SegProyecto_Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList <Persona>();
        
        int opcion;
          do
     {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Datos de los Estudiantes \n" 
                + "2. Datos de los Profesores \n"
                + "3. Salir\n",JOptionPane.INFORMATION_MESSAGE));
       switch (opcion){
           
               case 1:
      
      Scanner sc = new Scanner (System.in);
      
        Persona fulanito = new Estudiante();
        String nombre = fulanito.nombre;
        String apell = fulanito.apellido;
        int edad = fulanito.getEdad();
       
        ((Estudiante)fulanito).setNota(100);
       
        System.out.println("Digite su nombre");
        nombre=sc.next();
        System.out.println("Digite su apellido");
        apell = sc.next();
        System.out.println("Digite su edad");
        edad = sc.nextInt();
        
        fulanito.setNombre(nombre);
        fulanito.setApellido(apell);
        fulanito.setEdad(edad);
        
        
        personas.add(fulanito);
                   System.out.println();
                   System.out.println("LOS DATOS INGRESADOS SON: \n");
                   System.out.println("Nombre: " + fulanito.getNombre());
                   System.out.println("Apellido: " + fulanito.getApellido());
                   System.out.println("Edad: " +fulanito.getEdad());
                   System.out.println("Nota: " + 100);
        
                   break;
               case 2:
                    Scanner scs = new Scanner (System.in);
      
      
        Persona sutanito = new Profesor();
        String nombreP = sutanito.nombre;
        String apellido = sutanito.apellido;
        int edadP = sutanito.getEdad();
        ((Profesor)sutanito).setHorario("Diurno");
        
        System.out.println("Digite su nombre");
       nombreP = scs.next();
        System.out.println("Digite su apellido");
        apellido = scs.next();
        System.out.println("Digite su edad");
        edadP = scs.nextInt();
        sutanito.setNombre(nombreP);
       sutanito.setApellido(apellido);
        sutanito.setEdad(edadP);
        
        personas.add(sutanito);
                   System.out.println();
                   System.out.println("LOS DATOS INGRESADOS SON: \n");
                   System.out.println("Nombre: " + sutanito.getNombre());
                   System.out.println("Apellido: " + sutanito.getApellido());
                   System.out.println("Edad: " + sutanito.getEdad());
                   System.out.println("Horario: " + "Diurno");
        
                   break;
               case 3:
                  
               JOptionPane.showMessageDialog(null, "Aplicacion Finalizada ");  
               break;
           
                   default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");  
           break;
                   
                   
           }
        } while (opcion != 3);
       }
        
    
  
    private static void printPersonas(List<Persona> personas){
        //este for solo en elementos iterables o recorrer
        for(Persona persona : personas){
            System.out.println(persona.getNombre());
           
            }
        }
   
     }  

