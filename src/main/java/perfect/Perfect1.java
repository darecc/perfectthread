package perfect;

public class Perfect1 {
    public static final int ILE = 20;
    public static void main(String[] args) {
        System.out.println("Wyszukanie liczb doskonałych z przedziału 1000 - 100_000");
        // pomiar czasu
        long startT = System.currentTimeMillis();
        int i = 1000;
        PerfectThread[] w = new PerfectThread[ILE];
        for(int j = 0; j < ILE; j++) {
            w[j] = new PerfectThread(i + j*5000, i + (j+1) *5000);
            w[j].start();
        }
        boolean koniec;
        do {
            koniec = true;
            for(int j = 0; j < ILE; j++)
                if (w[j].isAlive())
                    koniec = false;
            if (!koniec)
                try {
                    Thread.sleep(100);
                }
            catch(InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        } while(!koniec);
        long stopT = System.currentTimeMillis();
        long czas = stopT - startT;
        System.out.println("Czas wykonania = " + czas + " ms");
    }
}
