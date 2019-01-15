package lab2;
import java.util.Scanner;

public class RoomGenerator {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		boolean cont = true;
		boolean valid;
		double length = 0;
		double width = 0;
		double height = 0;
		
		
		while (cont) {	
			valid = false;
			while (valid == false) {
				System.out.print("Enter Length: ");
				length = scnr.nextDouble();	
				valid = Valid(length);
			}
			valid = false;
			while (valid == false) {
				System.out.print("Enter Width: ");
				width = scnr.nextDouble();
				valid = Valid(width);
			}
			valid = false;
			while (valid == false) {
				System.out.print("Enter Height: ");
				height = scnr.nextDouble();
				if (height != 0) {
					valid = Valid(height);
				}
				else {
					valid = true;
				}		
			}

			Area(length, width);
			Perimeter(length, width);
			Volume(length, width, height);
			
			cont = Cont();
		}
		scnr.close();
	}
	
	public static boolean Valid(double dimension) {
		if (dimension > 0) {
			return true;
		}
		else {
			System.out.println("INVALID ENTRY, TRY AGAIN...");
			return false;
		}
	}
	
	public static void Area(double length, double width) {
		if (((length * width) / width == length)) {
			System.out.println("Area: " + (length * width));
		}
		else {
			System.out.println("ERROR CALCULATING AREA! (Area: " + (length * width) + ")");
		}
	}
	
	public static void Perimeter(double length, double width) {
		if (((length + width) - length) == width) {
			System.out.println("Perimeter: " + 2 * (length + width));
		}
		else {
			System.out.println("ERROR CALCULATING PERIMETER! (Perimeter: " + 2 * (length + width) + ")");
		}
	}
	
	public static void Volume(double length, double width, double height) {
		if (((length * width * height) / height) == (length * width)) {
			System.out.println("Volume: " + (length * width * height));
		}
		else {
			System.out.println("ERROR CALCULATING VOLUME! (Volume: " + (length * width * height) + ")");
		}
	}
	
	public static boolean Cont() {
		char cont = ' ';
		while(cont != 'y' && cont != 'Y' && cont != 'n' && cont != 'N') {
		System.out.println("Continue? (y/n) ");
		cont = scnr.next().charAt(0);
		}
		
		if (cont == 'y' || cont == 'Y') {
			return true;
		}
		else {
			return false;
		}
	}
}
