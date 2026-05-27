package com.practica.demo;

public abstract class Person {
    private String nombre;
    private int edad;
    private String email;

    public Person(String nombre, int edad, String email) {
        this.nombre = nombre;
        setEdad(edad);
        this.email = email;
    }


    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años y mi correo electrónico es " + email);
    }

    public abstract void describir();

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 1;
            System.out.println("Edad invalida");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}