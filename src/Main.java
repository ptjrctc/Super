import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What do you want to buy?");

        System.out.println(" 1.ไข่เจียวธรรมดา\n 2.ไข่เจียว+ชะอม\n 3.ไข่เจียว+มะเขือเทศ\n 4.ไข่รวมมิตร\n 5.คิดเงิน");

        for (int menuNumber = scanner.nextInt(); menuNumber !=5;) {
            if (menuNumber == 1) {
                menu1 = menu1 + 1;
            } else if (menuNumber == 2) {
                menu2 = menu2 + 1;
            } else if (menuNumber == 3) {
                menu3 = menu3 + 1;
            } else if (menuNumber == 4) {
                menu4 = menu4 + 1;
            }
            System.out.println(" 1.ไข่เจียวธรรมดา\n 2.ไข่เจียว+ชะอม\n 3.ไข่เจียว+มะเขือเทศ\n 4.ไข่รวมมิตร\n 5.คิดเงิน");
            menuNumber = scanner.nextInt();
        }
        System.out.println("ไข่เจียวธรรมดา จำนวน " + menu1);
        System.out.println("ไข่เจียว+ชะอม จำนวน " + menu2);
        System.out.println("ไข่เจียว+มะเขือเทศ จำนวน " + menu3);
        System.out.println("ไข่รวมมิตร จำนวน " + menu4);
    }//1
}