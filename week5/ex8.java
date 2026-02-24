package week5;


public class ex8 {
public static void main(String[] args) {
    Person human = new Person();
    Person human2 = new Person();

    human.setFirstName("Rick");
    human.setLastName("Sanches");

    human2.setFirstName("Rick");
    human2.setLastName("Sanches");

    System.out.println(human.equals(human2));
    Teacher teacher = new Teacher();
    teacher.setFirstName("Doctor");
    teacher.setLastName("Who");
    System.out.println(teacher.toString());
}

}