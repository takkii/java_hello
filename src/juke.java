import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;

public class juke{
	public static void main(String[] args){
		// TimeZone
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		Date date = new Date();

		// Output
		System.out.println(localDateTime);
		System.out.println(dateTime);
		System.out.println(date);
	}
}
