package pkgCore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import pkgException.DeckException;

public class GamePlayBlackJack extends GamePlay {

	
	public GamePlayBlackJack(pkgEnum.eGameType eGameType, HashMap<UUID, Player> hmTablePlayers) {
		super(eGameType, hmTablePlayers);		
		Iterator it = hmTablePlayers.entrySet().iterator();		
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();			
			Player p = (Player)pair.getValue();
			Hand h = new HandBlackJack();			
			this.putHandToGame(p, h);			
		}
	}

	@Override
	protected Card Draw(Player p) throws DeckException {
		
		Hand h = this.gethmGameHand(p);		
		Card c = h.Draw(this.getdGameDeck());		
		this.putHandToGame(p, h);		
		return c;
	}

}
