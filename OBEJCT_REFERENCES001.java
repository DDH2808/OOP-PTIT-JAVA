import java.util.Scanner;

class Song {
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object c) {
        if(c instanceof Song){
            Song otherSong = (Song) c;
            if(this.name.equals(otherSong.name) && this.author.equals(otherSong.author) && this.duration == otherSong.duration){
                return true;
            }
            else return false;
        }
        return false;
    }
}

public class OBEJCT_REFERENCES001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for( int i = 0; i < n; i++ ){
            String line1 = sc.nextLine();
            String[] s1 = line1.split(" ");
            Song song1 = new Song(s1[0], s1[1], Integer.parseInt(s1[2]));

            String line2 = sc.nextLine();
            String[] s2 = line2.split(" ");
            Song song2 = new Song(s2[0], s2[1], Integer.parseInt(s2[2]));

            System.out.println(song1.equals(song2));
        }
        sc.close();
    }
}

