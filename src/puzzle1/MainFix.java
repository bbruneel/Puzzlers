/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle1;

/**
 *
 * @author bbruneel
 */
public class MainFix {

    static boolean yesOrNo(String s) {
        s = s.toLowerCase();
        if (s.equals("yes") || s.equals("y") || s.equals("t"))
            s = "true";
        return Boolean.parseBoolean(s);
    }


    public static void main(String[] args) {
        System.out.println(yesOrNo("true") + " " + yesOrNo("YeS"));
    }

}
