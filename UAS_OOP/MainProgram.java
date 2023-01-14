import javax.swing.*;

public class MainProgram{
	
	JFrame driver;
	JFrame cars;
	JFrame plane;
	JFrame submarine;
	
	MainProgram(){
		driver= new JFrame();
		driver.setSize(500,300);
		driver.setVisible(true);
		
		Pengemudi pengemudi1 = new Pengemudi("Denis", 5555);
		JOptionPane.showMessageDialog(driver,"Nama : " + pengemudi1.nama + "\n" + "No SIM : " + pengemudi1.sim);
		driver.dispose();
		
		cars= new JFrame();
		cars.setSize(500,300);
		cars.setVisible(true);
		Mobil mobil1 = new Mobil("Mustang", "Black", 301);
		JOptionPane.showMessageDialog(cars,"Merk Mobil : " + mobil1.merk + "\n" + "Warna Mobil : " + mobil1.warna + "\n" + "Top Speed : " + mobil1.topSpeed + "/Kmh");
		cars.dispose();
		
		plane= new JFrame();
		plane.setSize(500,300);
		plane.setVisible(true);
		Pesawat pesawat1 = new Pesawat("Boeing-747", "White", 400);
		JOptionPane.showMessageDialog(plane,"Merk Pesawat : " + pesawat1.merk + "\n" + "Warna Pesawat : " + pesawat1.warna + "\n" + "Top Speed : " + pesawat1.topSpeed + "/Kmh");
		plane.dispose();
		
		submarine= new JFrame();
		submarine.setSize(500,300);
		submarine.setVisible(true);
		KapalSelam kapalselam1 = new KapalSelam("Seawolf", "Black", 90);
		JOptionPane.showMessageDialog(submarine,"Merk Kapal Selam : " + kapalselam1.merk + "\n" + "Warna Kapal Selam : " + kapalselam1.warna + "\n" + "Top Speed : " + kapalselam1.topSpeed + "/Kmh");
		submarine.dispose();
	}
	
	public static void main(String[] args) {  
	new MainProgram();  
	}
}