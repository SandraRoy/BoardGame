import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	@Test
	public void ConstructorTest() {
		BoardGame bg=new BoardGame();
		
	}
	@Test
	public void MethodTest()
	{
		BoardGame bg=new BoardGame();
		bg.addPlayer("Shaun", GamePiece.BLUE_BOOT, Location.BALLROOM);
		Assert.assertEquals(GamePiece.BLUE_BOOT, bg.getPlayerGamePiece("Shaun"));
		
		Assert.assertEquals(false, bg.addPlayer("Sandra", GamePiece.BLUE_BOOT, Location.BALLROOM));
		Assert.assertEquals("Shaun", bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		
		bg.movePlayer("Shaun", Location.CONSERVATORY);
		Assert.assertEquals(Location.CONSERVATORY, bg.getPlayersLocation("Shaun"));
		 bg.addPlayer("Matt", GamePiece.MAGENTA_RACER, Location.HALL);
		 bg.addPlayer("Tim", GamePiece.RED_THIMBLE, Location.BILLIARD_ROOM);
		String[] pn=new String[2];
		pn[0]="Matt";
		pn[1]="Tim";
		
		Location[] loc=new Location[2];
		loc[0]=Location.HALL;
		loc[1]=Location.KITCHEN;
		
		String[] answer=new String[2];
		answer[0]="Matt";
		answer[1]="Tim";
		bg.addPlayer("hi", GamePiece.BLUE_BOOT, Location.BALLROOM);
		bg.addPlayer("bob", GamePiece.YELLOW_BOOT, Location.BILLIARD_ROOM);
		String pn1[]=new String[2];
		pn1[0]="bob";
		pn1[1]="hi";
		
		String [] answer1=new String[2];
		answer1[0]="hi";
		answer1[1]="bob";
		
		Assert.assertEquals(answer,bg.moveTwoPlayers(pn, loc));
		Assert.assertEquals(answer,bg.moveTwoPlayers(pn, loc));
		
	
		
		 ArrayList<String>players=new ArrayList<String>();
		 players.add("Tim");
		players.add("bob");
		 Assert.assertEquals(players,bg.getPlayersAtLocation(Location.BILLIARD_ROOM));
		 
		 ArrayList<GamePiece> gp=new ArrayList<GamePiece>();
		 gp.add(GamePiece.RED_THIMBLE);
		 gp.add(GamePiece.YELLOW_BOOT);
		 Assert.assertEquals(gp,bg.getGamePiecesAtLocation(Location.BILLIARD_ROOM));
		 
		 BoardGame bg1=new BoardGame();
		 bg1.addPlayer("ann", GamePiece.BLUE_BOOT, Location.BALLROOM);
		 bg1.addPlayer("deb", GamePiece.BLUE_RACER, Location.BILLIARD_ROOM);
		 bg1.addPlayer("pat", GamePiece.GREEN_BOOT, Location.CONSERVATORY);
		 
		 String [] a=new String[2];
		 a[0]="pat";
		a[1]="ann";		 
		 
		 String[] answer2=new String[2];
		 answer2[0]="ann";
		 answer2[1]="pat";
		 Assert.assertEquals(answer2,bg1.moveTwoPlayers(a, loc));
		 
		 
		 
		 // getPlayers test
		 Set<String> Players=bg1.getPlayers();
		  String[] expected=new String[]{"ann","deb","pat"};
		  for(int i=0;i<expected.length;i++)
		  {
			  Assert.assertTrue(Players.contains(expected[i]));
		  }
		  
		 Set<Location> locations=bg1.getPlayerLocations();
		 Location[] expected1=new Location[] {Location.BALLROOM, Location.BILLIARD_ROOM, Location.CONSERVATORY};
		 for(int i=0;i<expected1.length;i++)
		  {
			  Assert.assertTrue(locations.contains(expected1[i]));
		  }
		 Set<GamePiece> pieces=bg1.getPlayerPieces();
		 GamePiece[] expected2=new GamePiece[] {GamePiece.BLUE_BOOT,GamePiece.BLUE_RACER, GamePiece.GREEN_BOOT};
		 for(int i=0;i<expected2.length;i++)
		  {
			  Assert.assertTrue(pieces.contains(expected2[i]));
		  }
		 
		 
		
	}

}
