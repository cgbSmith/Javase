import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        int a = 10;
        int b = 20;
        Scanner mys = new Scanner(System.in);
        hello h = new hello();
        h.buble();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        //test PR and code review


    }


}

class hello {
    String name;
    int age;

    public hello() {
    }

    public hello(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void buble(){}

}
