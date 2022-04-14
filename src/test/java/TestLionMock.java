import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLionMock {

    @Mock
    Feline feline;

    @Test
    public void lionGetFood() throws Exception {
        Lion lion = new Lion("Самец");
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = feline.getFood(Mockito.anyString());
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittensReturn() throws Exception{
        Lion lion = new Lion("Самка");
        int exceptionKittens = 1;
        int actualKittens = lion.getKittens();
        Assert.assertEquals(exceptionKittens, actualKittens);
    }
}