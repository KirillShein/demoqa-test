import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SimpleJUnitTest {
    int result;

    @BeforeEach
    void beforeEach() {
        System.out.println("###   beforeEach");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###   afterEach()");
        result = 0;
    }


    @Test
    void firstTest() {
        System.out.println("### firstTes()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("### secondTes()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("### thirdTes()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }

}
