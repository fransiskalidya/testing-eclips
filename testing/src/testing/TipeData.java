package testing;

public class TipeData {
	public static void main(String args[]) {
//		float suhu, celcius, reamur, fahrenheit, kelvin;
//		suhu = 45;
//		
//		//celcius
//		celcius = suhu;
//		
//		//reamur
//		reamur = (float) (celcius * (4.0/5.0));
//		
//		//fahrenheit
//		fahrenheit = (float) (((9.0/5.0)*celcius) + 32);
//		
//		//kelvin
//		kelvin = celcius + 273;
//		
//		System.out.println("Celcius = "+ celcius);
//		System.out.println("Reamur = "+ reamur);
//		System.out.println("Fahrenheit = "+ fahrenheit);
//		System.out.println("Kelvin = "+ kelvin);
		
		int panjang, lebar, tinggi, vBalok, lBalok;
		
		panjang = 10;
		lebar = 6;
		tinggi = 7;
		
		// volume balok
		vBalok = panjang * lebar * tinggi;
		
		// Luas permukaan balok
		lBalok = 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
		
		System.out.print("Volume balok = "+ vBalok + ", ");
		System.out.print("Luas permukaan balok = "+ lBalok);
		
	}
}
