import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[][] Contacts= {{"a","1"}, {"b","2"}, {"c","3"}, {"d","4"}};

        Task1_Contact_App c=new Task1_Contact_App(Contacts);
        int Choice=0;

        do{
            Choice=c.menu();
            switch(Choice){
                case 1: c.Display(); break;
                case 2: c.Search(); break;
                case 3: c.Add(); break;
                case 4: c.Update(); break;
                case 5: c.delete(); break;
                case 0: Choice=0; break;
                default: System.out.println("\nInvalid Choice");
            }
            if(Choice==0){
                break;
            }
            System.out.print("\nPress any no. to continue \n      or 0 to exit \n\nChoice:");
            Choice=s.nextInt();
        }while(Choice!=0);
    }
    
}
