package models;

import java.text.ParseException;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Subscription model for unmarshalling json
 */
public class Subscription {

	private String type;
	private String name;
	private Double cost;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
		return "Subscription [type=" + type + ", name=" + name + ", cost="
				+ cost + "]";
	}
}
