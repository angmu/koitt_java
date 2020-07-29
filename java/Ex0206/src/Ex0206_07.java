import java.util.Scanner;

public class Ex0206_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지하철 요금계산 프로그램
//		1.가산디지털단지역, 2.구로역. 3신도림 4.영등포 5 신길 6 대방7노량진 8용산 9남영 10 서울역 11시청 12 종각 13 종로3가 14 종로5가 15 동대문 16 동묘 17신설동 18 제기동 19 청량리 20 회기
//		
		
//		출발하실 역을 입력하세요(종료 0)
//		도착하실 역을 입력하세요(종료 0)
//		
//		ex)
//		출발역: 가산디지털단지역
//		도착역: 신길
//			
//			5-1  +1  = 5구간 (+1을 꼭 해줘야한다.)
// 		Math.abs(1-5) <<절대값을 구하는 메소드
//		요금정산
//		기본요금 1250원
//		5구간
//		10구간 100원추가
//		15구간 200원추가
//		20구간 300원 추가 ////풀이 >>>5로 나눠서 올림하면 구간별로 각 1 2 3 4가 된다.
//		
		
		int price=1250;//기본료
		int cal=0;
		int count=0;//역 차이
		int start=0;//출발
		int finish=0;//도착
		int time=0;
		String yn="";//다시시작
		
		Scanner scan=new Scanner(System.in);
		
	   loop:while(true) {
			System.out.println("[지하철 요금 프로그램]");
			System.out.println("서비스가 제공되는 역 : \n1.가산디지털단지역 2.구로역 3.신도림  4.영등포 5.신길\n6.대방 7.노량진 8.용산 9.남영 10.서울역\n11.시청 12.종각 13.종로3가 14.종로5가 15.동대문\n16.동묘 17.신설동 18.제기동 19.청량리 20.회기");
			System.out.println("\n출발하실 역에 해당하는 번호를 입력하세요 (종료0)");
			start=scan.nextInt();
			
			if(start==0) {
				System.out.println("프로그램을 종료합니다");
				break loop;
			}
			if(!(start>=1&&start<=20)) {
				System.out.println("잘못선택하였습니다");
				continue loop;
			}
			
			System.out.println("도착하실 역에 해당하는 번호를 입력하세요 (종료0)");
			finish=scan.nextInt();
			
			if(finish==0) {
				System.out.println("프로그램을 종료합니다");
				break loop;
			}
			if(!(finish>=1&&finish<=20)) {
				System.out.println("잘못선택하였습니다");
				continue loop;
			}
			
			
			cal=Math.abs(start-finish)+1;//기본요금
			//기본요금+0*100=기본요금
			//기본요금+1*100=기본요금+100
			price=1250+(int)(Math.round(cal)/5)*100;
			time=cal*150;
			System.out.println("출발역 :"+start);
			System.out.println("도착역 :"+finish);
			System.out.println("구간 :"+cal);
			System.out.println("해당 구간 요금은"+price+"입니다.\n");
			System.out.println("소요시간은"+time/60+"분"+time%60+"초 입니다.");
			while(true) {
				System.out.println("다시 지하철 요금을 계산하시겠습니까? y/n");
				yn=scan.next();
				if(yn.equals("y")||yn.equals("Y")) {
					continue loop;
				}
				else if(yn.equals("n")||yn.equals("N")) {
					System.out.println("시스템을 종료합니다.");
					break loop;
				}else {
					System.out.println("다시입력바랍니다 y/n");
					
				}
		   }
		}//while;
		
		
		
		//숙제 
//		가위바위보 겡
//		가위1
//		바위2
//		보3
//		컴퓨터와 가위바위보 게임진행
//		10번 게임을 해서 총 몇번 이겻는지 확인하는 게임
//		1.승리
//		2.무승부
//		3.패배
//		4.승리
//		5.승리
//		
//		승리 7번 무승부 번 패배 번
		
		
		
		
	}//메인

}//class
