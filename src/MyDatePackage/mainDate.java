package MyDatePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mainDate {
    public static void main(String[] args) {
        //1.      В классе MyDate задать натуральны порядок дат, т.е. реализовать интерфейс Comparable. При этом пусть считается, что //01.01.2020 < 01.01.2022, т.е. дата тем больше, чем более поздний момент она отражает.
        //
        ArrayList<MyDate>dates=new ArrayList<>();
        dates.add(new MyDate(12,8,2020));
        dates.add(new MyDate(5,4,2022));
        dates.add(new MyDate(8,6,2020));
        dates.add(new MyDate(12,4,2022));
        dates.add(new MyDate(30,1,2022));
        dates.add(new MyDate(20,12,2021));
        System.out.println(Arrays.toString(new ArrayList[]{dates}));
        Collections.sort(dates);
        for (int i = 0; i <dates.size() ; i++) {
            System.out.println(""+ dates.get(i).toString());
            System.out.println(" ----------------------      ");
        }
    }

}
