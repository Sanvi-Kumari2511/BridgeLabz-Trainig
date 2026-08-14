package Day_11;

import java.util.Arrays;
import java.util.List;

public class DesignerPdfViewer_03 {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int heightMax = 0;
        for(int i=0; i<word.length(); i++){
            int index=word.charAt(i)-'a';
            int  height=h.get(index);

            if(height>heightMax){
                heightMax=height;
            }
        }
        return heightMax*word.length();

    }

    public static void main(String[] args) {
        List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5,
                5, 5, 1, 1, 5, 5, 1, 5, 2, 5,
                5, 5, 5, 5, 5, 5);

        String word="abc";
        System.out.println(designerPdfViewer(h, word));
    }
}
