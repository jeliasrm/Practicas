import java.util.Scanner;

public class Uso_Tallas {
	
	//enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
	
	enum Size {
		
		MINI("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
		
		private String abbrev;
		
		private Size(String abbrev) {
			
			this.abbrev = abbrev;
			
		}

		public String getAbbrev() {
			
			return abbrev;
			
		}
		
	}

	public static void main(String[] args) {
		
		/*Size s = Size.SMALL;
		
		Size m = Size.MEDIUM;
		
		Size l = Size.LARGE;
		
		Size xl = Size.EXTRA_LARGE;*/
		
		String data;
		
		Size size;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Give a Size");
		
		data = scann.next().toUpperCase();
		
		size = Enum.valueOf(Size.class, data);
		
		System.out.println("Size: " + size);
		
		System.out.println("Abbrevation: " + size.getAbbrev());

	}

}
