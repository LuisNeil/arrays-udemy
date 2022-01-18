public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c, d;
        a = new int[10];
        b = new int[10];
        c = new int[20];
        d = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] =(i+1)*5;
        }

        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        aux = 0;
        for (int i = 0; i < b.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                d[aux++] = a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                d[aux++] = b[i+j];
            }

        }

        System.out.println("Otro arreglo d");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
