package com.test.google.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author: pavan.g
 * created: 26/05/18.
 */
public class RobotClean {
    Direction direction = Direction.UP;

    public static void main(String[] args) {

    }

    public void cleanRoom(Robot robot) {

    }

    private enum Direction {
        UP,
        RIGHT,
        DOWN,
        LEFT;
    }

    interface Robot {
        // Returns true if the cell in front is open and robot moves into the cell.
        // Returns false if the cell in front is blocked and robot stays in the current cell.
        public boolean move();

        // Robot will stay in the same cell after calling turnLeft/turnRight.
        // Each turn will be 90 degrees.
        public void turnLeft();

        public void turnRight();

        // Clean the current cell.
        public void clean();
    }

    private static class Coordinates {
        int i;
        int j;

        Coordinates(Coordinates c, Direction currentDirection) {
            switch (currentDirection.name()) {
                case "UP":
                    this.i = c.i - 1;
                    this.j = c.j;
                    break;
                case "DOWN":
                    this.i = c.i + 1;
                    this.j = c.j;
                    break;
                case "LEFT":
                    this.i = c.i;
                    this.j = c.j - 1;
                    break;
                case "RIGHT":
                    this.i = c.i;
                    this.j = c.j + 1;
                    break;
            }
        }

        Coordinates(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Coordinates)) return false;
            Coordinates c = (Coordinates) obj;
            return c.i == i && c.j == j;
        }

        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    private static class GraphNode {
        Coordinates coordinates;
        Map<Direction, GraphNode> adjacent;

        GraphNode(GraphNode g, Direction currentDirection) {
            coordinates = new Coordinates(g.coordinates, currentDirection);
            adjacent = new HashMap<>();
            adjacent.put(currentDirection, g);
        }

        GraphNode(Coordinates coordinates) {
            this.coordinates = coordinates;
            adjacent = new HashMap<>();
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof GraphNode)) return false;
            GraphNode g = (GraphNode) obj;
            return g.coordinates == coordinates;
        }

        public int hashCode() {
            return Objects.hash(coordinates);
        }
    }

    private static class GraphNodeFactory {
        static Map<Coordinates, GraphNode> registry = new HashMap<>();

        public static GraphNode getOrCreate(GraphNode c, Direction dir) {
            Coordinates newC = new Coordinates(c.coordinates, dir);
            GraphNode g = registry.get(c);
            if (g == null) {
                g = new GraphNode(c, dir);
                registry.put(newC, g);
            }
            return g;
        }
    }
}
