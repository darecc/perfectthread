package perfect;

public class PerfectThread extends Thread {
    private int licz1;
    private int licz2;
    public PerfectThread(int l1, int l2) {
        this.licz1 = l1;
        this.licz2 = l2;
    }
    public void run() {
        int liczba = licz1;
        do {
            int suma = 1;
            int d = 2;
            int prog = liczba/2;
            do {
                if (liczba % d == 0)
                    suma += d;
                d++;
            } while (d <= prog);
            if (suma == liczba)
                System.out.println(liczba);
            liczba++;
        } while (liczba <= licz2);
    }
}
