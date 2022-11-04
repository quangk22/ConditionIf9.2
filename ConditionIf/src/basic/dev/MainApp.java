package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n");
		int n = sc.nextInt();
		
		if(n % 3 == 0) {
			System.out.println("Chia hết cho 3");
		}else {
			if(n % 5 == 0) {
				System.out.println("Chia hết cho 5");
			}else {
				System.out.println("không chia hết 3 và 5");
			}
		}
			
		
		
		
	}

}
