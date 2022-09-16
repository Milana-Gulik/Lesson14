// output only even (чётные) number
// without continue operator
public class Task05 {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 2; i < number; i+= 2) {
            System.out.print(i + " ");
        }
    }
}

