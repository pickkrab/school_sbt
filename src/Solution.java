/**
 * Created by alexander on 24.07.16.
 */
public class Solution {
    public static void main(String[] args) {
        Person n1 = new Person(true, "kornilov");
        Person n2 = new Person(false, "kondakova");
        Person n3 = new Person(true, "Ruslan");
        Person n4 = new Person(false, "Diana");
        Person n5 = new Person(false, "Mangura");

        n4.divorce();
        n3.marry(n2);
        n3.marry(n2);
        n4.marry(n1);
        n5.marry(n4);
        n1.divorce();
        n4.divorce();
        n4.marry(n3);
        n4.check();
        n3.check();
        n5.check();
        n1.check();
    }
}
