package models;

import java.text.ParseException;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Statement model for unmarshalling json
 */
public class Statement {

	private String generated;
	private String due;
	private Period period;
	
	public String getGenerated() throws ParseException {
		return Formatter.formatDate(generated);
	}
	
	public void setGenerated(String generated) {
		this.generated = generated;
	}
	
	public String getDue() throws ParseException {
		return Formatter.formatDate(due);
	}
	
	public void setDue(String due) {
		this.due = due;
	}
	
	public Period getPeriod() {
		return period;
	}
	
	public void setPeriod(Period period) {
		this.period = period;
	}
	
	public String getDueDate() throws ParseException {
		return Formatter.formatDate(due);
	}
	
	@Override
	public String toString() {
		return "Statement [generated=" + generated + ", due=" + due
				+ ", period=" + period + "]";
	}
}
