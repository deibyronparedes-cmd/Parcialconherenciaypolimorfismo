package test;

import modelo.*;

public class TestSistema {

    public static void main(String[] args) {

        // 🔹 Crear estudiantes
        Estudiante e1 = new Estudiante(1, "Juan", 4.0, 3.0);
        Estudiante e2 = new EstudianteBeca(2, "Ana", 3.0, 3.0);

        // 🔹 Prueba cálculo normal
        System.out.println("Definitiva Juan: " + e1.calcularDefinitiva());

        // 🔹 Prueba polimorfismo
        System.out.println("Definitiva Ana (beca): " + e2.calcularDefinitiva());

        // 🔹 Prueba sobrecarga
        e1.modificarNota(2.0, 2.0);
        System.out.println("Juan modificada: " + e1.calcularDefinitiva());

        // 🔹 Prueba incremento
        e1.incrementarDesarrollo(1.0);
        System.out.println("Juan incremento: " + e1.calcularDefinitiva());

        // 🔹 Curso
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