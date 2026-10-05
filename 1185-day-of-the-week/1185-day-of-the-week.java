class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
  int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
  int totalDays=0;
  for(int i=1971;i<year;i++){
    if(isLeapYear(i)){
        totalDays+=366;
    }else{
        totalDays+=365;
    }

  }
  for(int i=0;i<month-1;i++){
    totalDays+=months[i];

  }
  if(month>2 &&isLeapYear(year)){
    totalDays+=1;
  }
  totalDays+=day;
  return days[(totalDays+4)%7];

    }

    private boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0)||(year%400==0);
    }
}