import java.util.Scanner;

public class Ex0205_04 {
	public static void main(String[] args) {
		//1,반올림
		//2.올림
		//3.버림
		//4.반올림자리수
		//원하는번호 선택,
		//실수를 받는다..
		//
		//>>3.1454->3, 4.523->5
		//0누르면 상위이동 99는 종료
		
		int btn=0;
		double input1=0;
		Scanner scan=new Scanner(System.in);

		loop1 : while(true) {
			System.out.println("소수점 자리수 프로그램 (종료 99)");
			System.out.println("1.반올림");
			System.out.println("2.올림");
			System.out.println("3.버림");
			System.out.println("4.반올림자리수 선택");
			btn=scan.nextInt();
			if(btn==0) {
				System.out.println("상위로 이동합니다.");
				continue loop1;
			}
			if(btn==99) {
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
			if(!(btn>=1&&btn<=4)) {
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
			switch(btn) {
				case 1 :
					while(true) {
						System.out.println("반올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("상위로 이동합니다.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						System.out.println("반올림값 :"+Math.round(input1));
					}
				case 2 :
					while(true) {
						System.out.println("올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("상위로 이동합니다.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						System.out.println("올림값 :"+Math.ceil(input1));
					}
				case 3 :
					while(true) {
						System.out.println("올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("상위로 이동합니다.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						System.out.println("버림값 :"+Math.floor(input1));
					}
				
				case 4 :
					while(true) {
						System.out.println("올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
						input1=scan.nextDouble();
						if(input1==0) {
							System.out.println("상위로 이동합니다.");
							continue loop1;
						}
						if(input1==99) {
							System.out.println("프로그램을 종료합니다.");
							break loop1;
						}
						System.out.println("소숫점 몇째자리에서 반올림 할까요?");
						btn=scan.nextInt();
						if(!(btn>=1&&btn<=3)) {
							System.out.println("1~3까지만 가능합니다.");
							continue;
						}
							switch(btn) {
							
								case 1:
									System.out.println("소숫점 첫째자리에서 반올림된 값 :"+Math.round(btn));
									break;
								case 2:
									System.out.println("소숫점 둘째자리에서 반올림된 값 :"+Math.round(btn*10)/10.0);
									break;
								case 3:
									System.out.println("소숫점 첫째자리에서 반올림된 값 :"+Math.round(btn*100)/100.0);
									break;
								case 4:
									System.out.println("소숫점 첫째자리에서 반올림된 값 :"+Math.round(btn*1000)/1000.0);
									break;
								default :
							
							
							
						}
						
						
						
						
						
						
					}	
					
					
					
				default :
					System.out.println();
			}//스위치
			
			
			
		}//loop1
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int btn=0;
//		double input1=0;
//		int btn2=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("소수점 자리수 프로그램 (종료 99)");
//		System.out.println("1.반올림");
//		System.out.println("2.올림");
//		System.out.println("3.버림");
//		System.out.println("4.원하는 소숫점 반올림");
//
//		btn=scan.nextInt();
//		loop1 : while(true) {
//			
//			switch(btn) {
//				case 1 :
//					while(true) {
//						System.out.println("반올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("상위로 이동합니다.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("프로그램을 종료합니다.");
//							break loop1;
//						}
//						System.out.println(Math.round(input1));
//					}
//				case 2 :
//					while(true) {
//						System.out.println("올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("상위로 이동합니다.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("프로그램을 종료합니다.");
//							break loop1;
//						}
//						System.out.println(Math.ceil(input1));
//					}
//				case 3 :
//					while(true) {
//						System.out.println("올림을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("상위로 이동합니다.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("프로그램을 종료합니다.");
//							break loop1;
//						}
//						System.out.println(Math.floor(input1));
//					}
//				case 4 :	
//					while(true) {
//						System.out.println("반올림(자릿수선택)을 선택했습니다.계산하실 실수를 입력해주세요. (상위이동 0 종료 99)");
//						input1=scan.nextDouble();
//						if(input1==0) {
//							System.out.println("상위로 이동합니다.");
//							continue loop1;
//						}
//						else if(input1==99) {
//							System.out.println("프로그램을 종료합니다.");
//							break loop1;
//						}
//						System.out.println("올릴자리를 입력하세요");
//						btn2=scan.nextInt();
//						
//						//System.out.println(Math.round(input1*));
//					}
//					
//				case 99 :
//					System.out.println("프로그램을 종료합니다.");
//					break loop1;
//					
//				default :
//					System.out.println("다시 선택하세요");
//			}//스위치
//			
//			
//			
//		}//loop1
		
		
		
		
	}
}
