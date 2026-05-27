package com.practica.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Empresa {
    private String nombre;
    private String direccion;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            e.presentarse();
        }
    }

    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Empleado encontrado: " + e.getNombre());
                return e;
            }
        }
        System.out.println("Empleado no encontrado: " + nombre);
        return null;
    }

    HashMap<String, Empleado> empleadosMap = new HashMap<>();

    public void registrarEnDirectorio(Empleado e) {
        empleadosMap.put(e.getEmail(), e);
    }

    public Empleado buscarPorEmail(String email) throws EmpleadoNoEncontradoException {
        Empleado e = empleadosMap.get(email);
        
        if (e != null) {
            System.out.println("Empleado encontrado: " + e.getNombre());
            return e;
        } else {
            throw new EmpleadoNoEncontradoException("Empleado no encontrado con email: " + email);
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
