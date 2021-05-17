import java.util.*;

class NumInTriangle{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
short row = sc.nextShort();
int number = 1;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){

if(i+j<=row+1 && i>=j){
System.out.print(number+" ");
number = number+2;
}else
System.out.print(" ");
}
System.out.println();
}
}
}