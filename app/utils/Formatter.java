package utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import play.i18n.Messages;

/**
 * @author kli
 *
 * For formatting values for the UI 
 */

public class Formatter {

	/**
	 * @param value
	 * @return format date into a correct string for UI (03 Oct 2015)
	 * @throws ParseException
	 */
	public static String formatDate(String value) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(value);
		String format = Messages.get("date.format");
		dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}
	
	/**
	 * @param value
	 * @return format price value into a correct string for the UI (£?.??)
	 * @throws ParseException 
	 */
	public static String formatPrice(Double value) throws ParseException {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		return Messages.get("currency") + decimalFormat.format(value);
	}
}
