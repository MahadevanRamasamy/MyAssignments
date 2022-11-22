package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] split = test.split(" ");
		String rev = "";
		
		for (int i = 0; i < split.length; i++) {
			if (i%2==1) {
				String odd="";
				for (int j = split[i].length()-1; j >=0; j--) {
					odd=odd+split[i].charAt(j);
				}
			//	System.out.println(odd);
				rev=rev+odd+" ";
			} else {
				rev=rev+split[i]+" ";

			}
		}
		System.out.println(rev);
		

	}

}

//am - 1
//software -3