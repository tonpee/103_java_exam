package exam.main;

import exam.base.ToBeEnum;
import exam.base.ToBeLambda;
import exam.base.ToCompare;
import exam.base.ToIterate;

import java.util.Arrays;

public class MainExam {

    // replace 999 with the last three digits of your student id.
    // replace YOUR_STUDENT_ID with your "student id inside a quote".
    private static final ToCompare[] cmps = { new ToCompare(045, "66130500045"),
        new ToCompare(-7, "Seven"), new ToCompare(-2, "Two"),
        new ToCompare(-9, "Nine"), new ToCompare(-3, "Three") };
    
    // replace YOUR_FIRSTNAME with your firstname.
    // replace YOUR_LASTNAME with your lastname.
    private static final ToBeLambda[] lds = {
        new ToBeLambda("Theerakan", "Choochat"),
        new ToBeLambda("Steve","Johnson"),
        new ToBeLambda("Joseph","Aliba"), 
        new ToBeLambda("Alice","Smith")
    };

    public static void main(String[] args) {
//        exam01ToBeEnum(); // 10 points
//        exam02ToCompare(); // 30 points
//        exam03ToIterate(); // 20 points
        exam04Lambda(); // 20 points
//        exam05Stream(); // 20 points
    }

    private static void exam01ToBeEnum() {
        System.out.println("EXAM01: ===============");

        /* EXAM01: change ToBeEnum class to ToBeEnum enum that consists of
        the following enum values: FRESHMAN, SOPHOMORE, JUNIOR, SENIOR */
        ToBeEnum FRESHMAN = ToBeEnum.FRESHMAN;
        ToBeEnum SOPHOMORE = ToBeEnum.SOPHOMORE;
        ToBeEnum JUNIOR = ToBeEnum.JUNIOR;
        ToBeEnum SENIOR = ToBeEnum.SENIOR;

        System.out.println("  " + FRESHMAN
                + " : " + FRESHMAN.getName()
                + " (" + FRESHMAN.getYear() + ")");

        System.out.println("  " + SOPHOMORE
                + " : " + SOPHOMORE.getName()
                + " (" + SOPHOMORE.getYear() + ")");

        System.out.println("  " + JUNIOR
                + " : " + JUNIOR.getName()
                + " (" + JUNIOR.getYear() + ")");

        System.out.println("  " + SENIOR
                + " : " + SENIOR.getName()
                + " (" + SENIOR.getYear() + ")");
    }

    private static void exam02ToCompare() {
        System.out.println("EXAM02: ===============");

        /* EXAM02.1: change ToCompare class to implement Comparable interface
        so that it can compare two ToCompare objects by their names. */

        /* EXAM02.2: implement compareByValue in the ToCompare class
        so that it can compare two ToCompare objects by thier values. */

        System.out.print("  Unsorted");
        for (ToCompare cmp : cmps) System.out.print(" : " + cmp);
        System.out.println();

        /* EXAM02.3: call Arrays.sort() method so that it sorts 
        the cmps array by the name of ToCompare objects */
        Arrays.sort(cmps);
        System.out.print("  Sort by Name");
        for (ToCompare cmp : cmps) System.out.print(" : " + cmp);
        System.out.println();

        /* EXAM02.4: call Arrays.sort() method and provide a comparator
        so that it sorts the cmps array by the values of ToCompare objects */
        Arrays.sort(cmps, ToCompare::compareByValue);
        System.out.print("  Sort by Value");
        for (ToCompare cmp : cmps) System.out.print(" : " + cmp);
        System.out.println();
    }

    private static void exam03ToIterate() {
        System.out.println("EXAM03: ===============");

        /* EXAM03.1: change ToIterate<T> class to implement Iterable interface. */

        ToIterate<ToCompare> dataSet = ToIterate.of(cmps);

        /* EXAM03.2: use ToIterate's iterator to print all elements in the dataSet out. */

        var v = dataSet.iterator();
        while (v.hasNext()) {
            System.out.println(v.next());
        }
    }

    private static void exam04Lambda() {
        System.out.println("EXAM04: ===============");

        /* EXAM04.1: write a lambda expression for ToBeLambda.byFirstname. */
        
        System.out.print("  Unsorted");
        for (ToBeLambda ld : lds) System.out.print(" : " + ld);
        System.out.println();
        
        /* EXAM04.2: call Arrays.sort() method and provide a comparator
        so that it sorts the lds array by the firstname */
        //Arrays.sort(...);
        System.out.print("  Sorted by Firstname");
        for (ToBeLambda ld : lds) System.out.print(" : " + ld);
        System.out.println();

        /* EXAM04.3: call Arrays.sort() method and provide a comparator
        so that it sorts the lds array by the firstname in a reverse order */
        //Arrays.sort(...);
        System.out.print("  Sorted by Firstname in a reverse order");
        for (ToBeLambda ld : lds) System.out.print(" : " + ld);
        System.out.println();
    }

    private static void exam05Stream() {
        System.out.println("EXAM05: ===============");

        /* EXAM05.1: use a stream to print all objects in the cmps array out. */
        System.out.println("exam05.1 ----------");
        //Arrays.stream(cmps)...

        /* EXAM05.2: use a stream to select only the objects in the lds array 
        that the firstname ends with "e". print the result out. */
        System.out.println("exam05.2 ----------");
        //Arrays.stream(lds)....
        
    }
}
