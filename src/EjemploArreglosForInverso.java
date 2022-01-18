import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive","Samsung Galaxy","Disco duro SSD Samsung Externo","Asus Notebook"
                ,"Macbook air","Chromecast 4ta generacion","Bicicleta Oxford"};
        int total = productos.length;

        /*productos[0] = "Kingston Pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";
*/
        Arrays.sort(productos);
        System.out.println("===Usando for===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " " + productos[i]);
        }

        System.out.println("===Usando for inverso===");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total -1 - i) + " valor: " + productos[total -1 - i]);
        }

        System.out.println("===Usando for inverso2===");
        for (int i = total - 1; i >=0; i--) {
            System.out.println("Para i = " + i + " valor " + productos[i]);
        }
    }
}
