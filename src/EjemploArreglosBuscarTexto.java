import java.util.Scanner;

public class EjemploArreglosBuscarTexto {
    public static void main(String[] args) {

        String[] a = new String[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un palabra");
            a[i] = scanner.next();
        }

        System.out.println("\r\nIngrese un palabra a buscar");
        String nombre = scanner.next();
        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }
        if(i == a.length){
            System.out.println("Palabra no encontrada");
        }else if(a[i].equalsIgnoreCase(nombre)){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}
