package com.practica.demo;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, String email, String puesto, Double salario, String departamento) {
        super(nombre, edad, email, puesto, salario);
        this.departamento = departamento;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + getNombre() + ", tengo " + getEdad() + " años y mi correo electrónico es " + getEmail() + " Mi puesto es " + getPuesto() + " y mi salario es " + getSalario() + " y trabajo en el departamento de " + departamento);
    } 
    
    @Override
    public void describir() {
        System.out.println("Soy un gerente y trabajo en el departamento de " + departamento);
    }
}
