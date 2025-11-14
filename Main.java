package KrsOOP;

public class Main {
    public static void main(String[] args) {
    
        ProsesInput t = InputKRS.collectFromConsole();

        if (t == null) {
            System.out.println("Input dibatalkan karena SKS melebihi batas.");
            return;
        }

        CetakKRS.cetakKRS(t.namaMahasiswa, t.nim, t.arrayMatkul, t.jumlahSks, t.totalSks);
    }
}
