package com.practica.demo;

public class PersonaComun extends Person {
    private String ocupacion;

    public PersonaComun(String nombre, int edad, String email, String ocupacion) {
        super(nombre, edad, email);
        this.ocupacion = ocupacion;
    }

    public void describir() {
        System.out.println("Soy una persona común y mi nombre es " + getNombre() + " y mi ocupación es " + ocupacion);
    }
    
}
