package com.practica.demo;

public class Empleado extends Person implements Trabajable {
    private String puesto;
    private Double salario;
    public Empleado(String nombre, int edad, String email, String puesto, Double salario) {
        super(nombre, edad, email);
        this.puesto = puesto;
        this.salario = salario;
    }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

    @Override
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + getNombre() + ", tengo " + getEdad() + " años y mi correo electrónico es " + getEmail() + " Mi puesto es " + puesto + " y mi salario es " + salario  );
    }

    @Override
    public void trabajar() {
        System.out.println(" Estoy trabajando como " + puesto);
    }

    @Override
    public void describir() {
        System.out.println("Soy un empleado y mi puesto es " + puesto);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", email='" + getEmail() + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
