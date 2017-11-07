package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import pkgEnum.eGameType;
import pkgException.DeckException;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID, Player> hmGamePlayers = new HashMap<UUID, Player>();
	private HashMap<UUID, Hand> hmGameHands = new HashMap<UUID, Hand>();
	private Player pDealer = new Player("Dealer", 0);
	private Deck dGameDeck;

	public GamePlay(eGameType eGameType, HashMap<UUID, Player> hmTablePlayers) {
		super();
		this.eGameType = eGameType;
		
		Iterator it = hmTablePlayers.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			Player p = (Player) pair.getValue();			
			// TODO: Add this player to the game's player HashMap
		}

		switch (eGameType) {
		case BLACKJACK:
			//TODO: Build the deck based on Blackjack game
			break;
		case POKER:
			//TODO: Build the deck based on Poker game.
			break;
		}
	}

	private void AddPlayersToGame(ArrayList<Player> Players) {
		// TODO: Implement this method
	}

	protected void RemovePlayerFromGame(Player p) {
		// TODO: Implement this method
	}

	protected Player GetPlayerInGame(Player p) {
		// TODO: Implement this method
		return null;
	}

	public eGameType geteGameType() {
		return eGameType;
	}

	public HashMap<UUID, Player> getHmGamePlayers() {
		return hmGamePlayers;
	}

	
	private HashMap<UUID, Hand> getHmGameHands() {
		return hmGameHands;
	}
	
	protected Hand gethmGameHand(Player p)
	{
		return (Hand)this.hmGameHands.get(p.getPlayerID());
	}

	public void setHmGameHands(HashMap<UUID, Hand> hmGameHands) {
		this.hmGameHands = hmGameHands;
	}
	
	protected void putHandToGame(Player p, Hand h)
	{
		this.hmGameHands.put(p.getPlayerID(),h);
	}
	

	public Player getpDealer() {
		return pDealer;
	}

	
	public Deck getdGameDeck() {
		return dGameDeck;
	}

	protected abstract Card Draw(Player p) throws DeckException ;

}
