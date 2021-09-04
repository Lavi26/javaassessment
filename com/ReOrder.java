package com;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReOrder {
	

OrderService orderService = new OrderService();//for order
ProductService productService= new ProductService();/// FOR PRODUCT



// retrive order info USing @GET MEthod
@GetMapping("/orderinfo")
public Order getDummyOrder() {

 Order o = new Order(); // creating java object
o.setId(2);
o.setPrice(40000.00);
o.setDiscount(5000.00);
o.setQuantity(2);
o.setGrandtotal(70000.00);
return o;
}

 // retrive the order information by id

 @GetMapping("/orderinfoid/{id}")
public Order getDummyOrderById(@PathVariable("id") Integer id) {

  Order o = new Order(); // creating java object
 o.setId(id);
 o.setPrice(40000.00);
 o.setDiscount(5000.00);
 o.setQuantity(2);
 o.setGrandtotal(70000.00);
 return o;

}


 // add the order information POst

 @PostMapping(value = "/insertorderdetails")
public Order insertDummyOrder(@RequestBody Order order) {
return orderService.addOrder(order); //calling the service
}

//update order info
@PutMapping("/update")
public Order updateorderInfo(@RequestBody Order order) {
return orderService.updateOrder(order);

 }

//get order list

@GetMapping("/getlist")
public List<Order> getDummyOrderList() {
List<Order> listOfOrder = orderService.getAllOrderlist();
return listOfOrder;
}

// delete list

@DeleteMapping ("/delete/{id}")
public List<Order> deleteOrderById(@PathVariable Integer id) {
new OrderService().deleteOrder(id);
return new OrderService().getAllOrderlist();
}



//RETRIEVE PRODUCT INFO USING @GET MEthod
@GetMapping("/ProductInfo")
public Product getDummyProduct(){
    Product p = new Product();// creating java product
    p.setId(2);
    p.setQuantity(100);
    p.setCategory("laptop");
    p.setName("pavilion");
    p.setBrand("HP");
    p.setDescription("good laptop for work");
    p.setPrice(1000.00);
    p.setDiscount(500.00);
    p.setStatus(1);
    return p;
    
}



 
 
 // RETRIEVE THE PRODUCT INFO BY ID 
 

 @GetMapping("/productinfoid/{id}")
public Product getDummyProductById(@PathVariable("id") Integer id) {
     
     
        Product p = new Product();// creating java product
        p.setId(2);
        p.setQuantity(100);
        p.setCategory("laptop");
        p.setName("pavilion");
        p.setBrand("HP");
        p.setDescription("good laptop for work");
        p.setPrice(1000.00);
        p.setDiscount(500.00);
        p.setStatus(1);
    return p;
     
 }




 // ADD THE PRODUCT INFORMATION BY POST

 
 @PostMapping(value = "/insertproductdetails")
public Product insertDummyProduct(@RequestBody Product product) {
return productService.addProduct(product); //calling the service
 

 }

//UPDATE PRODUCT INFO

 
@PutMapping("/updateproduct")
public Product updateProductInfo(@RequestBody Product product) {
    
return productService.updateProduct(product);

 

}
 


//GET PRODUCT LIST

 
@GetMapping("/getproductlist")
public List<Product> getDummyProductList() {
List<Product> listOfProduct = productService.getAllProductlist();
return listOfProduct;
}

 


//DELETE PRODUCT LIST



@DeleteMapping ("/deleteproduct/{id}")
public List<Product> deleteProductById(@PathVariable Integer id) {
new ProductService().deleteProduct(id);
return new ProductService().getAllProductlist();
}
 


}



































