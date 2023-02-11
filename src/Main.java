import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int book1 = scan.nextInt();
        int book2 = scan.nextInt();
        int book3 = scan.nextInt();
        int shelveSize = scan.nextInt();
        int space = shelveSize;
        int shelves = 1;

        if (shelveSize <= 2){
            book3 = 0;
        }
        if (shelveSize <= 1){
            book2 = 0;
        }
        if (shelveSize <= 0){
            book1 = 0;
        }
        int totalBooks = book1 + book2 + book3;

        while (totalBooks > 0){

            while (space >= 3 && book3 >= 1){
                space = space -3;
                book3--;
                totalBooks--;
            }
            while (space >= 2 && book2 >= 1){
                space = space - 2;
                book2--;
                totalBooks--;
            }
            while (space >= 1 && book1 >= 1){
                space = space - 1;
                book1--;
                totalBooks--;
            }
            if (totalBooks > 0){
                shelves++;
                space = shelveSize - space;
            }
        }
        if (shelves < 2){
            shelves = 2;
        }
        System.out.println(shelves);
    }
}
