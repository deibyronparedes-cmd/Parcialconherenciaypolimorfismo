package modelo;

public class EstudianteBeca extends Estudiante {

    public EstudianteBeca(int codigo, String nombre, double nd, double nm) {
        super(codigo, nombre, nd, nm);
    }

    @Override // POLIMORFISMO
    public double calcularDefinitiva() {
        // Tiene beneficio extra
        return super.calcularDefinitiva() + 0.5;
    }
}