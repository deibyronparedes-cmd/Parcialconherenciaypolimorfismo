package controlador;

import modelo.Curso;
import modelo.Estudiante;
import vista.Vista;

public class Controlador {

    private Curso curso;
    private final Vista vista;

    public Controlador() {
        vista = new Vista();
    }

    public void iniciar() {
        int cantidad = vista.leerCantidad();
        curso=new Curso(cantidad);
        

        for (int i = 0; i < cantidad; i++) {

            Estudiante e = vista.leerDatosEstudiante();

            boolean repetido = false;

            for (Estudiante est : curso.getEstudiantes()) {
                if (est!=null&& est.getCodigo()==e.getCodigo()){
                        
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("El código ya existe");
                i--;
            } else {
                curso.agregarEstudiante(e);
            }
        }
        curso.ordenarPorDefinitiva();
        vista.mostrarEstudiantes(curso.getEstudiantes(), curso.getIndice());

        double limite = vista.leerLimite();
        Estudiante[] mayores = curso.obtenerMayoresQue(limite);
        vista.mostrarEstudiantes(mayores, curso.getIndice());

        double incremento = vista.leerIncremento();
        curso.incrementarNotas(incremento);
        vista.mostrarMensaje("Notas incrementadas correctamente.");

        int codigo = vista.leerCodigoModificar();
        Estudiante estudiante = curso.buscarPorCodigo(codigo);

        if (estudiante != null) {

            double nuevaDes = vista.leerNuevaNotaDesarrollo();
            double nuevaMat = vista.leerNuevaNotaMatematica();

            estudiante.modificarNota(nuevaDes, nuevaMat);

            vista.mostrarMensaje("Notas modificadas correctamente.");

        } else {
            vista.mostrarMensaje("Estudiante no encontrado.");
        }

        curso.ordenarPorDefinitiva();
        vista.mostrarEstudiantes(curso.getEstudiantes(), curso.getIndice());
    }
}
