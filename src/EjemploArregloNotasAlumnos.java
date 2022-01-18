import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLeguaje =0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new  double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLeguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumNotasLeguaje/claseLenguaje.length;

        System.out.println("Promedio clase matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " +(promedioHistoria + promedioLenguaje + promedioMatematicas)/3);

        System.out.println("Ingrese el identificador del alumno (de 0 a 6)");
        int id = scanner.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseMatematicas[id] + claseLenguaje[id])/3;
        System.out.println("Promedio Alumno Nro " + id + ": " + promedioAlumno);
    }
}
