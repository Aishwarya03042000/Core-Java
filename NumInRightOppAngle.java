import java.util.*;

class NumInRightOppAngle{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
int row = sc.nextInt();

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i<=j)
System.out.print(" "+i);
else
System.out.print("  ");
}
System.out.println();
}
}
}

