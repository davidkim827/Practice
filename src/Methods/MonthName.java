package Methods;

/**
 * Created by dk on 8/22/2017.
 */
public class MonthName {
    public static void main(String[] args) {
        System.out.println( "Month 1: " + month_name(1) );
        System.out.println( "Month 2: " + month_name(2) );
        System.out.println( "Month 3: " + month_name(3) );
        System.out.println( "Month 4: " + month_name(4) );
        System.out.println( "Month 5: " + month_name(5) );
        System.out.println( "Month 6: " + month_name(6) );
        System.out.println( "Month 7: " + month_name(7) );
        System.out.println( "Month 8: " + month_name(8) );
        System.out.println( "Month 9: " + month_name(9) );
        System.out.println( "Month 10: " + month_name(10) );
        System.out.println( "Month 11: " + month_name(11) );
        System.out.println( "Month 12: " + month_name(12) );
        System.out.println( "Month 43: " + month_name(43) );

    }
    public static String month_name (int a){
        String monthName = "";
        
        if (a == 1)
            monthName = "January";
        else if (a == 2)
            monthName = "February";
        else if (a == 3)
            monthName = "March";
        else if (a == 4)
            monthName = "April";
        else if (a == 5)
            monthName = "May";
        else if (a == 6)
            monthName = "June";
        else if (a == 7)
            monthName = "July";
        else if (a == 8)
            monthName = "August";
        else if (a == 9)
            monthName = "September";
        else if (a == 10)
            monthName = "October";
        else if (a == 11)
            monthName = "November";
        else if (a == 12)
            monthName = "December";
        else
            monthName = "error";
        return monthName;
    }
}

