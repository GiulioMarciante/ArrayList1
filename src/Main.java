
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

////Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
////In questa classe avere i metodi pubblici per ottenere le informazioni.
////Creare un ArrayList con n elementi e stamparlo in console.
////Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Giulio",27);
        Student student2 = new Student("Erik",22);
        Student student3 = new Student("Gigi",30);
        Student student4 = new Student("Luca",25);
        Student student5 = new Student("Barbara",29);
        Student student6 = new Student("Amanda",27);
        Student student7 = new Student("Pierluigi",26);
        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3));
        System.out.println(students);

        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        System.out.println(students);
    }
}