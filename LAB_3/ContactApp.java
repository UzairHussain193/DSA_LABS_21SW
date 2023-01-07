
// Task#01: The contact app on our phone contains a lot of contacts. 
// In ContactApp(class) perform the following operations:
// 
// 1.	Display all contact
// 2.	Search a contact 
// 3.	Add a new contact
// 4.	Update the contact 
// 5.	Delete any contact

import java.util.Scanner;

class Methods {
    long[] num;
    String[] name;
    Scanner s = new Scanner(System.in);

    int options() {
        System.out.println("\tWelcome to XYZ Contact App\n\n");
        System.out.println("\nOperations: ");
        System.out.println("1. Display all contacts");
        System.out.println("2. Search a contact");
        System.out.println("3. Add a new contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Ch = s.nextInt();
        return Ch;
    }

    Methods(String[] n, long[] p) {
        num = new long[p.length];
        name = new String[n.length];

        for (int i = 0; i < p.length; i++) {
            num[i] = p[i];
            name[i] = n[i];
        }
    }

    void display() {
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name: " + name[i] + "\tPhone:  " + num[i]);
        }
    }

    void search() {
        System.out.print("Enter name for search: ");
        String sn = s.next();

        for (int i = 0; i < name.length; i++) {
            if (sn.equals(name[i])) {
                System.out.println("At index: " + i + ",  Name: " + name[i] + " , Phone: " + num[i]);
                break;
            } else if (i == (name.length - 1)) {
                System.out.println("Sorry");
            }
        }
    }

    void addnew() {
        String[] newname = new String[num.length + 1];
        long[] newphone = new long[name.length + 1];

        System.out.print("Enter new name: ");
        String tname = s.next();
        System.out.print("Enter number: ");
        long tnum = s.nextLong();

        for (int i = 0; i < name.length; i++) {
            if (i < name.length) {
                newname[i] = name[i];
                newphone[i] = num[i];
            } else if (i == name.length) {
                newname[i] = tname;
                newphone[i] = tnum;
            }
        }
        num = new long[newphone.length];
        name = new String[newname.length];

        for (int i = 0; i < newname.length; i++) {
            name[i] = newname[i];
            num[i] = newphone[i];
        }
    }

    void Update() {
        System.out.println("Enter name you want to update: ");
        String temp = s.next();
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(temp)) {
                System.out.print("Enter new name: ");
                String nname = s.next();
                System.out.println("Enter phone number: ");
                long np = s.nextLong();
                name[i] = nname;
                num[i] = np;
                break;
            } else if (i == (name.length - 1)) {
                System.out.println("Not found!");
            }
        }
    }

    void delete() {
        System.out.println("Enter Name you want to delete: ");
        String tmpname = s.next();
        for (int i = 0; i < num.length; i++) {
            if (tmpname.equals(name[i])) {
                int index = i;
                long[] tempnum = new long[num.length - 1];
                String[] tempname = new String[name.length - 1];

                for (int x = 0; x < num.length; x++) {
                    if (x == index) {
                        continue;
                    } else if (x < index) {
                        tempnum[x] = num[x];
                        tempname[x] = name[x];
                    } else if (x > index) {
                        tempnum[x - 1] = num[x];
                        tempname[x - 1] = name[x];
                    }
                }

                num = new long[tempnum.length];
                name = new String[tempname.length];

                for (int x = 0; x < tempnum.length; x++) {
                    num[x] = tempnum[x];
                    name[x] = tempname[x];
                }
                break;
            }
        }
    }
}

public class ContactApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long[] number = { 21, 37, 44, 56, 65 };
        String[] names = { "Lahad", "Razi", "Uzair", "Abbas", "Shariq" };
        Methods m = new Methods(names, number);
        int c = 0;

        do {
            c = m.options();
            if (c == 1) {
                m.display();
            } else if (c == 2) {
                m.search();
            } else if (c == 3) {
                m.addnew();
            } else if (c == 4) {
                m.Update();
            } else if (c == 5) {
                m.delete();
            } else if (c == 0) {
                continue;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("\nPress 1 to continue \n      0 to exit \n\nChoice:");
            c = sc.nextInt();
        } while (c >= 1 && c <= 5);
    }
}