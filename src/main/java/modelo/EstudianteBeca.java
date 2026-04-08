package modelo;

public class EstudianteBeca extends Estudiante {

    public EstudianteBeca(int codigo, String nombre, double nd, double nm) {
        super(codigo, nombre, nd, nm);
    }

    @Override 
    public double calcularDefinitiva() {
        
        return super.calcularDefinitiva() + 0.5;
    }
}