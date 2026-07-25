package com.interfaces.ecommerce.assigenment;

public  abstract class  AbstractECommerce implements ECommerceService {
	
	 // Instance Variables

    protected String companyName;
    protected String headOffice;
    protected int totalProducts;
    protected double deliveryCharge;
    protected double rating;
    protected  long mobileNumber;
    protected  String emailid;
    
   
    // Constructor

	public AbstractECommerce(String _companyName, String _headOffice, int _totalProducts, double _deliveryCharge,
			double _rating ,long _mobileNumber,String _emailId) {
		super();
		this.companyName = _companyName;
		this.headOffice =  _headOffice;
		this.totalProducts = _totalProducts;
		this.deliveryCharge = _deliveryCharge;
		this.rating = _rating;
		this.mobileNumber = _mobileNumber;
		this.emailid = _emailId;
	}
    
    
    // Common Method

	public void companyDetails()
	
	{
		
		
		System.out.println("--------------------------------");
		System.out.println();
        System.out.println("Company Name    : " + companyName);
        System.out.println("Head Office     : " + headOffice);
        System.out.println("Total Products  : " + totalProducts);
        System.out.println("Delivery Charge : ₹" + deliveryCharge);
        System.out.println("Rating          : " + rating);
        System.out.println("Mobile Number   :- "+ mobileNumber);
        System.out.println("Email Id        :- "+ emailid);
        System.out.println();
        
        System.out.println("--------------------------------");

	}
	
    
    

}
