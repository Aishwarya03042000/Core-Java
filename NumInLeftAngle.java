import java.util.*;

class NumInLeftAngle{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
int row = sc.nextInt();
int number =1;
for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i+j>row)
System.out.print(" "+j);
else
System.out.print("  ");
}
System.out.println();
}
}
}
