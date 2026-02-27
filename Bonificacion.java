public class Bonificacion {
    public static void main(String[] args) {

        // Declaración e inicialización

        int a = 10;
        int b = 5;
        int c = -3;
        int d = 20;

        double e = 2.5;
        double f = -1.5; 
        double g = 4.8;
        double h = 0.5;

        float i = 3.2f;
        float j = -7.4f;

        long k = 1000;
        long l = 50000;  
        short m = 2;
        byte n = 1;

        boolean q = true;
        boolean r = false;

        double s = 2.80;
        long t = 100000;

        // Reasignaciones

        a = b + c;
        e = a * 2;
        g = e + (e * f);
        k = a + l;

        d = a + b;

        // HardCode
        b = 15;
        c = 25;
        f = 3.15;
        q = false;
        d = 11000;
        s = 2.1416;
        h = 0.5;
        i = 3.3f;
        j = -7.4f;
        l = 5000;
        m = 2;
        n = 1;
        q = true;
        r = false;

        g = g + (g * f);  
        k = k + l;        

        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("g: " + g);
        System.out.println("k: " + k);
    }
}