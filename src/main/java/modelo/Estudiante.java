package modelo;


public class Estudiante {
    private static final double PORC_DESARROLLO = 0.55;
    private static final double PORC_MATEMATICA = 0.45;

    private final int codigo;
    private final String nombre;
    private double notaDesarrollo;
    private double notaMatematica;

    public Estudiante(int codigo, String nombre, double notaDesarrollo, double notaMatematica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }

    public double calcularDefinitiva() {
        return (notaMatematica * PORC_MATEMATICA) + 
                (notaDesarrollo * PORC_DESARROLLO);
    }

    public String aprobar() {
        if (calcularDefinitiva() >= 3.5) {
            return "SI APRUEBA";
        } else {
            return "NO APRUEBA";
        }
    }

    public void incrementarDesarrollo(double valor) {
        if(valor>=0&&valor<=0.5){
            if(notaDesarrollo+valor>5.0){
                notaDesarrollo=5.0;
            }else{
                notaDesarrollo+=valor;
            }
        }
    }    
        
                  
    public void modificarNota(double nuevaDesarrollo, double nuevaMatematica) {
        if (nuevaDesarrollo>=0&& nuevaDesarrollo<=5){
            this.notaDesarrollo=nuevaDesarrollo;
        }
        
        if (nuevaMatematica>=0&&nuevaMatematica<=5){
            this.notaMatematica=nuevaMatematica;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }
}
