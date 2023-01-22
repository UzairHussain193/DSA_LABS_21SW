import java.util.Scanner;
//<<<DSA Task>>> 
class Music {
    
    String song;
    Music nextSong;
    
    
    Scanner s = new Scanner(System.in);
     
    public Music (String song){
        this.song=song;
    }


    int menu() {
        System.out.println("\n\tWelcome to Fire Air Music Player");
        System.out.println("\n\t\tOperations: ");
        System.out.println("1. Display all songs");
        System.out.println("2. Search a song");
        System.out.println("3. Add a new song");
        System.out.println("4. Update a song");
        System.out.println("5. Delete a song");
        System.out.println("0: Exit");
        System.out.print("\nEnter Your Choice: ");
        int Ch = s.nextInt();
        return Ch;
    }
     
    
    void display() {    
        for(Music temp=this;temp!=null;temp=temp.nextSong){
            System.out.println("=> "+temp.song);
        }       
    }

    int total() {
        int total_songs=0;
        for(Music temp=this;temp!=null;temp=temp.nextSong){
            total_songs++;
        }
        return total_songs;
    }

    

    public Music add(String song,int pos){
      
        Music temp=this;
        Music temp1=this;
        Music data_node=new Music(song);

        if(pos==1){
            data_node.nextSong=temp;                
            return data_node;
        }

        if(pos-1<=total() && pos>0){

            
            
         
           int counter=2; 
            for(temp=temp1;temp!=null;temp=temp.nextSong){
              if(counter<pos){
                counter++;
              }
              else if(counter==pos){
                 break;
              }
                
            }
            data_node.nextSong=temp.nextSong; 
            temp.nextSong=data_node;
            
        
            temp=temp1;

            return temp;

        }
    
        
        System.out.println("position is invalid ");
        return temp;
      }

    int search(String songname) {
        
        
        Music tempMusic=this;
        Music tempMusic1=this;
         
        int counter=0;
        for(tempMusic=tempMusic1;tempMusic!=null;tempMusic=tempMusic.nextSong){
             
            counter++;
            if(tempMusic.song.equalsIgnoreCase(songname))
            {
               System.out.println("The song is present ");
               
                      return counter;
            }

        }
        System.out.println("The song is not present");
        return -1;
        
    }

    

    

    Music delete(String songname) {
        Music tempMusic=this;
       
       

        if(tempMusic.song.equalsIgnoreCase(songname)){
            System.out.println("The song is deleted successfully");
            return tempMusic.nextSong;
        }
         
        
        for(Music temp=tempMusic.nextSong;temp!=null;temp=temp.nextSong){
             if(temp.song.equalsIgnoreCase(songname))
            {
                if(temp.nextSong==null){
                    tempMusic.nextSong=null;
                    System.out.println("The song is deleted successfully");
                    return this;
                }

                tempMusic.nextSong=temp.nextSong; 
                System.out.println("The song is deleted successfully");   

            }


          tempMusic=tempMusic.nextSong;
        }

        return this;
                
    }

    void update(String songname,String newname) {
        
        Music tempMusic=this;
        Music tempMusic1=this;
        
         
        
        for(tempMusic=tempMusic1;tempMusic!=null;tempMusic=tempMusic.nextSong){
    
            if(tempMusic.song.equalsIgnoreCase(songname))
            {
                    tempMusic.song=newname;
                    System.out.println("The song is updated successfully");
                    return;

            }

        }
            System.out.println("The song is not updated ");
    }

}

class Task1_FireAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String[] song = { "Dil Dil Pakistan", "Memories", "Pasoori","hello" };
               
        Music musicList=new Music(song[0]);
        Music temp=musicList;

        for(int i=1;i<song.length;i++){
            temp.nextSong=new Music(song[i]);
            temp=temp.nextSong;
        }

        int c = 0;

        do {
            c = musicList.menu();
            
            switch(c){
                case 1:{
                    musicList.display();
                    break;
                } 
                case 2:{
                    System.out.print("Enter song name to search : ");
                    sc.nextLine();
                    String n=sc.nextLine();
                    musicList.search(n);
                    break;
                }    
                case 3:{
                    System.out.print("Enter the song name : ");
                    sc.nextLine();
                    String m=sc.nextLine();
                    System.out.print("Enter position : ");
                    int pos=sc.nextInt();
                    musicList=musicList.add(m,pos);
                    break;
                }
                case 4:{
                    System.out.print("Enter name of song to update : ");
                    sc.nextLine();
                    String mi=sc.nextLine();
                    System.out.print("Enter new name of song : ");
                    String  e=sc.nextLine();
                    musicList.update(mi,e);
                    break;
                }
                case 5:{
                    System.out.print("Enter name of song to delete : ");
                    String so=sc.nextLine();
                    musicList.delete(so);
                    break;
                }
                case 0:{
                    continue;                      
                }
                default:{
                    System.out.println("The number is incorrect ");
                }

            }

            System.out.print("\nPress:\n1 to continue \n0 to exit \n\nChoice:");
            c = sc.nextInt();
        } while (c >= 1 && c <= 4);
    }

}