package tk.avabin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class for random date generating.
 */
class RandomDateProvider extends RandomDataProvider {
    private Date min;
    private Date max;

    /**
     * Class constructor
     * @param min Min. bound of date to generate.
     * @param max Max. bound of date to generate.
     */
    RandomDateProvider(Date min, Date max) {
        this.min = min;
        this.max = max;
    }

    /**
     * BUG: Hours of generated dates will be the same, and will be same as UTC - 1h
     *
     * @return random date (except hours, look above)
     */
    Date nextDate() {
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

    void setMin(Date min) {
        this.min = min;
    }

    @SuppressWarnings("unused")
    public void setMax(Date max) {
        this.max = max;
    }
}
