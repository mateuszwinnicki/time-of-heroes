package pl.mateuszwinnicki.toh.map;

public class Position {

    private Integer x;
    private Integer y;

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case EAST:  x++;
                        break;
            case WEST:  x--;
                        break;
            case NORTH: y++;
                        break;
            case SOUTH: y--;
                        break;
        }
    }
}
