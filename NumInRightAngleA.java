import java.util.*;

class NumInRightAngleA{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
int row = sc.nextInt();

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i>=j)
System.out.print(" "+j);
}
System.out.println();
}
}
}
