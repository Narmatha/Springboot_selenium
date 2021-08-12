import com.example.springboot.utils.BaseTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class AbTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String TITLE_AB_EXPECTED= "A/B Test";

    @Test
    public void shouldValidateABTest(){
        String textTitleAb = abPage.clickLinkABTesting().getTextTitleAB();
        Assert.assertTrue(textTitleAb.startsWith(TITLE_AB_EXPECTED));
        LOGGER.info("Test A/B successful");
    }
}
