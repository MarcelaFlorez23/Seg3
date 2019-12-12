/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Laboratorio
 */

    public class Profesor extends Persona{
private String horario;
public Profesor(){}

public Profesor (String nombre){
    this.nombre=nombre;
}
public Profesor (String nombre, String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
}
public Profesor (String nombre, String apellido, int edad, String horario){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.horario=horario;
}

public void setHorario (String Diurno){
    this.horario=Diurno;
}
public String getHorario(){
    return this.horario;
            
}
 @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
            this.apellido=apellido;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setEdad(int edad) {
          this.edad=edad;
    }

    @Override
    public int getEdad() {
       return this.edad;
    }

    public String getHorario(String diurno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


