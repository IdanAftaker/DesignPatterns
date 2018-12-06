package Template;

import java.util.Arrays;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 * Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
 * This pattern comes under behavior pattern category
 */
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
