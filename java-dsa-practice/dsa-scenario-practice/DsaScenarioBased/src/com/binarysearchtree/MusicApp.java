package com.binarysearchtree;

public class MusicApp {
	public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();

        //Inserting songs
        library.root = library.insert(library.root, 60, "Believer");
        library.insert(library.root, 40, "Alone");
        library.insert(library.root, 80, "Closer");
        library.insert(library.root, 30, "Attention");
        library.insert(library.root, 50, "Blinding Lights");

        //Searching song
        SongNode song = library.search(library.root, 80);
        
        if (song != null)
            System.out.println("Found Song: " + song.title);
        else
            System.out.println("Song not found");

        //Displaying playlist
        System.out.println("\nPlaylist (Sorted by Track ID):");
        library.inorder(library.root);
    }
}
