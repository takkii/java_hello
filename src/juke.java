import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;

class juke{
  public static void main(String[] args){
	jruby jr = new jruby();

	jr.output();
  }
}

class jruby extends juke{
	// TimeZone
	LocalDateTime localDateTime = LocalDateTime.now();
	ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
	Date date = new Date();


    public void output(){
      // Output
	  System.out.println(localDateTime);
	  System.out.println(dateTime);
      System.out.println(date);
    }
}

