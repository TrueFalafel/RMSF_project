package cat.login1st;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util{

    public static long convertStringToTimestamp(String str_date) {

        try {
            long timeStampDate;
            DateFormat formatter;
            formatter = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
                Date date = formatter.parse(str_date);
                timeStampDate = date.getTime();

            return timeStampDate;
        } catch (ParseException e) {
            System.out.println("Exception :" + e);
            return 0;
        }
    }
}
