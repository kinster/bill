package models;

import java.text.ParseException;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Rental model for unmarshalling json
 */
public class Rental {

	private String title;
	private Double cost;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
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
		return "Rental [title=" + title + ", cost=" + cost + "]";
	}
}
