import java.util.*;

class NumInSandGlass{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
int row = sc.nextInt();
int a =2;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if( i==j || j==3 || i+j == row+1){
System.out.print("   "+a);
a = a+2;
}
else
System.out.print("    ");
}
System.out.println();
}
}
}
