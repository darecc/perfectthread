package perfect;

public class Perfect0 {
    private static int sprawdz(int liczba) {
        int suma = 1;
        int d = 2;
        int prog = liczba/2;
        do {
            if (liczba % d == 0)
                suma += d;
            d++;
        } while (d <= prog);
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Wyszukanie liczb doskonałych z przedziału 1000 - 100_000");
        // pomiar czasu
        long startT = System.currentTimeMillis();
        int i = 1000;
        do {
          if (sprawdz(i) == i) {
              System.out.println(i);
          }
          i++;
        } while (i <= 100_000);
        long stopT = System.currentTimeMillis();
        long czas = stopT - startT;
        System.out.println("Czas wykonania = " + czas + " ms");
    }
}
