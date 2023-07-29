package avlyakulov.timur.simulation.objects.animals;

import avlyakulov.timur.simulation.entity.Entity;
import avlyakulov.timur.simulation.entity.Point;

import java.util.Map;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;

    public abstract void makeMove(Map<Point, Entity> gameMap, Point point);
}