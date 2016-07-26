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
        System.out.println(n4.getSpouse());
        n3.marry(n2);
        System.out.println(n3.getSpouse());
        System.out.println(n2.getSpouse());
        n3.marry(n2);
        System.out.println(n2.getSpouse());
        System.out.println(n3.getSpouse());
        n4.marry(n1);
        System.out.println(n4.getSpouse());
        System.out.println(n1.getSpouse());
        n5.marry(n4);
        System.out.println(n5.getSpouse());
        System.out.println(n4.getSpouse());
        n1.divorce();
        System.out.println(n1.getSpouse());
    }
}
