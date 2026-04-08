package controlador;

import modelo.*;

public class Controlador {

    private final Curso curso;

    public Controlador() {
        curso = new Curso(10);
    }

    // POLIMORFISMO
    public void agregarEstudiante(int cod, String nom, double nd, double nm, boolean beca) {

        Estudiante e;

        if (beca) {
            e = new EstudianteBeca(cod, nom, nd, nm);
        } else {
            e = new Estudiante(cod, nom, nd, nm);
        }

        curso.agregarEstudiante(e);
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