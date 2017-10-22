import java.util.Calendar;
import java.util.Formatter;

public class show_month {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		Calendar cal = Calendar.getInstance();
		f.format("%tB %tm", cal, cal);
		System.out.println(f);
	}
}
