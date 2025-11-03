import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputan data dari pengguna
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan tarif per kg berdasarkan jarak
        double tarifPerKg;
        if (jarak <= 10) {
            tarifPerKg = 4250;
        } else {
            tarifPerKg = 6000;
        }

        // Hitung biaya utama berdasarkan berat
        double biayaUtama = berat * tarifPerKg;

        // Cek biaya tambahan untuk volume
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Hitung total biaya
        double totalBiaya = biayaUtama + biayaVolume;
      
        // Tampilkan hasil
        System.out.println("\n--- RINCIAN BIAYA PENGIRIMAN ---");
        System.out.println("Berat paket       : " + berat + " kg");
        System.out.println("Jarak tempuh      : " + jarak + " km");
        System.out.println("Volume paket      : " + volume + " cm^3");
        System.out.println("Tarif per kg      : Rp " + tarifPerKg);
        System.out.println("Biaya utama       : Rp " + biayaUtama);
        System.out.println("Biaya volume      : Rp " + biayaVolume);
        System.out.println("-----------------------------------");
        System.out.println("Total biaya kirim : Rp " + totalBiaya);
    }
}

