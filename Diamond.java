import java.util.Scanner;

class Diamond{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows");
		byte row = sc.nextByte();
		
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				if(i-j<=row/2 && j-i<=row/2 && i+j<=row+(row/2)+1 && i+j>=row-(row/2)+1)
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
            System.out.println();
		}	
	}		
}