package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseOrder{
	
	public BaseOrder(UUID userId){
		this.id = java.util.UUID.randomUUID(); 
		this.total = 0.00;
		this.payment = new Payment();
		this.products = new ArrayList<Product>();
		this.userid = userId;
		this.ShippingAddress = new Address();
		this.isComplete = false;
	}
	
	private UUID id;
	private Double total;
	private Payment payment;
	private List<Product> products;
	private Address ShippingAddress;
	private Boolean isComplete;
	private UUID userid;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public UUID getUserid() {
		return userid;
	}
	public void setUserid(UUID userid) {
		this.userid = userid;
	}
	public Address getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
}
