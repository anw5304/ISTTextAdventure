import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author az060_001
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetPersonInfo() {
        System.out.println("getPersonInfo");
        String name = "Arthur Zhang";
        String gender = "Male";
        boolean isPlayer = true;
        Room location = new Room("IST",210);
        Person instance = new Person(name, gender, location);
        String expResult = "Name: Arthur Zhang, Gender: Male, Is Player: true, Location: IST 210";
        String result = instance.getPersonInfo();
        assertEquals(expResult, result);
    }
}