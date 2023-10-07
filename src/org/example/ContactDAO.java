package org.example;

public class ContactDAO {
	
	private static ContactDAO c=null;
	
	private ContactDAO() {

	}
	
	public static ContactDAO getInstance() {
		
		if (c==null) {
			c=new ContactDAO();
		}
		return c;
	}
	
	private void getContactDetails() {

	}
	
	public static void main(String[] args) {
		ContactDAO obj1=ContactDAO.getInstance();
		System.out.println(obj1);
	}

}
 