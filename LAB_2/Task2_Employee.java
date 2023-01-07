class Task2_Employee{
    char firstName;
    String lastName;
    int monthlySalary;

    public void setDetails(char firstName,String lastName,int monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
        if(monthlySalary<0){
            monthlySalary=0;
        }
    }
    public void showDetails(){
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Monthly Salary: "+monthlySalary);
    }
    public int YearlySalary(){
        return (monthlySalary*12);
    }
    public double increasedSalary(){
        double inc=(0.1)*monthlySalary;
        monthlySalary+=inc;

        return (monthlySalary*12);
    }

    public static void main(String[] args) {
        Task2_Employee e1= new Task2_Employee();
        Task2_Employee e2= new Task2_Employee();
        e1.setDetails('U', "zair", 2500);
        e2.setDetails('A', "bbas",3200);

        System.out.println("Yearly Salary for e1 is : "+e1.YearlySalary());
        System.out.println("Yearly Salary for e2 is : "+e2.YearlySalary());

        System.out.println("Salary of e1 after increment is: "+e1.increasedSalary());
        System.out.println("Salary of e2 after increment is: "+e2.increasedSalary());



    }
}