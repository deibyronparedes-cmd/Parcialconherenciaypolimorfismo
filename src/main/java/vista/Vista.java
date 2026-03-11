package vista;

import java.util.Scanner;
import modelo.Estudiante;

public class Vista {

    private final Scanner sc = new Scanner(System.in);

    public int leerCantidad() {
        System.out.print("Ingrese número de estudiantes de tecnologia: ");
        return sc.nextInt();
    }

public Estudiante leerDatosEstudiante() {

    int codigo;

    do {
        System.out.print("Código (mayor a 21000): ");
        codigo = sc.nextInt();
        if(codigo<=21000){
            System.out.println("CODIGO INCORRECTO.INGRESE UN CODIGO VALIDO > 21000.");
       
        }
    } while (codigo <= 21000);

    sc.nextLine(); // limpiar buffer

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Nota Desarrollo: ");
    double notaDesarrollo = sc.nextDouble();

    System.out.print("Nota Matemática: ");
    double notaMatematica = sc.nextDouble();

    return new Estudiante(codigo, nombre, notaDesarrollo, notaMatematica);
}

    public double leerLimite() {
        System.out.print("Ingrese nota límite: ");
        return sc.nextDouble();
    }

    public double leerIncremento() {
        double incremento;
    do{    
        System.out.print("Ingrese incremento (0.0 - 0.5): ");
        return sc.nextDouble();
   } while (incremento < 0.0 || incremento > 0.5);    
    }

    public int leerCodigoModificar() {
        System.out.print("Ingrese código del estudiante a modificar: ");
        return sc.nextInt();
    }

    public double leerNuevaNotaDesarrollo() {
        System.out.print("Nueva nota Desarrollo: ");
        return sc.nextDouble();
    }

    public double leerNuevaNotaMatematica() {
        System.out.print("Nueva nota Matemática: ");
        return sc.nextDouble();
    }

 public void mostrarEstudiantes(Estudiante[] lista, int cantidad) {

    System.out.println("\n--- LISTADO DE ESTUDIANTES DE TECNOLOGIA ---");

    for (int i = 0; i < cantidad; i++) {
        if(lista[i]!=null){

        System.out.printf(
                "%s - %d - %.2f - %s\n",
                lista[i].getNombre(),
                lista[i].getCodigo(),
                lista[i].calcularDefinitiva(),
                lista[i].aprobar()
        );
    }
    }
}

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
