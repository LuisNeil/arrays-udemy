public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive","Samsung Galaxy",
                "Disco duro SSD Samsung Externo","Asus Notebook",
                "Macbook air","Chromecast 4ta generacion","Bicicleta Oxford"};
        int total = productos.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++){

            for (int j = 0; j < total - 1 -i; j++) {
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        //Arrays.sort(productos);
        //arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));
        System.out.println("===Usando for===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " " + productos[i]);
        }

        int[] numeros = new int[4];

        numeros[0] = 74;
        numeros[1] = 82;
        numeros[2] = 36;
        numeros[3] = 54;

        for(int i = 0; i < numeros.length - 1; i++){

            for (int j = 0; j < numeros.length - 1 -i; j++) {
                if( ((Comparable<Integer>)numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contador++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }

    }
}
