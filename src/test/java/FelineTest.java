import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyReturnsCorrectValue(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(actualFamily, expectedFamily);
    }

    @Test
    public void getKittensReturnsCorrectCount(){
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(actualKittensCount, expectedKittensCount);
    }

    @Test
    public void eatMeatReturnsFood() throws Exception{
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(actual, expected);
    }
}