package modelo;

public class Estudiante extends Persona {

    private double notaDesarrollo;
    private double notaMatematica;

    public Estudiante(int codigo, String nombre, double nd, double nm) {
        super(codigo, nombre);
        this.notaDesarrollo = nd;
        this.notaMatematica = nm;
    }

    public double calcularDefinitiva() {
        return (notaDesarrollo * 0.55) + (notaMatematica * 0.45);
    }

    public String aprobar() {
        return calcularDefinitiva() >= 3.5 ? "APRUEBA" : "NO APRUEBA";
    }

    
    public void modificarNota(double nd) {
        this.notaDesarrollo = nd;
    }

    public void modificarNota(double nd, double nm) {
        this.notaDesarrollo = nd;
        this.notaMatematica = nm;
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