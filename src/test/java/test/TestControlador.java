package test;

import controlador.Controlador;

public class TestControlador {

    public static void main(String[] args) {

        Controlador c = new Controlador();

        c.agregarEstudiante(1, "Carlos", 4.0, 3.0, false);
        c.agregarEstudiante(2, "Laura", 3.0, 3.0, true);

        System.out.println("Inicial:");
        System.out.println(c.mostrarEstudiantes());

        // Modificar
        c.modificarNota(1, 2.0, 2.0);

        // Incrementar
        c.incrementarNota(2, 1.0);

        System.out.println("Después de cambios:");
        System.out.println(c.mostrarEstudiantes());
    }
}