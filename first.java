import java.util.Scanner;

public class Massive {
     int[] first_massive = new int[6];
     int[] two_massive = new int[6];




    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 целых чисел");
        for (int i = 0; i < first_massive.length; i++) {
            while (true) {
                System.out.print("Элемент " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    first_massive[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Вы допустили ошибку в воде целого числа, повторите попытку");
                    scanner.next();
                }
            }
        }
    }

     boolean shouldSwap(int a, int b) {
        if (a < 0 && b < 0) return a > b;
        if (a >= 0 && b < 0) return true;
        if (a > 0 && b == 0) return true;
        if (a > 0 && b > 0) return a < b;
        return false;
    }

    public void sort() {
        System.arraycopy(first_massive, 0, two_massive, 0, first_massive.length);

        for (int i = 0; i < two_massive.length - 1; i++) { 
            for (int j = 0; j < two_massive.length - 1 - i; j++) {
                if (shouldSwap(two_massive[j], two_massive[j + 1])) {
                    int place = two_massive[j]; 
                    two_massive[j] = two_massive[j + 1]; 
                    two_massive[j + 1] = place;
                }
            }
        }
    }

    public void display() {
        System.out.print("Исходный массив: [");
        for (int num : first_massive) {
            System.out.print(num + " ");
        }
        System.out.print("]");

        System.out.print("\nОтсортированный массив: [");
        for (int num : two_massive) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Massive sorter = new Massive();
        sorter.read();
        sorter.sort();
        sorter.display();
    }
}
