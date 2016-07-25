/**
 * Created by alexander on 25.07.16.
 */
public class Person {
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
            return true;
        }
        else {
            return false;
        }
    }

    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println("Развод " + spouse.spouse.name + " c " + this.spouse.name);
            spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        else {
            return false;
        }
    }
}
