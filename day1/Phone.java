package week1.day1;

public class Phone {
	
	String mobileBrandName = "Google Pixel";
	char mobileLogo = 'G';
	short noOfMobilePiece = 1;
	int modelNumber = 2;
	long mobileImeiNumber = 34323523535L;
	float mobilePrice = 48900.34f;
	boolean isDamaged = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone gp = new Phone();
		//Mobile mle = new Mobile();
		//mle.sendMsg();
		System.out.println(gp.mobileBrandName);
		System.out.println(gp.mobileLogo);
		System.out.println(gp.noOfMobilePiece);
		System.out.println(gp.modelNumber);
		System.out.println(gp.mobileImeiNumber);
		System.out.println(gp.mobilePrice);
		System.out.println(gp.isDamaged);

	}

}
