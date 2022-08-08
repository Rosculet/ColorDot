public class ColorDot {

    /*
    Сеттеры не стал реализовывать т.к. было влом прописывать условие в каждом сеттере да и другие виды конструкторов тоже по этой причине,
    имеется реализация через конструктор со всеми атрибутами так что пожалуйста.
    Можно и без сеттеров прожить, всё вводим через конструктор. Да я ленивый.
    */

    private String color;
    private int x;
    private int y;

    public ColorDot(String color, int x, int y) {
        if (color.equals("red"))
            this.color = color;
        else if (color.equals("green"))
            this.color = color;
        else if (color.equals("blue"))
            this.color = color;
        else {
            throw new RuntimeException("Wrong color");
        }

        if(x<0 || x>255)
            throw new RuntimeException("Wrong X coordinates");
        else this.x = x;

        if(y<0 || y>255)
            throw new RuntimeException("Wrong Y coordinates");
        else this.y = y;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return  getColor() + " " + getX() + " " + getY();
    }
}
