class Bank{

public static void main(String[] args){

System.out.println("Started main method");
String accountType = "fixed";

if( accountType == "zero balance"){
  System.out.println("Required min balance = 0");
} 
if(accountType == "saving"){
  System.out.println("Required min balance = 5000");
} 
if(accountType == "current"){
  System.out.println("Required min balance = 10000");
}
 
else{
  System.out.println("please enter valid accountType");
}
}
}  