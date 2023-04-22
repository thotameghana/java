import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        char year_type;
        int feb_days;
        
        if (year % 400 == 0) {
            year_type = 'L';
        } else if (year % 100 == 0) {
            year_type = 'H';
        } else if (year % 4 == 0) {
            year_type = 'F';
        } else {
            year_type = 'N';
        }
        
        if (year_type == 'F' || year_type == 'L') {
            feb_days = 29;
        } else {
            feb_days = 28;
        }
        
        System.out.println(feb_days + " " + year_type);
    }
}
