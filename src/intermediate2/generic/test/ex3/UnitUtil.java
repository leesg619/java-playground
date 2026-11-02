package intermediate2.generic.test.ex3;

import intermediate2.generic.test.ex3.unit.BioUnit;
import intermediate2.generic.test.ex3.unit.Marine;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T b1, T b2) {
        return b1.getHp() > b2.getHp() ? b1 : b2;
    }
}
