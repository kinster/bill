package models;

import java.text.ParseException;
import java.util.List;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Package model for unmarshalling json
 */
public class Package {

	private List<Subscription> subscriptions;
	private Double total;
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public String toPriceString() throws ParseException {
		return Formatter.formatPrice(total);
	}
	
	@Override
	public String toString() {
		return "Package [subscriptions=" + subscriptions + ", total=" + total
				+ "]";
	}
}
