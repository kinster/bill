package models;

import java.text.ParseException;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Period model for unmarshalling json
 */
public class Period {
	
	private String from;
	private String to;
	
	public String getFrom() throws ParseException {
		return Formatter.formatDate(from);
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() throws ParseException {
		return Formatter.formatDate(to);
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		return "Period [from=" + from + ", to=" + to + "]";
	}
}
