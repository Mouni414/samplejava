class Leapyr
{ 
 public static void main(String args[])
 {
  int year=2016;
  if(year%4==0 && year%100!=0 || year%400==0)
  {
  System.out.println("It is leap year:"+year);
  }
  else
  {
  System.out.println("It is not leap year");
  }
 }
}