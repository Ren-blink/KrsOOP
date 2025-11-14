package KrsOOP;

public class CetakKRS {
    public static void cetakKRS(String namaMahasiswa, String nim, String[] arrayMatkul, String[] kodeMatkulArray, int[] jumlahSks, int totalSks) {
        System.out.println("===== KARTU RENCANA STUDI =====");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("NIM: " + nim);
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-20s %s%n", "Kode", "Mata Kuliah", "Jumlah SKS");
        System.out.println("-------------------------------");

        int count = Math.min(Math.min(arrayMatkul != null ? arrayMatkul.length : 0, kodeMatkulArray != null ? kodeMatkulArray.length : 0), jumlahSks != null ? jumlahSks.length : 0);
        for (int i = 0; i < count; i++) {
            System.out.printf("%-10s %-20s %d%n", kodeMatkulArray[i], arrayMatkul[i], jumlahSks[i]);
        }
        if (count == 0) {
            System.out.println("(Tidak ada mata kuliah yang tercatat)");
        }
        if (arrayMatkul != null && jumlahSks != null && arrayMatkul.length != jumlahSks.length) {
            System.out.println("[WARN] Jumlah mata kuliah dan data SKS tidak sama; menampilkan sampai panjang terkecil.");
        }

        System.out.println("-------------------------------");
        System.out.println("Total SKS: " + totalSks);
        System.out.println("================================");

        System.out.println("Malang, 14 November 2025");
        System.out.println("yang bertanda tangan di bawah ini,");
        System.out.println("Dr. Ir. Fajar Pradana, S.ST., M.Eng.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Selaku KPS Sistem Informasi S1 FILKOM UB 2025");
    }
}
