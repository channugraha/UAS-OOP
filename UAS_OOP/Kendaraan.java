public abstract class Kendaraan{
	
	public String merk;
	public String warna;
	public int topSpeed;
	
	public Kendaraan(String merk, String warna, int topSpeed){
		this.merk = merk;
		this.warna = warna;
		this.topSpeed = topSpeed;
	}
	public abstract void jalan();
	public abstract void berhenti();
}