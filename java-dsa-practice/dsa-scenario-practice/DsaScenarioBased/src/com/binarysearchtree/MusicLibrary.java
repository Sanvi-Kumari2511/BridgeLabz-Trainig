package com.binarysearchtree;

public class MusicLibrary {
	SongNode root;

    //Insert new song
    SongNode insert(SongNode root, int trackId, String title) {
        if (root == null)
            return new SongNode(trackId, title);

        if (trackId < root.trackId)
            root.left = insert(root.left, trackId, title);
        
        else if (trackId > root.trackId)
            root.right = insert(root.right, trackId, title);

        return root;
    }

    //Search song by track ID
    SongNode search(SongNode root, int trackId) {
        if (root == null || root.trackId == trackId)
            return root;

        if (trackId < root.trackId)
            return search(root.left, trackId);
        
        else
            return search(root.right, trackId);
    }

    //In-order traversal (sorted playlist)
    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            
            System.out.println("Track ID: " + root.trackId +
                               ", Title: " + root.title);
            inorder(root.right);
        }
    }
}
