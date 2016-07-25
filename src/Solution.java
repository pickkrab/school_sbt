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
        n1.spouse = n2;
        n2.spouse = n1;
        n3.spouse = n5;
        n4.spouse = null;
        n5.spouse = n3;

        n3.marry(n2);
        n3.marry(n2);
        n4.marry(n1);
        n5.marry(n4);
    }
    public static class Person {
        private final boolean man;
        private final String name;
        private Person spouse;

        public Person(boolean man, String name) {
            this.man = man;
            this.name = name;
        }

        public boolean marry(Person person) {
            if (person.man != man) {
                if (person.spouse != null) {
                    person.divorce();
                }
                if (spouse != null) {
                    spouse.divorce();
                }
                person.spouse = this;
                this.spouse = person;
                System.out.println("Свадьба " + person.spouse.name + " c " + this.spouse.name);
            }
            return person.man != man ? true : false;
        }

        public boolean divorce() {
            System.out.println("Развод " + spouse.spouse.name + " c " + this.spouse.name);
            spouse.spouse = null;
            this.spouse = null;

            return true;
        }
    }
}
