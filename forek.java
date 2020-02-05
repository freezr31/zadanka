package pakycz;

public class forek {
    public static void main(String[] args) {
        String[] days = {"poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela"};
        for (int index = 0; index < days.length; index++){
            System.out.println(days[index]);
        }
    }
}
/*foreach
for (String day : days) {
     System.out.println(day);
}*/

/* string v = "a";
switch (v) {
    case "a":
    case "b":
    case "c":
        break;
}
 */
