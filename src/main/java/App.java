import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(90);
        intList.add(22);
        intList.add(7);

        for (int i=0; i<10; i++) {
            System.out.println("\n Iteration " +i);
            if (intList.size() >= 4) {
                System.out.println("Delete number " + intList.get(0) + " with index [0]");
                intList.remove(0);
            } else {
                System.out.println("No need to delete number, just add new number");
                intList.add(5);
            }
            for (int n : intList) {
                System.out.println(n);
            }
        }
    }
}
