import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocation;

	public BoardGame()
	{
		playerPieces=new LinkedHashMap<String, GamePiece>();
		playerLocation=new LinkedHashMap<String, Location>();
	}
	public boolean addPlayer(String playerName, GamePiece gamePiece,Location initialLocation)
	{
		if(playerPieces.containsValue(playerName))
		{
			return false;
		}
		else
		{
			playerLocation.put(playerName, initialLocation);
			playerPieces.put(playerName, gamePiece);

			return true;
		}
	}
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		String n="";
		for(Map.Entry<String, GamePiece> entry: playerPieces.entrySet())
		{

			if(entry.getValue().equals(gamePiece))
			{
				n=entry.getKey();
			}
		}
		return n;	
	}
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocation.put(playerName, newLocation);
	}
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece n=GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		String newPlayerNames[]=new String[playerNames.length];
		
		
	}
	public Location getPlayersLocation(String players) 
	{
		 return playerLocation.get(players);
	}
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		
	}

}
