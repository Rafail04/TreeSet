package Treeset;

import javax.xml.namespace.QName;
import java.util.TreeSet;

public class TreesetMethods {
    public static  void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>();
        Student st1 = new Student("Elgun",4);
        Student st2 = new Student("Rafael",1);
        Student st3 = new Student("Adil",2);
        Student st4 = new Student("Rovsen",3);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st4));
        System.out.println(treeSet.tailSet(st3));
        System.out.println(treeSet.subSet(st2, st1));
    }
}
