package abc;

public class TestOne {

	public static void main(String[] args) {
		int [] a = new int[0];
		int [] b = null;
		
		System.out.println(10 == 10);

		System.out.println(a.length);
		//		System.out.println(b.length);
		System.gc();

		first:		for(int i=0; i<5; i++)	{
			second:	for(int j=0; j<5; j++)	{
				if(j==3) continue second;
			}
		}
		third:
			for( int a1 = 0; a1 < 10; a1++) {

			}		
	}

}
