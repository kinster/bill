package models;

import java.text.ParseException;

import com.fasterxml.jackson.annotation.JsonProperty;

import utils.Formatter;

/**
 * @author kinmanli
 *
 * Bill root model for unmarshalling json
 */
public class Bill {

	@JsonProperty("statement")
	private Statement statement;

	@JsonProperty("total")
	private Double total;
	
	@JsonProperty("package")
	private Package packageSubscriptions;
	
	@JsonProperty("callCharges")
	private CallCharges callCharges;

	@JsonProperty("skyStore")
	private SkyStore skyStore;
	
	public Statement getStatement() {
		return statement;
	}
	
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Package getPackageSubscriptions() {
		return packageSubscriptions;
	}
	
	public void setPackageSubscriptions(Package packageSubscriptions) {
		this.packageSubscriptions = packageSubscriptions;
	}
	
	public CallCharges getCallCharges() {
		return callCharges;
	}
	
	public void setCallCharges(CallCharges callCharges) {
		this.callCharges = callCharges;
	}
	
	public SkyStore getSkyStore() {
		return skyStore;
	}
	
	public void setSkyStore(SkyStore skyStore) {
		this.skyStore = skyStore;
	}
	
	public String toPriceString() throws ParseException {
		return Formatter.formatPrice(total);
	}
	
	@Override
	public String toString() {
		return "Bill [statement=" + statement + ", total=" + total
				+ ", packageSubscriptions=" + packageSubscriptions
				+ ", callCharges=" + callCharges + ", skyStore=" + skyStore
				+ "]";
	}
}
