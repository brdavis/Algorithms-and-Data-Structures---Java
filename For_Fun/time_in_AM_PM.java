import java.text.SimpleDateFormat;
import java.util.Date;

public class time_in_AM_PM {
	public static void main(String[] args) {
		Date current_date = new Date();
		String date_format = "HH:mm a";
		SimpleDateFormat f = new SimpleDateFormat(date_format);
		System.out.println(f.format(current_date));
	}
}
