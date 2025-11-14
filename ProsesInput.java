package KrsOOP;

public class ProsesInput {

    public String namaMahasiswa;
    public String nim;
    public String[] kodeMatkulArray;
    public String[] arrayMatkul;
    public int[] jumlahSks;
    public int totalSks;

    public ProsesInput(String namaMahasiswa, String nim, String[] arrayMatkul, String[] kodeMatkulArray, int[] jumlahSks, int totalSks) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.arrayMatkul = arrayMatkul;
        this.kodeMatkulArray = kodeMatkulArray;
        this.jumlahSks = jumlahSks;
        this.totalSks = totalSks;
    }
}
