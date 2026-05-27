package com.practica.demo;

import java.util.ArrayList;

public class Repositorio <T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void guardar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obtener() {
        return elementos.get(0);
    }

    public void obtenerTodos() {
        if (!elementos.isEmpty()) {
            for (T elemento : elementos) {
                System.out.println("Elemento almacenado: " + elemento.toString());
            }
        } else {
            System.out.println("No hay elementos almacenados.");
        }
    }

    public void obtenerPorIndice(int indice) {
        if (!elementos.isEmpty()) {
            if (indice >= 0 && indice < elementos.size()) {
                System.out.println("Elemento en el índice " + indice + ": " + elementos.get(indice));
            } else {
                System.out.println("Índice fuera de rango.");
            }
        } else {
            System.out.println("No hay elementos almacenados.");
        }
    }

    // Usando Stream para Imprime todos los empleados mayores de 25 años
    public void ObtenerEmpleadosMayoresDe25(){
        if (!elementos.isEmpty()){
            elementos.stream()
                    .filter(e -> e instanceof Empleado)
                    .map(e -> (Empleado) e)
                    .filter(empleado -> empleado.getEdad() > 25)
                    .forEach(empleado -> System.out.println("Empleado mayor de 25 años: " + empleado.getNombre()));
        } else {
            System.out.println("No hay elementos almacenados.");
        }
    }

    // Usando Stream para filtrar nombres de empleados en MAYUSCULAS
    public void ObtenerEmpleadosMayusculas(){
        if (!elementos.isEmpty()){
            elementos.stream()
                    .filter(e -> e instanceof Empleado)
                    .map(e -> (Empleado) e)
                    .map(Empleado::getNombre)
                    .map(String::toUpperCase)
                    .forEach(nombre -> System.out.println("Nombre del empleado en mayúsculas: " + nombre));
        } else {
            System.out.println("No hay elementos almacenados.");
        }
    }
    
    // Usando Stream para filtrar el primer empleado con salario mayor a 480000
    public void ObtenerPrimerEmpleadoSalarioMayor480000(){
        if (!elementos.isEmpty()){
            elementos.stream()
                    .filter(e -> e instanceof Empleado)
                    .map(e -> (Empleado) e)
                    .filter(empleado -> empleado.getSalario() > 480000)
                    .findFirst()
                    .ifPresent(empleado -> System.out.println("Primer empleado con salario mayor a 480000: " + empleado.getNombre()));
        } else {
            System.out.println("No hay elementos almacenados.");
        }
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

}



