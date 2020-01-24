package Int.sort;

import java.util.Arrays;
import java.util.Collections;

public class Int {
    public static void main(String[] args) {
        Integer[] One = new Integer[10];
        for(int i =0; i < One.length; i++ ){
            One [i] = (int)(Math.random()*10);
            System.out.println(One[i] + " ");
        }
        Arrays.sort(One);
        for(int i = 0; i < One.length; i++){
            System.out.println(One[i]);
        }

        Arrays.sort(One, Collections.reverseOrder());
        for(int i = 0; i < One.length; i++){
            System.out.println(One[i]);
        }


    }


}
