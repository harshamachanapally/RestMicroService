package com.customer.service;

import java.util.List;

import com.customer.DTO.AddressDTO;
import com.customer.DTO.CustomerDetailsDTO;
import com.customer.pojo.Address;
import com.customer.pojo.Customer;



public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public List<CustomerDetailsDTO> getCustomers();
	
	public CustomerDetailsDTO getCustomer(int id);
	
	public CustomerDetailsDTO updateCustomer(Customer customer);
	
	public boolean deleteCustomer(int id);
	
	public void evictCahce();
	
	//Address related Crud operations
	
	public AddressDTO updateAddress(Address address,int customerId);
	
	public boolean deleteAddress(int addressId);

	AddressDTO addAddress(Address address, int customerId);
	
	
}
