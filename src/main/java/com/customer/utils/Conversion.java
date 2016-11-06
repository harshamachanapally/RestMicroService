package com.customer.utils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.customer.DTO.AddressDTO;
import com.customer.DTO.CustomerDetailsDTO;
import com.customer.pojo.Address;
import com.customer.pojo.Customer;


public class Conversion {
	
	
	public static CustomerDetailsDTO CustomerToCustomerDetailsDTO(Customer customer, String type){
		List<AddressDTO> addressDTO = new ArrayList<AddressDTO>();
		if( type.equalsIgnoreCase("EAGER") ) {
			List<Address> addressList = customer.getAddress();
			if( !addressList.isEmpty() ) {
				for(Address address: addressList) {
					addressDTO.add(AddressToAddressDTO(address));
				}
			}
		}
		
		CustomerDetailsDTO customerDetailDTO = new CustomerDetailsDTO(customer.getId(), 
									customer.getName(), customer.getEmail(),addressDTO);
		
		return customerDetailDTO;
	}
	
	public static AddressDTO AddressToAddressDTO(Address address){
		AddressDTO addressDTO = new AddressDTO(address.getAddress_id(), address.getStreet(), address.getCity(),
				address.getState(), address.getPincode());
		
		return addressDTO;
	}
}
