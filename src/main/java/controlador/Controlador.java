package controlador;

import modelo.*;

public class Controlador {

    private final Curso curso;

    public Controlador() {
        curso = new Curso(10);
    }

    public void agregarEstudiante(int cod, String nom, double nd, double nm, boolean beca) {

        Estudiante e;

        if (beca) {
            e = new EstudianteBeca(cod, nom, nd, nm);
        } else {
            e = new Estudiante(cod, nom, nd, nm);
        }

        curso.agregarEstudiante(e);
    }

    public void modificarNota(int cod, double nd, double nm) {

        for (int i = 0; i < curso.getCantidad(); i++) {

            Estudiante e = curso.getEstudiante(i);

            if (e.getCodigo() == cod) {
                e.modificarNota(nd, nm);
            }
        }
    }

    
    public void incrementarNota(int cod, double valor) {

        for (int i = 0; i < curso.getCantidad(); i++) {

            Estudiante e = curso.getEstudiante(i);

            if (e.getCodigo() == cod) {
                e.incrementarDesarrollo(valor);
            }
        }
    }

    public String mostrarEstudiantes() {
        String res = "";

        for (int i = 0; i < curso.getCantidad(); i++) {
            Estudiante e = curso.getEstudiante(i);

            res += e.getNombre() + " -> "
                    + e.calcularDefinitiva() + " -> "
                    + e.aprobar() + "\n";
        }

        return res;
    }
}