package onetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTimeInSpecificFormat {

	public static void main(String[] args) {
		// Sample Output:
		//Now: 2017/06/16 08:52:03.066 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:ms");
		Date now = new Date();
		String todaysDate = sdf.format(now);
		System.out.println(todaysDate);
		//2026/01/14 11:01:37
		//2026/01/14 11:02:34:234
	}

}
