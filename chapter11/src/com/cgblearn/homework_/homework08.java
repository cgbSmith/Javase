package com.cgblearn.homework_;

/**
 * @author cgb
 * @version 1.0
 */
public class homework08 {
    public static void main(String[] args) {
        Color green = Color.YELLOW;
        green.show();
        switch (green){
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            default:
                System.out.println("没有匹配到 ");
        }
    }
}

interface MyInyterface {
    void show();
}

enum Color implements MyInyterface {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为：" + redValue + "," + greenValue + "," + blueValue);
    }
}
