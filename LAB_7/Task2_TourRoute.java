

class Task2_TourRoute{
    static class Node{     //Node Class
        String Location;
        Node next;
    
        Node(String L){     //Node class Constructor
            Location=L;
        }
    }
    public static void main(String[] args) {

        //Routes Array
        String[] R1={"Thandi Sarak", "Wadhu Wah", "Abdullah Mall Rd", "Hyderabad Bypass", "Jamshoro", "Mehran University Campus Rd"};
        String[] R2={"Dr. Ziauddin Rd", "CMH Rd", "NH5/AH2", "Hyderabad Bypass", "Jamshoro", "Mehran University Campus Rd"};
        
        //Estimated Distance and Time Taken(in mins) for both routes
        float
        Estimated_Distance2=16.3f,
        Estimated_Distance1=14.8f,
        Estimated_Mins1=28,
        Estimated_Mins2=32;

        //Node Objects
        Node Route1=new Node(R1[0]);
        Node Route2=new Node(R2[0]);

        //Insertion in Route1
        Node t=Route1;
        for(int i=1;i<R1.length;i++){
            t.next=new Node(R1[i]);
            t=t.next;
        }

        //Insertion in Route2
        t=Route2;
        for(int i=1;i<R2.length;i++){
            t.next=new Node(R2[i]);
            t=t.next;
        }

        //Displaying Route1
        System.out.println("\nRoute No.1 \t Estimated Distance: " + Estimated_Distance1 + " Km \t Estimated Time: " + Estimated_Mins1 + " mins\n");
        for(Node n=Route1;n!=null;n=n.next){
            if(n.next==null){
                System.out.println(n.Location);
                System.out.println("Arrived at Destination\n");
                break;
            }
            System.out.print(n.Location + " -> ");
        }

        //Displaying Route2
        System.out.println("\nRoute No.2 \t Estimated Distance: " + Estimated_Distance2 + " Km \t Estimated Time: " + Estimated_Mins2 + " mins\n");
        for(Node n=Route2;n!=null;n=n.next){
            if(n.next==null){
                System.out.println(n.Location);
                System.out.println("Arrived at Destination\n");
                break;
            }
            System.out.print(n.Location + " -> ");
        }
        
        //Displaying fastest route
        if(Estimated_Mins1>Estimated_Mins2){
            System.out.println("\nThe Fastest Route is Route No. 1");
        }
        else if(Estimated_Mins2>Estimated_Mins1){
            System.out.println("\nThe Fastest Route is Route No. 2\n");
        }
    }
}