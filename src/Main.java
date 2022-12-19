import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameA = new ArrayList<>();
        System.out.println("Введите  имя");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();
        String[] names = {name1, name2, name3, name4, name5};
        for (int i = 0; i < names.length; i++) {
            nameA.add(names[i]);
            System.out.println(nameA) ;

        }

        ArrayList<String> nameB = new ArrayList<>();
        System.out.println("Введите имя");
        String name6 = scanner.nextLine();
        String name7 = scanner.nextLine();
        String name8 = scanner.nextLine();
        String name9 = scanner.nextLine();
        String name10 = scanner.nextLine();
        String[] names1 = {name6, name7, name8, name9, name10};
        for (int i = 0; i < names1.length; i++) {
           nameB.add(names1[i]);
            System.out.println(nameB);
        }
       
        ArrayList<String> nameC = new ArrayList<>();
        nameC.add(0, name1);
        nameC.add(1, name10);
        nameC.add(2, name2);
        nameC.add(3, name9);
        nameC.add(4, name3);
        nameC.add(5, name8);
        nameC.add(6, name4);
        nameC.add(7, name7);
        nameC.add(8, name5);
        nameC.add(9, name6);

        System.out.println(nameC);
        nameC.sort(Comparator.comparing(String::length));
        System.out.println(nameC);
    }
}