package pakycz;
import java.math.BigDecimal;
public class SciagaLiczbowaFloat {
    float       f1 = 1.4E-4F,   f2 = 3.4E+38F;      //  32 bit
    double      d1 = 4.9E-324,  d2 = 1.79E+308;     //  64 bit

    // 2E + 2 == 2 * 10^2
    // 2E - 5 == 2 * 10^(1/5)

    // przy duzej precyzji big decimal
    BigDecimal bigDecimal = new BigDecimal(10);
}
