import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//¼ıÀÚ¸ÂÃß±âÇÁ·Î±×·¥
		//¼ıÀÚ 5°³¸¦ ¿¬¼ÓÀ¸·Î ¹Ş¾Æ¼­ ·£´ı¼ö ÀÚ¸´¼ö¶û ºñ±³ÇÏ¿© ¸î°³¸¦ ¸Â­Ÿ´ÂÁö È®ÀÎ.
		//3°³ÀÌ»ó ¸ÂÀ¸¸é 100¸¸¿ø. 2°³ÀÌ»ó ¸ÂÀ¸¸é 10¸¸¿ø, 1°³ÀÌ»ó¸ÂÀ¸¸é 1¸¸¿ø
		//Ãâ·ÂÇüÅÂ > ·£´ı¼ö ***** ÀÔ·Â¼ö ***** °°Àº¼ö ÀÔ·Â *°³ , »ó±İ *¸¸¿ø
		
		
	    //ÇÏ³ªÇÏ³ª ¹ŞÀ» °æ¿ì 0~9·£´ı
	    int ran1=(int)(Math.random()*10);
	    int ran2=(int)(Math.random()*10);
	    int ran3=(int)(Math.random()*10);
	    int ran4=(int)(Math.random()*10);
	    int ran5=(int)(Math.random()*10);
	    //·£´ı¼öµéÀÌ Áßº¹µÇÁö ¾Êµµ·Ï..
	    //2¹ø¼ö°¡ 1¹ø¼ö¶û °°À¸¸é ´Ù½Ã·£´ı, 3¹ø¼ö°¡ 1¹øÀÌ³ª 2¹ø°ú °°À¸¸é ´Ù½Ã·£´ı~~ÀÌ·±½ÄÀ¸·ç..¤Ì
	    
	    
	    
	    int count=0;
	    //ÀÔ·Â
	    Scanner scan=new Scanner(System.in);
		
	    System.out.println("[¼ıÀÚ¸ÂÃß±â°ÔÀÓ]");
	    System.out.println("´Ù¼¸ÀÚ¸® ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
	    String input=scan.nextLine();
	    
	    //input,charAt(0)	
	    if(ran1==(input.charAt(0)-'0')) {
	    	count++;
	    }	
	    if(ran2==(input.charAt(1)-'0')) {
	    	count++;
	    }
	    if(ran3==(input.charAt(2)-'0')) {
	    	count++;
	    }
	    if(ran4==(input.charAt(3)-'0')) {
	    	count++;
	    }
	    if(ran5==(input.charAt(4)-'0')) {
	    	count++;
	    }
	    
	    System.out.println("·£´ı¼ö :"+ran1+ran2+ran3+ran4+ran5);

	    System.out.println("ÀÔ·Â¼ö :"+input);

	    System.out.println("°°Àº¼öÀÔ·Â :"+count);
	    
	    switch(count) {
	    case 0:
	    	System.out.println("»ó±İ¾øÀ½");
	    	break;	    
	    case 1:
	    	System.out.println("»ó±İ :1¸¸¿ø");
	    	break;
	    case 2:
	    	System.out.println("»ó±İ :10¸¸¿ø");
	    	break;
	    case 3 :case 4 :case 5:
	    	System.out.println("»ó±İ :100¸¸¿ø");	
	    	break;
	    default : 
	    	;
	    }
	    
	}
	}

