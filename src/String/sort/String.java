package String.sort;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Thread.sleep;

public class String {
    public static void main(java.lang.String[] args) throws Exception {

        //String[] One = new String[5]
        sleep(1000);
        java.lang.String[] One = {"Андрей", "Сергей", "1", "Два", "Последний"};
        for (int i = 0; i < One.length; i++) System.out.println(One[i]);
        System.out.println(One.length);

        System.out.println("Начинаем сортировку ");
        sleep(2000);

        Arrays.sort(One);
        for (int i = 0; i < One.length; i++) {
            System.out.println(One[i]);
        }
        sleep(2000);

        System.out.println("Начинаем обратную сортировку");
        Arrays.sort(One, Collections.reverseOrder());
        for (int i = 0; i < One.length; i++) {
            System.out.println(One[i]);
        }
        System.out.println("Well done!");


        //System.out.println(One.length);

    }
}
