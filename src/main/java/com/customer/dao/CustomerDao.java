package com.customer.dao;

import java.util.List;

import com.customer.pojo.Address;
import com.customer.pojo.Customer;


public interface CustomerDao {
	
	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int id);
	
	public Customer updateCustomer(Customer customer);
	
	public boolean deleteCustomer(int id);
	
	public void evictCahce();
	
	//Address related Crud operations
	
	public Address addAddress(Address address);
	
	public Address updateAddress(Address address);
	
	public boolean deleteAddress(int addressId);

	Customer getCustomerByEmail(String email);
	
}
