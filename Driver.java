
public class Driver {
	public static void main(String[] args)
	{
		
	
	BoardGame bg=new BoardGame();
	bg.addPlayer("tim",GamePiece.RED_THIMBLE, Location.BALLROOM);
	bg.addPlayer("anna", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
	
	System.out.println(bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));

}
}
