package com.practica.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos", 25, "carlos@gmail.com", "Desarrollador", 50000.0);
        empleado1.presentarse();

        Empleado empleado2 = new Empleado("Ana", 30, "ana@gmail.com", "Diseñadora", 55000.0);
        empleado2.presentarse();

        Empleado empleado3 = new Empleado("Pedro", 28, "pedro@gmail.com", "Analista", 45000.0);
        empleado3.presentarse();

        Gerente gerente1 = new Gerente("Maria", 40, "maria@gmail.com", "Gerente", 80000.0, "Ventas");
        gerente1.presentarse();

        gerente1.trabajar();

        gerente1.describir();

        empleado1.describir();

        Person personaComun1 = new PersonaComun("Luis", 35, "luis@gmail.com", "Ingeniero");
        personaComun1.describir();

        System.out.println("--------------------EJERCICIO 8------------------------------");

        Empresa empresa = new Empresa("Tech Solutions", "Calle Principal 123");
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        empresa.mostrarEmpleados();
        Empleado empleadoEncontrado = empresa.buscarEmpleado("Carlos");
        if (empleadoEncontrado != null) {
            empleadoEncontrado.presentarse();
        }
        Empleado empleadoEncontrado2 = empresa.buscarEmpleado("Ana");
        if (empleadoEncontrado2 != null) {
            empleadoEncontrado2.presentarse();
        }

        Empleado empleadoEncontrado3 = empresa.buscarEmpleado("Pedro");
        if (empleadoEncontrado3 != null) {
            empleadoEncontrado3.presentarse();
        }

        System.out.println("--------------------EJERCICIO 9------------------------------");

        empresa.registrarEnDirectorio(empleado1);
        empresa.registrarEnDirectorio(empleado2);
        empresa.registrarEnDirectorio(empleado3);
        try {
            Empleado empleadoEncontradoEmail = empresa.buscarPorEmail("carlossss@gmail.com");

            empleadoEncontradoEmail.presentarse();

        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------EJERCICIO 11------------------------------");
        Repositorio<Empleado> repositorioEmpleados = new Repositorio<>();
        repositorioEmpleados.guardar(empleado1);
        repositorioEmpleados.guardar(empleado2);
        repositorioEmpleados.guardar(empleado3);
        repositorioEmpleados.obtenerTodos();

        Repositorio<String> repositorioStrings = new Repositorio<>();
        repositorioStrings.guardar("Hola Mundo");
        repositorioStrings.obtenerTodos();

        System.out.println("--------------------EJERCICIO 12------------------------------");
        Repositorio<Empleado> repositorioEmpleados2 = new Repositorio<>();
        repositorioEmpleados2.guardar(empleado1);
        repositorioEmpleados2.guardar(empleado2);
        repositorioEmpleados2.guardar(empleado3);
        repositorioEmpleados2.ObtenerEmpleadosMayoresDe25();
        repositorioEmpleados2.ObtenerEmpleadosMayusculas(); 
        repositorioEmpleados2.ObtenerPrimerEmpleadoSalarioMayor480000();

    }


    public static void Dividir(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            b = scanner.nextInt();

            System.out.println("El resultado de la división es: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese solo números enteros.");
        } finally {
            System.out.println("Operación de división finalizada.");
            scanner.close();
        }
    }


}
