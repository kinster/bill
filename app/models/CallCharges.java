package models;

import java.text.ParseException;
import java.util.List;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * CallCharges model for unmarshalling json
 */
public class CallCharges {

	private List<Call> calls;
	private Double total;
	
	public List<Call> getCalls() {
		return calls;
	}
	
	public void setCalls(List<Call> calls) {
		this.calls = calls;
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
		return "CallCharges [calls=" + calls + ", total=" + total + "]";
	}
}
