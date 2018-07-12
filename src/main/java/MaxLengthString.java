import java.util.LinkedList;
import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Please enter a string");
        String inputString = scanner.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            if (list.size() > 1 && inputString.charAt(i) <= list.getLast() && list.contains(inputString.charAt(i))) {
                list.clear();

            }
            list.add(inputString.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();


    }

}
