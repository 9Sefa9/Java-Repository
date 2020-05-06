package core;

import core.kernel.Game;

public class Main {
    public static void main(String[] a){
        Game game = new Game();
        game.getEngine().createWindow(600, 400);
        game.init();
        game.launch();

    }
}