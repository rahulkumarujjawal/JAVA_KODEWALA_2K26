class BankOfIndia
{
    public static void main(String args[])
    {
        System.out.println("Main Method Start");
        String result = BankOfIndia.accountDetails("Rahul Ujjawal",837373 ,"Basant sharma");
		System.out.println(result);
    }

    public static String accountDetails(String name,int accNumber,String  fatherName )
    {
        boolean accountExists = BankOfIndia.cheackAccountexisting(name);
        String accountType = BankOfIndia.cheackAccountType();
        String location = BankOfIndia.bankAccountlocation();
        String ifsc = BankOfIndia.ifscCode();
		return
                "\nName : " + name +
                "\nAccount Number : " + accNumber +
                "\nAccount Exists : " + accountExists +
                "\nAccount Type : " + accountType +
                "\nLocation : " + location +
                "\nIFSC : " + ifsc +
				 "\nfatherName : " + fatherName;
    }

    public static boolean cheackAccountexisting( String name)
    {
        return true;
    }

    public static String cheackAccountType()
    {
        return "Saving";
    }

    public static String bankAccountlocation()
    {
        return "Bangalore";
    }

    public static String ifscCode()
    {
        return "BOI2332S";
    }
}