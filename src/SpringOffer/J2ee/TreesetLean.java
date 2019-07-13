package SpringOffer.J2ee;

import java.util.TreeSet;

/**
 * Created by Amie on 2019/1/21.
 */
public class TreesetLean {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三", 23));
        ts.add(new Person("李四", 13));
        ts.add(new Person("周七", 13));
        ts.add(new Person("王五", 43));
        ts.add(new Person("赵六", 33));
        System.out.println(ts);
    }
}


class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int num = this.name.compareTo(o.name);
        return num == 0 ? this.age - o.age: num;
    }
}