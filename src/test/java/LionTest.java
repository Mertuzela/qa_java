import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTest {
    private final String mane;
    private final boolean expected;


    public LionTest (String mane, boolean expected) {
        this.mane = mane;
        this.expected = expected;
    }
    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getSexLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test() // проверка возвращаемого значения
    public void checkHaveMane() throws Exception {
        Lion lion = new Lion(mane);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected,actual);
    }
}