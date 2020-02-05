package pakycz;

public class petlaWhile {
    public static void main(String[] args){
        String[] days = {"poniedziałek" , "wtorek" , "środa" , "czwartek" , "piątek" , "sobota" , "niedziela"};

        int index = 0;
        while (index < days.length) {
            System.out.println(days[index]);
            index++;
        }
    }
}
