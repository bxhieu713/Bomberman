package uet.oop.bomberman.entities.bomb;

import javafx.stage.Screen;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;

public class Flame extends Entity {
    protected Board board;
    protected int direction; // phương hướng của flame
    private int radius;  // độ dài của flame
    protected int xOrigin;  // hoành độ bắt đầu của flame
    protected int yOrigin;  // tung độ bắt đầu của flame
    protected FlameSegment[] flameSegments = new FlameSegment[0];

    public Flame(int x, int y, int direction, int radius, Board board) {
        this.x = x;
        this.y = y;
        this.xOrigin = x;
        this.yOrigin = y;
        this.direction = direction;
        this.radius = radius;
        this.board = board;
        createFlameSegments();
    }

    //tạo các FlameSegment, mỗi segmentứng với 1 đơn vị độ dài
    private void createFlameSegments() {
        flameSegments = new FlameSegment[distanceFlame()];
        boolean last = false; // last đại diện cho segment cuối cùng
        for (int i = 0; i < flameSegments.length; i++) {
            last = i == flameSegments.length - 1;   // last = true khi i là phần tử cuối cùng
            switch (direction) { //hướng
                case 0:
                    y--;
                    break;
                case 1:
                    x++;
                    break;
                case 2:
                    y++;
                    break;
                case 3:
                    x--;
                    break;
            }
            flameSegments[i] =new FlameSegment(x , y,direction, last);
        }
    }

//tính toán độ dài của flame
    private int distanceFlame() {
        int r = 0;
//        int x = (int)x;
//        int y = (int)y;
        while(r < radius) {
            if(direction == 0) y--; //trên
            if(direction == 1) x++; // phải
            if(direction == 2) y++; // dưới
            if(direction == 3) x--; //trái

            Entity a = board.getEntity(x, y, null); // board

            if(a instanceof Bomb) ++r; //nếu là bomb sẽ phát nổ

            if(a.collide(this) == false) //khi gặp Brick hoặc Wall flame sẽ dừng lại
                break;
            ++r;
        }
        return r;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Screen screen) {
        for (int i = 0; i < flameSegments.length; i++) {
            flameSegments[i].render(screen);
        }

    }

    @Override
    public boolean collide(Entity e) {
//        if(e instanceof Bomber) ((Bomber) e).kill();
//        if(e instanceof Enemy) ((Enemy) e).kill();
        return true;
    }
}
