package is.hi.hbv202g.project.vinnsla;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Player player;
    private String playerName;

    @Before
    public void createPlayer() {
        player = new Player(playerName, 24);
    }

    @Test
    public void getName() {
    }
}
