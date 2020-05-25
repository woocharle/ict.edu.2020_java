package com.ict.edu6;

public class ProducerCustomerEx {
	public static void main(String[] args) {
		Car c = new Car();
		Producer producer = new Producer(c);
		Customer customer = new Customer(c);
		Thread tproducer = new Thread(producer);
		Thread tcustomer = new Thread(customer);
		tproducer.start();
		tcustomer.start();
	
	}
}
