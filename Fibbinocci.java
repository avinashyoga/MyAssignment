package week2.day1;

public class Fibbinocci {
	public static void main(String[] args) 
	{
		int firstTerm=0,secondTerm=1,sum=0 ;
		
		System.out.print(firstTerm+" "+secondTerm);
		
		for (int i = 1; i <=11; i++) {
			
			sum=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=sum;

			System.out.print(" "+sum);
			
	}
		

}

}