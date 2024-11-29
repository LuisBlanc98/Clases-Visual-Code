package es.curso;

public class Persona {

    public int edad;
    public String nombre;

    //una clase siempre lleva propiedades y funciones
    //solo se puede dar Run As a un Main, no a una persona
    public boolean esMayorDeEdad() {

        if (edad>18) {

            return true;

        }else return false;
        
        }
    }