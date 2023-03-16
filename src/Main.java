import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Level 1");

        System.out.println("Enter a sequence of staples");
        String staple = scan.nextLine();

        System.out.println(Staples.sequenceCheck(staple));


        System.out.println("Level 2");

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(1);

        System.out.println(Sequence.isSymmetrical(list));

        Beating.days(7);

    }
}