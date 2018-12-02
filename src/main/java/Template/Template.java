package Template;

import java.util.Arrays;

public class Template {
    public static void main(String[] args) {
        int []array = {42, 41, 45, 59, 21, 13};
        AbstractSort sd = new SortDown();
        sd.sort(array);
        System.out.println(Arrays.toString(array));

        AbstractSort su = new SortUp();
        su.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
