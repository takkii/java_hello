import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class juke{
  public static void main(String[] args){
	jruby jr = new jruby();

	jr.output();
  }
}

class jruby extends juke{
	// TimeZone
    private final String reiwa_kanji = "令和0";
    // Delete when "0" becomes "10".
    private final String reiwa_alpha = "R0";
    private final Date date = new Date();
    private final SimpleDateFormat sdf_koyomi = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒 ： EEEE");
    private final Calendar cal = Calendar.getInstance();
    private final String reiwa_year = String.valueOf(cal.get(Calendar.YEAR) - 2018);
    private final String reiwa_beta = (reiwa_kanji + (reiwa_year) + "年0" + (cal.get(Calendar.MONTH) + 1) + "月0" + cal.get(Calendar.DAY_OF_MONTH) + "日");
    private final String reiwa_delta = (reiwa_alpha + (reiwa_year) + ".0" + (cal.get(Calendar.MONTH) + 1) + ".0" + cal.get(Calendar.DAY_OF_MONTH));
    private final String comma = " : ";
    private final String reiwa = reiwa_beta + comma + reiwa_delta;
    private final int nen_nichi = cal.get(Calendar.DAY_OF_YEAR);
    private final int nen_getsu = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
    private final String koyomi = sdf_koyomi.format(cal.getTime());
    private int int_year = (nen_getsu - nen_nichi);
    private final String string_year = Integer.toString(int_year);
    // major version number set.
    private final double TopNumber = 1.1;
    // use, fix change update version number.
    private final int lastNumber = 1;
    // use number layout control.
    private final String zero_comma = ".";

    // version number set.
    private final String string_number = String.valueOf(TopNumber);
    private final String version_lastnumber = Integer.toString(lastNumber);
    private final String version_number = string_number + zero_comma + version_lastnumber;
    private final String himekuriVersion = "日めくりの数え番号";
    private final String version = himekuriVersion + comma + version_number;

    public void output(){
      // himekuri function
      System.out.println(koyomi);
      System.out.println("来年の1月1日まであと" + comma + string_year + "日です");
      System.out.println(reiwa);
      cal.setTime(date);
      // System out println call
      System.out.println(version);
    }
}

