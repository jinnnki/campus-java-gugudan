package Exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("������ ���α׷��Դϴ�.");
		while(true) {
			System.out.println("1~999�� ���ϴ� ���ڸ� �Է����ּ���.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			
			if(inputInteger(input)) {				
				int result;
				int num = Integer.parseInt(input);
				if(num>=1 && num<=999) {
					System.out.println(num + "���Դϴ�.");
					for(int i=1;i<10;i++) {
						result = num * i;	
						System.out.println(num + " x " + i + " = " + result);
					}
				}else {
					System.out.println(input + "�� 1~999������ ���ڰ� �ƴմϴ�.");
				}
			}
			
			else if(inputDouble(input)) {
				double num = Double.parseDouble(input);
				System.out.println(num + "�� �Ǽ����Դϴ�.");
			}
			
			else {
				System.out.println("�Է��� ���� ���ڿ��Դϴ�");
			}			
		}
	}
	
	public static boolean inputInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean inputDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}

}