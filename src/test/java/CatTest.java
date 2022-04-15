import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsCorrectValue() {
        //Arrange
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        //Act
        String actualSound = cat.getSound();
        //Assert
        Assert.assertEquals(expectedSound,actualSound);
    }
    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        //Arrange
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualFood = cat.getFood();
        //Assert
        Assert.assertEquals(expectedFood, actualFood);
    }
}