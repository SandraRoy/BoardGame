import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void test() {
		GamePieceAppearance g=new GamePieceAppearance(Color.BLUE, Shape.BOOT);
		Assert.assertEquals("Incorrect color", Color.BLUE, g.getColor());
		Assert.assertEquals("Incorrect Shape",Shape.BOOT, g.getShape());
	}

}
