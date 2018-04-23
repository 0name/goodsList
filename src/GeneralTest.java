import java.util.Scanner;

public class GeneralTest {
    public static final String ADD = "add data";
    public static final String SHOW = "show data";
    public static final String CLOSE = "close";

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        GoodsList list = new GoodsList();

        while (true){
            System.out.println("Ведите команду: ");
            String data = scaner.nextLine();
            //if (!data.isEmpty()) {
                if (data.equals(ADD)) {
                    System.out.println("Введите данные: ");
                    String data1 = scaner.nextLine();
                    list.addCard(data1);
                }
                if (data.equals(SHOW)) {
                    list.showCard();
                }
                if (data.equals(CLOSE)) {
                    System.exit(0);
                }
            //}
        }
    }
}
