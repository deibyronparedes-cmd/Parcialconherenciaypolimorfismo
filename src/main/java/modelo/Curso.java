package modelo;

public class Curso {

    private final Estudiante[] estudiantes;
    private final int cantidad;
    private int indice;

    public Curso(int cantidad) {
        this.cantidad = cantidad;
        estudiantes = new Estudiante[cantidad];
        indice = 0;
    }

    public void agregarEstudiante(Estudiante e) {
        if (indice < cantidad) {
            estudiantes[indice] = e;
            indice++;
        }
    }

    public void ordenarPorDefinitiva() {
        for (int i = 0; i < indice - 1; i++) {
            for (int j = 0; j < indice - 1 - i; j++) {
                if (estudiantes[j].calcularDefinitiva() > estudiantes[j + 1].calcularDefinitiva()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
    }

   public Estudiante[] obtenerMayoresQue(double limite) {

    Estudiante[] resultado = new Estudiante[indice];
    int contador = 0;

    for (int i = 0; i < indice; i++) {
        if (estudiantes[i].calcularDefinitiva() > limite) {
            resultado[contador] = estudiantes[i];
            contador++;
        }
    }

    return resultado;
}
       
    

    public void incrementarNotas(double valor) {
        for (int i = 0; i < indice; i++) {
            estudiantes[i].incrementarDesarrollo(valor);
        }
    }

    public Estudiante buscarPorCodigo(int codigo) {
        for (int i = 0; i < indice; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getIndice() {
        return indice;
    }

    public void mostrarMayoresQue(double limite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getindice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
