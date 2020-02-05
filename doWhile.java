package pakycz;

public class doWhile {
    public static void main(String[] args) {
        String[] days = {"poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela"};

        int index = 0;
        do {
            System.out.println(days[index]);
            index++;
        } while (index < days.length);
    }
}
