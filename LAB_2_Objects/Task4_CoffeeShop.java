import java.util.Scanner;

class Task4_CoffeShop{
    double coffeePrice=5.50;
    double small_p=0.60,medium_p=1.00,large_p=1.80;
    int small_c=5,medium_c=10,large_c=20;
    int bags_order;
    int small=1,medium=1,large=2;
    double Total_Cost=0;

    Task4_CoffeShop(int numberbags){
        bags_order=numberbags;
    }

    public void Total_Cost(){
        Total_Cost=(((large*large_p)+(medium*medium_p)+(small*small_p))+(bags_order*coffeePrice));
        System.out.println("Total Cost will be: "+ Total_Cost);        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of coffee bags: ");
        int num=s.nextInt();
        Task4_CoffeShop c=new Task4_CoffeShop(num);
        c.Total_Cost();
    }

}
