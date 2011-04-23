/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle1;

public class Main {
    static boolean yesOrNo(String s) {
        s = s.toLowerCase();
        if (s.equals("yes") || s.equals("y") || s.equals("t"))
        s = "true";
        return Boolean.getBoolean(s);
    }


    public static void main(String[] args) {
        System.out.println(yesOrNo("true") + " " + yesOrNo("YeS"));
    }
}
