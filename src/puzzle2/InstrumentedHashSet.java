/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author bbruneel
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;
    
    @Override public boolean add(E e) {
        addCount++; return super.add(e);
    }
    
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size(); return super.addAll(c);
    }
    
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Accordion", "Banjo", "Kazoo"));
        System.out.println(s.addCount);
    }

}
