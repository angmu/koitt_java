import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.�ִ� �� ���ϱ� (3���� ���ڸ� �־ 1 �ִ밪 2 �ּҰ�
		// 2. ���밪 ���ϱ�(1���� ���ڸ� �־ ���밪 ���ϱ�)
		// 3. ������ ���ϱ�(ù��°���� 5, ������ 2�� ������ 5*5=25
		// ���ϴ� ��ȣ�� �����ϼ���>>
		int result, min = 0;

		Scanner scan = new Scanner(System.in);
		loop1: while (true) {
			print();// ȭ����¸޼ҵ�

			switch (scan.nextInt()) {

			case 1:
				max();// �ִ밪 ���ϱ� �޼ҵ�
				break;

			case 2:
				min();// �ּҰ� �޼ҵ�
				break;

			case 3:
				abs();
				break;

			case 4:
				pow();
				break;
			case 99:
				break loop1;
			default:
				break;

			}
		} // while
	}// main

	// ȭ����� �޼ҵ�
	static void print() {
		System.out.println("------------------");
		System.out.println("��ư ���дٽ��� ���α׷�:D");
		System.out.println("------------------");
		System.out.println("1)�ִ밪 ���ϱ� 2)�ּҰ� ���ϱ� 3)���밪 ���ϱ� 4)���������ϱ� (����ȭ�� 99, ���� 0)");
		System.out.println("���ϴ� ��ȣ�� �����ϼ���>>");
	}
	static int[] for_int(int []s_num) {
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			s_num[i] = scan.nextInt();
			if (s_num[i] == 99) {
				break;// ����ȭ���̵�
			} else if (s_num[i] == 0) {
				break;
			}
		} // for
		return s_num;
	}
	// �ִ밪�޼ҵ�
	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[] s_num = new int[3];
		while (true) {// �ִ밪���ѹݺ�
			System.out.println("�ִ밪 ���ϱ� ���� (����ȭ�� 99, ���� 0)");
			s_num=for_int(s_num);//�Է�3�� �޼ҵ�-�迭�ּ�
			if (s_num[0] == 99) {
				break ;// ����ȭ���̵�
			} else if (s_num[0] == 0) {
				break ;
			}
				// �ִ밪���ϱ�
				// Math.max(Math.max(1,2),3);
			max = Math.max(Math.max(s_num[0], s_num[1]), s_num[2]);
			System.out.println("�ִ밪 :" + max);
		}
	}

	static void min() {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int[] s_num = new int[3];
		while (true) {// �ּҰ����ѹݺ�
			System.out.println("�ּҰ� ���ϱ� ���� (����ȭ�� 99, ���� 0)");
			s_num=for_int(s_num);//�Է�3�� �޼ҵ�-�迭�ּ�
			if (s_num[0] == 99) {
				break ;// ����ȭ���̵�
			} else if (s_num[0] == 0) {
				break ;
			}
				// �ּҰ����ϱ�
				// Math.min(Math.max(1,2),3);
			min = Math.min(Math.min(s_num[0], s_num[1]), s_num[2]);
			System.out.println("�ּҰ� :" + min);
		}
	}
	
	static void abs() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] s_num = new int[3];
		loop2: while (true) {// �ִ밪���ѹݺ�
			System.out.println("���밪 ���ϱ� ���� (����ȭ�� 99, ���� 0)");
			for (int i = 0; i < 1; i++) {
				System.out.println("���ڸ� �Է��ϼ���");
				s_num[i] = scan.nextInt();
				if (s_num[i] == 99) {
					break loop2;// ����ȭ���̵�
				} else if (s_num[i] == 0) {
					break loop2;
				}
			} // for
				// ���밪���ϱ�
				// Math.abs(3);
			result = Math.abs(s_num[0]);
			System.out.println("���밪 :" + result);
		}
	}
	
	static void pow() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int[] s_num = new int[3];
		String[]title= {"������ ��","������ Ƚ��"};
		loop2: while (true) {// �ִ밪���ѹݺ�
			System.out.println("���� ���ϱ� ���� (����ȭ�� 99, ���� 0)");
			for (int i = 0; i < 2; i++) {
				System.out.println(title[i]+"�� �Է��ϼ���");
				s_num[i] = scan.nextInt();
				if (s_num[i] == 99) {
					break loop2;// ����ȭ���̵�
				} else if (s_num[i] == 0) {
					break loop2;
				}
			} // for
				// ���밪���ϱ�
				// Math.max(Math.max(1,2),3);
//			result = Math.pow(s_num[0], s_num[1]);
			System.out.println("���밪 :" + result);
		}
	}

//		//1.�ִ� �� ���ϱ� (3���� ���ڸ� �־ 1 �ִ밪 2 �ּҰ�
//		//2. ���밪 ���ϱ�(1���� ���ڸ� �־ ���밪 ���ϱ�)
//		//3. ������ ���ϱ�(ù��°���� 5, ������ 2�� ������ 5*5=25
//		//���ϴ� ��ȣ�� �����ϼ���>>
//		int result=0;
//		int []input=new int[3];
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			System.out.println("------------------");
//			System.out.println("��ư ���дٽ��� ���α׷�:D");
//			System.out.println("------------------");
//			System.out.println("1)�ּҰ� ���ϱ� 2)�ּҰ� ���ϱ� 3)���밪 ���ϱ� 4)���������ϱ�");
//			System.out.println("���ϴ� ��ȣ�� �����ϼ���>>");
//			switch(scan.nextInt()) {
//			
//			case 1:
//				System.out.println("�ּҰ� ���ϱ�");
//				for(int i=0;i<input.length;i++) {
//					System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���");
//					input[i]=scan.nextInt();
//				}
//				break;
//			case 2:
//				System.out.println("�ּҰ� ���ϱ�");
//				for(int i=0;i<input.length;i++) {
//					System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���");
//					input[i]=scan.nextInt();
//				}
//				break;
//			case 3:
//				System.out.println("���밪 ���ϱ�");
//				for(int i=0;i<1;i++) {
//					System.out.println("���ϴ� ���ڸ� �Է��ϼ���");
//					input[i]=scan.nextInt();
//				}
//				result=abs_arr(input[0]);
//				System.out.println("��� ��:"+result);
//				break;
//			case 4:
//				System.out.println("������ ���ϱ�");
//				for(int i=0;i<2;i++) {
//					System.out.println("���ϴ� ���ڸ� �Է��ϼ���");
//					input[i]=scan.nextInt();
//				}
//				result=Squ(input[0],input[1]);
//				System.out.println("��� ��:"+result);
//				break;
//			default:
//				break;
//			
//			}
//		}//while
//		

	// �Ʒ��� ���� Ǭ��
	static int max(int a, int b, int c) {
		return a;
	}

	static int mini(int a, int b, int c) {
		return a;
	}

	static int abs_arr(int a) {
		if (a < 0) {
			a = -a;
		}
		return a;
	}

	static int Squ(int a, int b) {
		int c = a;
		for (int i = 0; i < b - 1; i++) {
			a *= c;
		}
		return a;
	}

}// class
