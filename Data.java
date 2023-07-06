package course;

public class Data {
	 
	private String namaKelas;
	private int harga;
	private boolean dibeli;
	
	public Data(String namaKelas, int harga) {
		this.namaKelas = namaKelas;
		this.harga = harga;
		this.dibeli = false;
	}

	public String getNamaKelas() {
		return namaKelas;
	}

	public void setNamaKelas(String namaKelas) {
		this.namaKelas = namaKelas;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public boolean isDibeli() {
        return this.dibeli;
    }

    public void setDibeli(boolean dibeli) {
        this.dibeli = dibeli;
    }
	
	
	
	

}
