import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTestCase {

    Addition addition=new Addition();
    @Test
    public void test()
    {
       assertEquals(true,addition.fact("AnA"));
    }
}
