package modelo;

public class Estudiante extends Persona {

    private double notaDesarrollo;
    private double notaMatematica;

    public Estudiante(int codigo, String nombre, double notaDesarrollo, double notaMatematica) {
        super(codigo, nombre); // HERENCIA
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }

    // POLIMORFISMO (puede ser sobrescrito)
    public double calcularDefinitiva() {
        return (notaDesarrollo * 0.55) + (notaMatematica * 0.45);
    }

    public String aprobar() {
        return calcularDefinitiva() >= 3.5 ? "SI APRUEBA" : "NO APRUEBA";
    }

    // SOBRECARGA 👇
    public void modificarNota(double nuevaDesarrollo) {
        this.notaDesarrollo = nuevaDesarrollo;
    }

    public void modificarNota(double nuevaDesarrollo, double nuevaMatematica) {
        this.notaDesarrollo = nuevaDesarrollo;
        this.notaMatematica = nuevaMatematica;
    }

    public void incrementarDesarrollo(double valor) {
        notaDesarrollo = Math.min(5.0, notaDesarrollo + valor);
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }
}