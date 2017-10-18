package pkgCore;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> PlayersInTable = new ArrayList<Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		//TODO: Implement this method
	}
	public void RemovePlayerFromTable(Player p)
	{
		//TODO: Implement this method		
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		return null;
	}
}
