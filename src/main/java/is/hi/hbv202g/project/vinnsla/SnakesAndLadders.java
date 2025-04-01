package is.hi.hbv202g.project.vinnsla;

import java.util.HashMap;

public class SnakesAndLadders {

    private final HashMap<Integer, Integer> snakesAndLadders;

    SnakesAndLadders() {
        snakesAndLadders = new HashMap<>();
        snakesAndLadders.put(5, 8);
        snakesAndLadders.put(12, 7);
        snakesAndLadders.put(23, 19);
        snakesAndLadders.put(16, 10);
        snakesAndLadders.put(7, 15);
    }

    public int newTile(Player player) {
        int tileBefore = player.getTile();
        int tileAfter = snakesAndLadders.getOrDefault(tileBefore, 0);
        if (tileAfter == 0) {
            return tileBefore;
        } else if (tileAfter > tileBefore) {
            player.setMessage(player.getName() + " fór upp stigann!");
        } else {
            player.setMessage(player.getName() + " fór niður snákinn :(");
        }
        return tileAfter;
    }

    public HashMap<Integer, Integer> getSnakesAndLadders() {
        return snakesAndLadders;
    }
}
