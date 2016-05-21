package tk.avabin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Avabin on 21.05.2016.
 */
public class RandomDateProvider extends RandomDataProvider {
    private Date min;
    private Date max;

    /**
     * Class constructor
     * @param min Min. bound of date to generate.
     * @param max Max. bound of date to generate.
     */
    public RandomDateProvider(Date min, Date max) {
        this.min = min;
        this.max = max;
    }

    public Date nextDate() {
        long MILLIS_PER_DAY = 1000 * 60 * 60 * 24;
        GregorianCalendar s = new GregorianCalendar();
        s.setTimeInMillis(min.getTime());
        GregorianCalendar e = new GregorianCalendar();
        e.setTimeInMillis(max.getTime());

        // Get difference in milliseconds
        long endL = e.getTimeInMillis() + e.getTimeZone().getOffset(e.getTimeInMillis());
        long startL = s.getTimeInMillis() + s.getTimeZone().getOffset(s.getTimeInMillis());
        long dayDiff = (endL - startL) / MILLIS_PER_DAY;

        Calendar cal = Calendar.getInstance();
        cal.setTime(min);
        cal.add(Calendar.DATE, rand.nextInt((int) dayDiff));
        return cal.getTime();
    }

    public void setMin(Date min) {
        this.min = min;
    }

    public void setMax(Date max) {
        this.max = max;
    }
}
