import java.util.Scanner;
вспомогательный класс
class JewelryItem { 
    private double weight;
    private double pricePerGram;

    public void init(double weight, double pricePerGram) {
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите вес изделия: ");
        this.weight = scan.nextDouble();
        System.out.print("Введите цену за грамм: ");
        this.pricePerGram = scan.nextDouble();
    }

    public void display() {
        System.out.println("Вес: " + weight + " г, Цена/грамм: " + pricePerGram);
    }

    public double cost() {
        return weight * pricePerGram;
    }
}

public class JewelryStore {
    private String storeName = "Центрифуга";
    private JewelryItem item1 = new JewelryItem();
    private JewelryItem item2 = new JewelryItem();
    private JewelryItem item3 = new JewelryItem();
    private double accessoryCost;
    private int count1;
    private int count2;
    private int count3;

    public void init() {
        accessoryCost = 0;
        count1 = count2 = count3 = 0;
    }

    public void read() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите данные первого изделия:");
        item1.read();
        System.out.print("Количество таких изделий: ");
        count1 = scan.nextInt();

        System.out.println("\nВведите данные второго изделия:");
        item2.read();
        System.out.print("Количество таких изделий: ");
        count2 = scan.nextInt();

        System.out.println("\nВведите данные третьего изделия:");
        item3.read();
        System.out.print("Количество таких изделий: ");
        count3 = scan.nextInt();

        System.out.print("\nВведите общую стоимость аксессуаров: ");
        accessoryCost = scan.nextDouble();
    }

    public void display() {
        System.out.println("\nМагазин: " + storeName);

        System.out.println("\nИзделие 1:");
        item1.display();
        System.out.println("Количество: " + count1);

        System.out.println("\nИзделие 2:");
        item2.display();
        System.out.println("Количество: " + count2);

        System.out.println("\nИзделие 3:");
        item3.display();
        System.out.println("Количество: " + count3);

        System.out.println("\nСтоимость аксессуаров: " + accessoryCost);
    }

    public double totalCost() {
        return item1.cost() * count1 +
                item2.cost() * count2 +
                item3.cost() * count3 +
                accessoryCost;
    }

    public double maxItemCost() {
        double c1 = item1.cost();
        double c2 = item2.cost();
        double c3 = item3.cost();
        return Math.max(c1, Math.max(c2, c3));
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Центрифугу!");

        JewelryStore store = new JewelryStore();
        store.init();
        store.read();
        store.display();

        System.out.println("\nОбщая стоимость магазина: " + store.totalCost());
        System.out.println("Самое дорогое изделие: " + store.maxItemCost());
    }
}

