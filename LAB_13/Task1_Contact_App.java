import java.util.Scanner;

class Task1_Contact_App{
    String[][] Contacts;
    long[] no;
    String[] name;
    Scanner s=new Scanner(System.in);

    Task1_Contact_App(long[] a1, String[] a2){
        no=new long[a1.length];
        name=new String[a2.length];
        for(int i=0; i<a1.length;i++){
            no[i]=a1[i];
            name[i]=a2[i];
        }
    }

    Task1_Contact_App(String[][] C){
        Contacts=new String[C.length][C[0].length];
        for(int i=0; i<C.length; i++){
            Contacts[i][0]=C[i][0];
            Contacts[i][1]=C[i][1];
        }
    }

    int menu(){
        System.out.println("\nOperations: ");
        System.out.println("1. Display all contacts");
        System.out.println("2. Search a contact");
        System.out.println("3. Add a new contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Choice=s.nextInt();

        return Choice;
    }

    void Display(){
        System.out.println("\nName: \tNumber:");
        for(int i=0;i<Contacts.length;i++){
            System.out.println(Contacts[i][0]+" \t"+ Contacts[i][1]);
        }
    }

    void Search(){
        System.out.println("\nEnter Name You want to Search:");
        String SearchName=s.next();
        for(int i=0;i<Contacts.length;i++){
            if(SearchName.equalsIgnoreCase(Contacts[i][0])){
                System.out.println("Name: " + Contacts[i][0] + "\tNumber: " + Contacts[i][1]);
                break;
            }
            else if(i==(Contacts.length-1)){
                System.out.println("\nNot found");
            }
        }
    }

    void Add(){
        System.out.println("\nEnter New Name You want to add: ");
        String NewName=s.next();

        System.out.println("\nEnter Number: ");
        String NewNumber= s.next();

        System.out.print("Enter Index No. (0-" +Contacts.length + "): ");
        int index=s.nextInt();

        if(index<=Contacts.length && index>=0){

            String[][] temp=new String[Contacts.length+1][Contacts[0].length];

            for(int i=0;i<temp.length;i++){
                if(i==index){
                    temp[i][0]=NewName;
                    temp[i][1]=NewNumber;
                }
                else if(i<index){
                    temp[i][0]=Contacts[i][0];
                    temp[i][1]=Contacts[i][1];
                }
                else if(i>index){
                    temp[i][0]=Contacts[i-1][0];
                    temp[i][1]=Contacts[i-1][1];
                }
            }

            Contacts=new String[temp.length][temp[0].length];

            for(int x=0;x<temp.length;x++){
                Contacts[x][0]=temp[x][0];
                Contacts[x][1]=temp[x][1];
            }

            System.out.println("Number Added Succesfully");
        }
        else{
            System.out.println("\nNot found");
        }
    }

    void Update(){
        System.out.println("\nEnter Name You want to update: ");
        String TempName=s.next();
        for(int i=0;i<Contacts.length;i++){
            if(TempName.equalsIgnoreCase(Contacts[i][0])){
                System.out.println("Enter New Name: ");
                String NewName=s.next();
                Contacts[i][0]=NewName;
                System.out.println("Name Updated Successfully");
                break;
            }
            else if(i==(Contacts.length-1)){
                System.out.println("\nNot found");
            }
        }
    }

    void delete(){
        System.out.println("Enter No. You want to delete: ");
        String tempno=s.next();
        for(int i=0;i<Contacts.length;i++){
            
            if(tempno.equalsIgnoreCase(Contacts[i][1])){
                
                int index=i;

                String[][] Temp=new String[Contacts.length-1][Contacts[0].length];

                for(int x=0;x<Contacts.length;x++){
                    if(x==index){
                        continue;
                    }
                    else if(x<index){
                        Temp[x][0]=Contacts[x][0];
                        Temp[x][1]=Contacts[x][1];
                    }
                    else if(x>index){
                        Temp[x][0]=Contacts[x-1][0];
                        Temp[x][1]=Contacts[x-1][1];
                    }
                }

                Contacts=new String[Temp.length][Temp[0].length];

                for(int x=0;x<Contacts.length;x++){
                    Contacts[x][0]=Temp[x][0];
                    Contacts[x][1]=Temp[x][1];
                }

                System.out.println("Number Deleted Succesfully");
                break;
            }
            else if(i==(Contacts.length-1)){
                System.out.println("\nNot found");
            }
        }
    }
}
