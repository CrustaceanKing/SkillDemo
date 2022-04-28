import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class SkillDemoTest {
    private SkillDemo bruh;

    @Before
    public void setUp() {
       bruh = new SkillDemo();
    }

    @Test
	public void addition() {
		assertEquals(5, 3+2);
	}

    @Test
    public void add(){
        assertEquals(5, bruh.addI(5));
    }



}
