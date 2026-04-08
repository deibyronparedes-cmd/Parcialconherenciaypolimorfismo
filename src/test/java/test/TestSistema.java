package test;

import modelo.*;

public class TestSistema {

    public static void main(String[] args) {

       
        Estudiante e1 = new Estudiante(1, "Juan", 4.0, 3.0);
        Estudiante e2 = new EstudianteBeca(2, "Ana", 3.0, 3.0);

       
        System.out.println("Definitiva Juan: " + e1.calcularDefinitiva());

        
        System.out.println("Definitiva Ana (beca): " + e2.calcularDefinitiva());

        
        e1.modificarNota(2.0, 2.0);
        System.out.println("Juan modificada: " + e1.calcularDefinitiva());

        
        e1.incrementarDesarrollo(1.0);
        System.out.println("Juan incremento: " + e1.calcularDefinitiva());

        
        Curso curso = new Curso(5);
        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);

        System.out.println("\nLista estudiantes:");
        for (int i = 0; i < curso.getCantidad(); i++) {
            Estudiante e = curso.getEstudiante(i);
            System.out.println(e.getNombre() + " -> " + e.calcularDefinitiva());
        }
    }
}