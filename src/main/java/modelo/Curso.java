package modelo;

public class Curso {

    private final Estudiante[] estudiantes;
    private int cantidad;

    public Curso(int tamaño) {
        estudiantes = new Estudiante[tamaño];
        cantidad = 0;
    }

    public void agregarEstudiante(Estudiante e) {
        if (cantidad < estudiantes.length) {
            estudiantes[cantidad] = e;
            cantidad++;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public Estudiante getEstudiante(int i) {
        return estudiantes[i];
    }

    Estudiante buscarPorCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}