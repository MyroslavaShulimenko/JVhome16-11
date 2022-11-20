package MyDatePackage;

public class MyDate implements Comparable<MyDate> {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return
                "day=" + day +
                ", month=" + month +
                ", year=" + year
                ;
    }

    @Override
    public int compareTo(MyDate o) {
      if (this.getYear()-o.getYear()>0 || this.getYear()-o.getYear()<0){
           return this.getYear()-o.getYear();
       }else
       {
           if (this.getMonth()-o.getMonth()>0 || this.getMonth()-o.getMonth()<0){
               return this.getMonth()-o.getMonth();
           } else {
               return this.getDay()-o.getDay();
           }
       }


    }
}
