
public class Ex0206_03 {
		public static void main(String[] args) {
			//책>>2-4랑중요!!!!!!!
			//p37 >>외울필요는 없...:D
			//진법
			
			byte b=1;
			short s=2;
			char c='A';
			
			int finger=10;
			long big=100_000_000_000L;
			long hex=0xFFFF_FFFF_FFFF_FFFFL;//long hex=0xFFFFFFFFFFFFFFFF  _는 안써도된다..
			
			int octNum=010;//8진수 10, 10진수로는 8
			int hexNum=0x10;//16진수 10, 10진수로는 16 (읽을때> 오엑스일공) 
			int binNum=0b10;//2진수 10, 10진수로는 2
			
			System.out.printf("b=%d%n",b);
			System.out.printf("s=%d%n",s);
			System.out.printf("c=%c,%d %n",c,(int)c);
			System.out.printf("finger=[%5d]%n",finger); //뒷공간 포함해서 5자리를 허자
			System.out.printf("finger=[%-5d]%n",finger); //앞공간 포함해서 5자리를 허자
			System.out.printf("finger=[%05d]%n",finger); //앞공간을 0으로 채워라
			System.out.printf("big=%d%n",big);
			System.out.printf("hex=%#x%n",hex);//#은 접두사(0x, 0, 0b 등 몇진수에 해당하는지에 따라 변동되는 접두사) (16진수0x,8진수 0)
			System.out.printf("octNum=%o, %d%n",octNum,octNum);//8진수 %o
			System.out.printf("hexNum=%x, %d%n",hexNum,hexNum);//16진수 %x
			System.out.printf("20을 2진수로 변환 :%s %n",Integer.toBinaryString(20));///Integer.toBinaryString <<<
			System.out.printf("binNum=%s, %d%n",Integer.toBinaryString(binNum),binNum);///Integer.toBinaryString <<<
		}
}
