class WeekDay{

public static void main(String []a){
  System.out.println("started main method");
  int day = 14;
  int week = day-5;

if(week == 1){
   System.out.println("Sunday");
}
else if(week == 2){
   System.out.println("Monday");
}
else if(week == 3){
   System.out.println("Tueday");
}
else if(week == 4){
   System.out.println("Wednesday");
}
else if(week == 5){
   System.out.println("Thurday");
}
else if(week == 6){
   System.out.println("Friday");
}
else if(week == 7){
   System.out.println("Saturday");
}
else{
   System.out.println("weekday not found");
}
}
}