package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderService {
	
	static HashMap<Integer, Order> orderIdMap = getOrderIdMap(); //map list

	public OrderService() {
		super();

		 if (orderIdMap == null) {
		orderIdMap = new HashMap<Integer, Order>();
		
		// Creating some objects of Order while initializing
		Order mobileOrder = new Order(1,10000.00 , 2000.00,1,8000.00 );
		Order laptopOrder = new Order(2, 40000.00, 5000.00,2, 70000.00);
		Order watchOrder = new Order(3, 2000.00, 500.00,1, 1500.00);
		Order shoeOrder = new Order(4, 500.00,000.00,1, 500.00);

		 //adding map list of collections in java
		orderIdMap.put(1, mobileOrder);
		orderIdMap.put(2, laptopOrder);
		orderIdMap.put(3, watchOrder);
		orderIdMap.put(4, shoeOrder);
		}
		}

		 public List<Order> getAllOrderlist() {
		List<Order> orderlist = new ArrayList<Order>(orderIdMap.values());
		return orderlist;
		}

		 public Order getOrder(int id) {
		Order Order = orderIdMap.get(id);
		return Order;
		}
		// add order
		public Order addOrder(Order Order) {
		Order.setId(getMaxId()+ 1);
		
		// key , value
		orderIdMap.put(Order.getId(), Order); ///logic class
		return Order;
		}
		//update
		public Order updateOrder(Order order) {
		if (order.getId() <= 0)
		return null;
		orderIdMap.put(order.getId(), order);
		return order;

		 }
		
		//delete

	    public void deleteOrder(int id) {
		orderIdMap.remove(id);
		}

		 public static HashMap<Integer, Order> getOrderIdMap() {
		return orderIdMap;
		}

		 // Utility method to get max id
		public static int getMaxId() {
		int max = 0;
		for (int id : orderIdMap.keySet()) {
		if (max <= id)
		max = id;

		 }
		return max;
		}
		

}


