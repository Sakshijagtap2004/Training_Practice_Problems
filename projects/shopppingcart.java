import java.util.*;

class Shop {
    ArrayList<Integer> itemno = new ArrayList<>();
    ArrayList<String> itemname = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addItem() {
        System.out.println("Enter item no");
        itemno.add(sc.nextInt());
        System.out.println("Enter item name");
        itemname.add(sc.next());
        System.out.println("Enter price");
        price.add(sc.nextInt());
    }

    public void showInfo() {
        System.out.println("-------------------Showing items-----------------");
        for (int i = 0; i < itemno.size(); i++) {
            System.out.println(itemno.get(i) + "\t" + itemname.get(i) + "\t" + price.get(i));
        }
    }

    public void delete() {
        System.out.println("Which itemno you want to delete");
        int r = sc.nextInt();
        for (int i = 0; i < itemno.size(); i++) {
            if (r == itemno.get(i)) {
                itemno.remove(i);
                itemname.remove(i);
                price.remove(i);
            }
        }
    }

    public void update() {
        System.out.println("Which itemno you want to update");
        int q = sc.nextInt();
        for (int i = 0; i < itemno.size(); i++) {
            if (q == itemno.get(i)) {
                System.out.println("Enter new item no");
                itemno.set(i, sc.nextInt());
                System.out.println("Enter new item name");
                itemname.set(i, sc.next());
                System.out.println("Enter new price");
                price.set(i, sc.nextInt());
            }
        }
    }

    public void orderMenu() {
        System.out.println("-------------------Order Menu-----------------");
        for (int i = 0; i < itemno.size(); i++) {
            System.out.println(itemno.get(i) + "\t" + itemname.get(i) + "\t" + price.get(i));
        }
        System.out.println("Which itemno you want to order? Select the number");
        int d = sc.nextInt();
        for (int i = 0; i < itemno.size(); i++) {
            if (d == itemno.get(i)) {
                System.out.println(itemno.get(i) + "\t" + itemname.get(i) + "\t" + price.get(i));
                System.out.println("Order is placed");
            }
        }
    }
}

class Java {
    public static void main(String[] args) {
        Shop s = new Shop();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Item 2. Show Info 3. Delete 4. Update 5. Order Menu 6. Exit ");
            System.out.println("Enter your choice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    s.addItem();
                    break;
                case 2:
                    s.showInfo();
                    break;
                case 3:
                    s.delete();
                    break;
                case 4:
                    s.update();
                    break;
                case 5:
                    s.orderMenu();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
