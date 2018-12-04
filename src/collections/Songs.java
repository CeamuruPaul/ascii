package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Songs {
    public static void main(String[] args) {
        TreeSet<Song> songs = new TreeSet<>();

        try {
            BufferedReader reader= new BufferedReader(new FileReader("src/collections/songs.txt"));

            String song;
            while((song = reader.readLine()) != null ){
                 String title;
                 String artist;

                 title = song.substring(0,song.indexOf('/'));
                 artist = song.substring(song.indexOf('/') + 1);

                 Song songObject = new Song(title,artist);
                 songs.add(songObject);


            }reader.close();

        }

        catch (Exception e) {
            e.printStackTrace();
        }



           for ( Song song : songs){
        System.out.println(song);}
    }
}
