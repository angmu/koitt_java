import java.util.Scanner;

public class Ex0204_01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("점수를 입력하세요.");
	int total=scan.nextInt();
	String grade="";
	
	if(total>=90) {//A+ 98,A 97-95 ,A- 90-94
		grade="A";
		if(total>=95) {
			grade+= "+";
					//grade=grade+"+";
		}else if(total<=94) {
			grade+="-";
		}else{
			grade+="";
		}}		
		else if(total>=80) {
			grade="B";
			if(total>=85) {
				grade+= "+";
						//grade=grade+"+";
			}else if(total<=84) {
				grade+="-";
			}else{
				grade+="";
			}}
		else if(total>=70) {
			grade="C";
			if(total>=75) {
				grade+= "+";
						//grade=grade+"+";
			}else if(total<=74) {
				grade+="-";
			}else{
				grade+="";
			}}
		else if(total>=60) {
			grade="B";
			if(total>=65) {
				grade+= "+";
						//grade=grade+"+";
			}else if(total<=64) {
				grade+="-";
			}else{
				grade+="";
			}}
		else {
			grade="F";
		}		
		
		System.out.printf("당신의 학점은 ? %s",grade);
		
		
		
		
	}
}

