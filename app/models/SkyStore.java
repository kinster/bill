package models;

import java.text.ParseException;
import java.util.List;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * SkyStore model for unmarshalling json
 */
public class SkyStore {

	private List<Rental> rentals;
	private List<BuyAndKeep> buyAndKeep;
	
	private Double total;
	
	public List<Rental> getRentals() {
		return rentals;
	}
	
	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	public List<BuyAndKeep> getBuyAndKeep() {
		return buyAndKeep;
	}
	
	public void setBuyAndKeep(List<BuyAndKeep> buyAndKeep) {
		this.buyAndKeep = buyAndKeep;
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
		return "SkyStore [rentals=" + rentals + ", buyAndKeep=" + buyAndKeep
				+ ", total=" + total + "]";
	}
}
