import java.util.Scanner;

class Music {
    String[] songs;
    Scanner s = new Scanner(System.in);

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

    Music(String[] s) {
        songs = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            songs[i] = s[i];
        }
    }

    void display() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + " : " + songs[i]);
        }
    }

    void search() {
        System.out.print("Enter number of song to search: ");
        int n = s.nextInt();
        n--;

        for (int i = 0; i < songs.length; i++) {
            if (n == i) {
                System.out.println("Song at: " + (n + 1) + " is: " + songs[i]);
                break;
            } else if (i == (songs.length - 1)) {
                System.out.println("Sorry");
            }
        }
    }

    void add() {
        System.out.print("Enter new song: ");
        String tsong = s.next();
        String[] newsong = new String[songs.length + 1];
        for (int i = 0; i < songs.length; i++) {
            if (i < songs.length) {
                newsong[i] = songs[i];
            } else if (i == songs.length) {
                newsong[i] = tsong;
            }
        }
        songs = new String[newsong.length];

        for (int i = 0; i < newsong.length; i++) {
            songs[i] = newsong[i];
        }
    }

    void delete() {
        System.out.println("\nEnter Song No. You want to delete (Starting from 1): ");
        int sindex = s.nextInt();
        sindex--;

        String[] nsong = new String[songs.length - 1];

        if (sindex > -1 && sindex < songs.length) {
            for (int i = 0; i < songs.length; i++) {
                int index = i;

                if (i == sindex) {
                    continue;
                } else if (i < sindex) {
                    nsong[i] = songs[i];
                } else if (i > sindex) {
                    nsong[i - 1] = songs[i];
                }
            }
            songs = new String[nsong.length];

            for (int i = 0; i < nsong.length; i++) {
                songs[i] = nsong[i];
            }
        } else {
            System.out.println("Wrong number");
        }
    }

    void update() {
        System.out.println("Enter Song Number, you want to update: ");
        int sindex = s.nextInt();
        sindex--;
        for (int i = 0; i < songs.length; i++) {
            if (sindex == i) {
                System.out.println("Enter New Name.: ");
                String newname = s.next();
                songs[i] = newname;
                break;
            } else if (i == (songs.length - 1)) {
                System.out.println("\nNot found");
            }
        }
    }

}

class FireAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] song = { "Dil Dil Pakistan", "Memories", "Pasoori" };
        Music m = new Music(song);
        int c = 0;

        do {
            c = m.menu();
            if (c == 1) {
                m.display();
            } else if (c == 2) {
                m.search();
            } else if (c == 3) {
                m.add();
            } else if (c == 4) {
                m.update();
            } else if (c == 5) {
                m.delete();
            } else if (c == 0) {
                continue;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("\nPress 1 to continue \n      0 to exit \n\nChoice:");
            c = sc.nextInt();
        } while (c >= 1 && c <= 4);
    }

}
