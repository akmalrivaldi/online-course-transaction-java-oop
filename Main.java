package course;

import java.util.Scanner;
import java.util.Vector;
public class Main{
	
	Scanner scan = new Scanner(System.in);
	//vector buat nampung data
	Vector<Data> datakelas = new Vector<Data>();
	
	private void clearScreen() {
		for(int i = 0; i < 5; i++) {
			System.out.println("\n");
		}
	}
	
	public Main() {
		
		String nama, alamat, pos, provinsi, hp;
		int pilihan = 0;
		
		//Data kelas
		datakelas.add(new Data("Algoritma dan pemrograman", 500000));
		datakelas.add(new Data("Database system", 1000000));
		datakelas.add(new Data("Computer Network", 1500000));
		datakelas.add(new Data("OOP", 2000000));
		datakelas.add(new Data("Android", 2500000));
		
		//Input user
		System.out.println("WELCOME TO COURSE-NET");
		System.out.println("---------------------");
		
		System.out.print("Masukkan nama lengkap anda: ");
		nama = scan.nextLine();
		
		System.out.print("Masukkan alamat anda: ");
		alamat = scan.nextLine();
		
		System.out.print("Masukkan kode pos anda: ");
		pos = scan.nextLine();
		
		System.out.print("Masukkan provinsi anda: ");
		provinsi = scan.nextLine();
		
		System.out.println("Masukkan no telepon anda: ");
		hp = scan.nextLine();
		
		clearScreen();
		
		System.out.println("Hello " + nama);
		System.out.println("List program pembelajaran yang tersedia \n [ 1 untuk ambil / 0 untuk tidak] ");
		
		for(int i = 0; i < datakelas.size(); i++) {
			//membuat objek untuk memanggil variabel dari kelas data
			Data k = datakelas.get(i);
//			String status = k.isDibeli() ? " djnjdn" : "";
			System.out.printf(k.getNamaKelas() + " ( Rp. " + k.getHarga() + ") : ");
			pilihan = scan.nextInt(); scan.nextLine();
			
			if (pilihan == 1) {
				datakelas.get(pilihan);
				k.setDibeli(true);
				
			}
		}
		
		clearScreen();
		
		// Menampilkan total harga dari kelas yang dipilih user
		int totalharga = 0;
		for(int i= 0; i < datakelas.size(); i++) {
			Data k = datakelas.get(i);
			if(k.isDibeli()) {
				totalharga += k.getHarga();
			}
		}
		
		//Output data user
		System.out.println("Berikut data anda");
		System.out.println("-----------------");
		System.out.println("Nama    : " + nama);
		System.out.println("Alamat  : " + alamat);
		System.out.println("Kode pos: " + pos);
		System.out.println("Provinsi: " + provinsi);
		System.out.println("No Hp   : " + hp);
		System.out.println("---------------------");
		System.out.println("Daftar kelas yang anda pilih: ");
//		Data k = datakelas.get(pilihan);
//		System.out.println(k.getNamaKelas());
		System.out.println("total pembayaran kelas: Rp. " + totalharga);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
