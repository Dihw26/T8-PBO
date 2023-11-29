import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KasirProgram {

    public static void main(String[] args) {
        Map<String, Barang> databaseBarang = new HashMap<>();
        databaseBarang.put("001", new Barang("Barang 1", 10000));
        databaseBarang.put("002", new Barang("Barang 2", 15000));
        databaseBarang.put("003", new Barang("Barang 3", 20000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode barang: ");
        String kode = scanner.next();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = scanner.nextInt();

        if (databaseBarang.containsKey(kode)) {
            Barang barang = databaseBarang.get(kode);
            int totalHarga = barang.getHarga() * jumlah;

            // Output hasil
            System.out.println("Nama Barang: " + barang.getNama());
            System.out.println("Harga Satuan: " + barang.getHarga());
            System.out.println("Jumlah Beli: " + jumlah);
            System.out.println("Total Harga: " + totalHarga);
        } else {
            System.out.println("Kode barang tidak valid.");
        }
    }
}

class Barang {
    private final String nama;
    private final int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
