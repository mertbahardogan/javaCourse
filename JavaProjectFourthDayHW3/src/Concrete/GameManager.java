package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("New game created "+game.toString());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted "+game.toString());
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated "+game.toString());
	}

}
