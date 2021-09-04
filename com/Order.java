package com;

public class Order {

	private Integer id;
	private Double price;
	private Double discount;
	private Integer quantity;
	private Double grandtotal;
	
	//constructor
	public Order() {
	super();
	}
	
	//paramaterize constructor
	public Order(Integer id,Double price,Double discount,Integer quantity,Double grandtotal) {
	super();
	this.id = id;
	this.price =price;
	this.discount=discount;
	this.quantity = quantity;
	this.grandtotal= grandtotal;
	}


	//id
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	//price
	public Double getPrice() {
	return price;
	}
	public void setPrice(Double price) {
	this.price = price;
	}
	
	//discount
	public Double getDiscount() {
	return discount;
	}
	public void setDiscount(Double discount) {
	this.discount = discount;
	}

	//quantity
	public Integer getQuantity() {
	return quantity;
	}
	public void setQuantity(Integer quantity) {
	this.quantity = quantity;
	}
	
		
	//grandtotal
		public Double getGrandtotal() {
		return grandtotal;
		}
		public void setGrandtotal(Double grandtotal) {
		this.grandtotal = grandtotal;
		}

	


}
