class SquareMatrix{

public static void main(String[] args){
System.out.println("Started main method");
int row =4;

for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i==1 || j==1 || i==row || j==row){
System.out.print(i + "" + j + " ");
}
else{
System.out.print("   ");
}
}
System.out.println();
}
}
}