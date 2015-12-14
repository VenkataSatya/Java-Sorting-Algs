/**
 * Created by Venkata on 8/13/2015.
 */

/*
http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
http://www.javamadesoeasy.com/2015/05/collection-top-50-interview-questions.html

 */

import java.util.HashMap;
import java.util.Map.Entry;


class Dog {
    String color;

    Dog(String c) {
        color = c;
    }

    public boolean equals(Object o) {

        System.out.println("Executed No of times");
        return ((Dog) o).color.equals(this.color);

    }

    public int hashCode() {
        System.out.println("Hashcode is generated");
        return color.length();
    }

    public String toString(){
        return color + " dog";
    }
}

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");
        Dog d5 = new Dog("Brown");
        Dog d6 = new Dog("Blue");

        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);
        hashMap.put(d5, 25);
        hashMap.put(d6, 30);

        //print size
        System.out.println(hashMap.size());

        //loop HashMap
        for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}

