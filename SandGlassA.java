import java.util.Scanner;

class SandGlassA{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of columns");
byte col = sc.nextByte();

for(int i=1; i<=col; i++){
for(int j=1; j<=col; j++){
if((j<=i && i+j<=col+1) || (j>=i && i+j>col)){
System.out.print(i+"" + j + " ");
}
else
System.out.print("   ");
}
System.out.println();
}
}
}
