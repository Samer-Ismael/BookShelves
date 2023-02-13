import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int book1 = scan.nextInt();
        int book2 = scan.nextInt();
        int book3 = scan.nextInt();
        int shelveSize = scan.nextInt();
        int space = shelveSize * 2;
        int shelves = 2;

        int totalBooks = book1 + book2 + book3;

        int space1 = space / 2;
        int space2 = space / 2;

        if (shelveSize <= 2){
            book3 = 0;
        }
        if (shelveSize <= 1){
            book2 = 0;
        }
        if (shelveSize <= 0){
            book1 = 0;
        }
        while (totalBooks > 0){

            while (space1 >= 3 && book3 >= 1){
                space1 = space1 -3;
                book3--;
                totalBooks--;
            }
            while (space1 >= 2 && book2 >= 1){
                space1 = space1 - 2;
                book2--;
                totalBooks--;
            }
            while (space1 >= 1 && book1 >= 1){
                space1 = space1 - 1;
                book1--;
                totalBooks--;
            }
            while (space2 >= 3 && book3 >= 1){
                space2 = space2 -3;
                book3--;
                totalBooks--;
            }
            while (space2 >= 2 && book2 >= 1){
                space2 = space2 - 2;
                book2--;
                totalBooks--;
            }
            while (space2 >= 1 && book1 >= 1){
                space2 = space2 - 1;
                book1--;
                totalBooks--;
            }
            if (totalBooks > 0){
                shelves ++;
                space1 = shelveSize - space1;
            }
        }
        System.out.println(shelves);
    }
}