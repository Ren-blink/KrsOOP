package KrsOOP;

import java.util.Scanner;
import java.util.ArrayList;

public class InputKRS {
    public static ProsesInput collectFromConsole() {
    Scanner in = new Scanner(System.in);

    String namaMahasiswa;
    System.out.print("Masukkan nama mahasiswa: ");
    namaMahasiswa = in.nextLine().trim();

    String nim;
    System.out.print("Masukkan NIM:");
    nim = in.nextLine();

    int totalSks = 0;
    ArrayList<String> matkulList = new ArrayList<>();
    ArrayList<Integer> sksList = new ArrayList<>();

    while (true) {
        System.out.print("Masukkan mata kuliah (atau 'selesai' untuk berhenti): ");
        String namaMatkul = in.nextLine().trim();
        if (namaMatkul.equalsIgnoreCase("selesai")) {
            break;
        }
        if (namaMatkul.isEmpty()){
            System.out.println("Nama mata kuliah tidak boleh kosong. Silahkan coba lagi.");
            continue;
        }

        System.out.print("Masukkan jumlah SKS untuk " + namaMatkul + ": ");
        String sksLine = in.nextLine().trim();

        int sks;
        try {
            sks = Integer.parseInt(sksLine);
            if (sks <= 0) {
                System.out.println("SKS harus berupa angka positif. Coba lagi.");
                continue;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. SKS harus berupa angka. Coba lagi.");
            continue;
        }

        totalSks += sks;
        if (totalSks > 24) {
            System.out.println("Jumlah SKS melebihi batas maksimum 24 SKS. Input dibatalkan.");
            in.close();
            return null;
        }

        matkulList.add(namaMatkul);
        sksList.add(sks);
        System.out.println("Total SKS sementara: " + totalSks);
    }

    String[] arrayMatkul = matkulList.toArray(new String[0]);
    int[] jumlahSks = new int[sksList.size()];
    for (int i = 0; i < sksList.size(); i++) {
        jumlahSks[i] = sksList.get(i);
    }

    in.close();

    return new ProsesInput(namaMahasiswa, nim, arrayMatkul, jumlahSks, totalSks);
    }
}
