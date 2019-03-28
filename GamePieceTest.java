import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class GamePieceTest {

	@Test
	public void test() {
		GamePiece g= GamePiece.BLUE_BOOT;
		GamePiece g1=GamePiece.GREEN_BOOT;
		GamePiece g2=GamePiece.BLUE_RACER;
		GamePiece g4=GamePiece.MAGENTA_RACER;
		GamePiece g5=GamePiece.RED_RACER;
		GamePiece g6=GamePiece.YELLOW_BOOT;
		GamePiece g7=GamePiece.RED_THIMBLE;
		
		Assert.assertEquals("Incorrect color", Color.RED, g7.getColor());
		Assert.assertEquals("Incorrect shape", Shape.BOOT, g6.getShape());
		Assert.assertEquals("Incorrect color", Color.RED, g7.getColor());
		Assert.assertEquals("Wrong player moves first", g5, GamePiece.movesFirst(g5,g2));
		Assert.assertEquals("Wrong player moves first", g, GamePiece.movesFirst(g1,g));
		Assert.assertEquals("Incorrect string", "YELLOW_BOOT: a YELLOW boot with priority 7", g6.toString());
	}

}
