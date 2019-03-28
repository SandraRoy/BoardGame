import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;

	public BoardGame()
	{
		playerPieces=new LinkedHashMap<String, GamePiece>();
		playerLocations=new LinkedHashMap<String, Location>();
	}
	public boolean addPlayer(String playerName, GamePiece gamePiece,Location initialLocation)
	{
		if(playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		
		else
		{
			playerLocations.put(playerName, initialLocation);
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
		String n=null;
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
		playerLocations.put(playerName, newLocation);
	}
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece n=GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		
		String newPlayerNames[]=new String[playerNames.length];
		
		if(n==playerPieces.get(playerNames[0]))
		{
			newPlayerNames[0]=playerNames[0];
			newPlayerNames[1]=playerNames[1];
		}
		else
		{
			newPlayerNames[0]=playerNames[1];
			newPlayerNames[1]=playerNames[0];
		}
		return newPlayerNames;
		
		
	}
	public Location getPlayersLocation(String players) 
	{
		 return playerLocations.get(players);
	}
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		
		ArrayList<String> players=new ArrayList<String>();
		for(Map.Entry<String, Location> entry: playerLocations.entrySet())
		{
			if(entry.getValue().equals(loc))
			{
				players.add(entry.getKey());
			}
		}
		return players;
	}
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
	ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
	for(Map.Entry<String, Location> entry: playerLocations.entrySet())
	{
		if(entry.getValue().equals(loc))
		{
			gamePieces.add(playerPieces.get(entry.getKey()));
		}	
	}
	return gamePieces;
	}
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	public Set<Location> getPlayerLocations()
	{
		Set<Location> set=new HashSet<>();
		for(Map.Entry<String, Location> entry: playerLocations.entrySet())
		{
			set.add(entry.getValue());
		}
		return set;
	}
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> set=new HashSet<>();
		for(Map.Entry<String, GamePiece> entry: playerPieces.entrySet())
		{
			set.add(entry.getValue());
		}
		return set;
	}

}
