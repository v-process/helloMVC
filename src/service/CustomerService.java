package service;

import java.util.HashMap;

import model.Customer;

public class CustomerService {
	private HashMap <String, Customer> customers;

	private static final CustomerService instance = new CustomerService();
	
	private  CustomerService() {
		customers = new HashMap<String, Customer>();
	}

	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	
	public Customer loginCustomer(String id, String pw){
		//customer가 비어있는 경우.
		if(customers.get(id.toLowerCase()) == null){
			return null;
		}
		//customer 비밀번호와 입력한 비밀번호가 일치할 경우.
		else if(customers.get(id.toLowerCase()).getPw().equals(pw)){
			return customers.get(id.toLowerCase());	
		}
		//비밀번호 틀린경우.
		else{
			return null;
		}
		
	}
}