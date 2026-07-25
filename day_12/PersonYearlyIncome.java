class PersonYearlyIncome
{
    public static void main(String args[])
    {
        String firstName = args[0];
        String lastName = args[1];
        String location = args[2];
        int yearlyIncome = Integer.parseInt(args[3]);

        personYearlyIncome(firstName, lastName, location, yearlyIncome);
    }

    public static void personYearlyIncome(String firstName,
                                          String lastName,
                                          String location,
                                          int yearlyIncome)
    {
        System.out.println("------------------------------");

        System.out.println("First Name :- " + firstName);
        System.out.println("Last Name :- " + lastName);
        System.out.println("Location :- " + location);
        System.out.println("Yearly Income :- " + yearlyIncome);

        System.out.println("------------------------------");

        if (yearlyIncome < 200000)
        {
            System.out.println("Category : BPL");
        }
        else if (yearlyIncome >= 200000 && yearlyIncome < 1000000)
        {
            System.out.println("Category : Lower Middle Class");
        }
        else if (yearlyIncome >= 1000000 && yearlyIncome < 10000000)
        {
            System.out.println("Category : Middle Class");
        }
        else if (yearlyIncome >= 10000000 && yearlyIncome < 100000000)
        {
            System.out.println("Category : Upper Class");
        }
        else
        {
            System.out.println("Category : Diamond");
        }
    }
}