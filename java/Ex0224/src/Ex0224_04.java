import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3���� �л��� �Է¹޾� �й� �̸� �� �� �� �հ� ��� ���
		//�й��� 1���� 1������(�ڵ�)
		//�Է��� �޼ҵ�� �и�
		//��� �޼ҵ� �и�
		//��� �޼ҵ�и�
		//�������� �޼ҵ� �и�
		//1. �л��Է�
		//2. �л� �������
		//3. �л� ��������
		//4. �g�����
		//5 ����
		
		int select;
		Stu[] stu=new Stu[3];
		int stu_count = 0;
		String [] sub= {"����","����","����"};
		loop:
		while(true) {
			select=print();
			switch(select) {
			
			case 1:
				System.out.println("�л��Է� ����");
				stu_count=scoreInput(stu,stu_count,sub);
				break;
			case 2:
				System.out.println("�л�������� ����");
				scoreOutput(stu);
				break;
			case 3:
				System.out.println("�л����� ���� ����");
				scoreChange(stu);
				break;
			case 4:
				System.out.println("�л�����Է� ����");
				rankArr(stu);
				break;
			case 5:
				System.out.println("���α׷��� ����");
				break loop;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�");
				continue;
			
			
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
	//�⺻�Է°�
	static int print() {
		System.out.println("===========");
		System.out.println("�л����� ���α׷�");
		System.out.println("===========");
		System.out.println("1)�л������Է�");
		System.out.println("2)�л��������");
		System.out.println("3)�л���������");
		System.out.println("4)�л�����Է�");
		System.out.println("5)����");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>>");
		Scanner scan=new Scanner(System.in);
		int select=scan.nextInt();
		return select;
	}
	//���� �Է�
	static int scoreInput(Stu[] stu,int a,String [] sub) {
		Scanner scan=new Scanner(System.in);
		
		int [] score=new int[3];
		for(int i=0;i<stu.length;i++) {
			System.out.println((i+1)+"��° �л��� �̸��� �Է��ϼ���");
			String name=scan.nextLine();
			for(int j=0;j<stu.length;j++) {
				System.out.println(sub[j]+"������ �Է��ϼ���");
				score[j]=scan.nextInt();
				scan.nextLine();
			}stu[i]=new Stu(name,score[0],score[1],score[2]);
			a++;
		}
		return a;
	}//scoreInput
	//�������
	static void scoreOutput(Stu[] stu) {
		System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg);
		}System.out.println();
	}//scoreOutput
	
	//�������
	static void scoreChange(Stu[] stu) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �л��� �й��� �Է��ϼ���");
		int ch=scan.nextInt();
		boolean boo=false;
		for(int i=0;i<stu.length;i++) {
			if(ch==stu[i].hak_num) {
				boo=true;
				System.out.println(stu[i].hak_num+"/"+stu[i].name+"�� �����Ͽ����ϴ�");
				System.out.println("0)�̸����� 1)����� 2)����� 3)���м���");
				System.out.println("������ �׸��� ������>>>");
				int ch2=scan.nextInt();
				scan.nextLine();
				switch(ch2) {
				case 0:
					//���������� �հ� ��� ����� ��� �ٲ�����.. rank�� ��� 0���� �ͱ׷����Ѵٸ�..
					System.out.println("�̸� ������ ����. �����ϰ��� �ϴ� �̸��� �Է��ϼ���(���� �̸�:"+stu[i].name+")");
					stu[i].name=scan.nextLine();
					System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
					break;
				case 1:
					sw_modify(stu,i,"����");
					break;
				case 2:
					sw_modify(stu,i,"����");
					break;
				case 3:
					sw_modify(stu,i,"����");
					break;
				default:
					System.out.println("�߸������Ͽ����ϴ�.");
					continue;
				}
				break;
		}
		}if(boo==false) {
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		}
		System.out.println();
	}//scoreChange
	
	
	static void sw_modify(Stu[] stu,int i,String sub){
		Scanner scan=new Scanner(System.in);
		System.out.println(sub+"���� ������ ����. ������ �Է��ϼ���");
		if(sub.equals("����")) {
			stu[i].kor=scan.nextInt();
			System.out.println("����� ������ �Ϸ�Ǿ����ϴ�.");
		}else if(sub.equals("����")) {
			stu[i].eng=scan.nextInt();
			System.out.println("����� ������ �Ϸ�Ǿ����ϴ�.");
		}else{
			stu[i].math=scan.nextInt();
			System.out.println("���м��� ������ �Ϸ�Ǿ����ϴ�.");
		}
		stu[i].modify();
	}
	
	
	
	static void rankArr(Stu[] stu) {
		for(int i=0;i<stu.length;i++) {
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					stu[i].rank++;
				}
			}
		}//
		
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].name+":"+stu[i].rank+"��");
		}
	}//rankArr
	
	
	
}//class

class Stu{
	//static������ ��� ��ü�� ����ϹǷ� count�����δ�  ��������������.
	static int count;
	int kor;
	int eng;
	int math;
	String name;
	int hak_num;
	int total;
	double avg;
	int rank=1;
	{
		count++;
		hak_num=count;
	}
	Stu(){
		this("name",0,0,0);
	}
	Stu(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=kor+eng+math;
		this.avg=total/3;
	}
	
	void total() {
		total=kor+eng+math;
	}
	void avg() {
		avg=total/3;
	}
	void modify() {
		total();
		avg();
		rank=0;
	}
}