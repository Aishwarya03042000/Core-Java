import java.util.*;

class NumInRightAngle{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.println("Enter number of row");
short row = sc.nextShort();
int number =1;
for(int i=1; i<=row; i++){
for(int j=1; j<=i; j++){

while(true){
if(number%2 != 0){
System.out.print(" "+number);
number++;
break;
}else
number++;
}
}
System.out.println();
}
}
}

