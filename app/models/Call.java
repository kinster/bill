package models;

import java.text.ParseException;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Call model for unmarshalling json
 */
public class Call {

	private String called;
	private String duration;
	private Double cost;
	
	public String getCalled() {
		return called;
	}
	
	public void setCalled(String called) {
		this.called = called;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public String toPriceString() throws ParseException {
		return Formatter.formatPrice(cost);
	}
	
	@Override
	public String toString() {
		return "Call [called=" + called + ", duration=" + duration + ", cost="
				+ cost + "]";
	}	
}
