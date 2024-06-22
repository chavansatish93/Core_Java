class Example {
    int x, y;

    void fun1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void fun2() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Example1 extends Example {
    int x1,y1;

    void fun3(int x, int y) {
        super.x = x;  // super keyword is used here to access the parent class's instance variables
        super.y = y;
    }

    void fun4(int x, int y) {
        System.out.println(super.x); // this will call the parent class's instance variables
        System.out.println(super.y);
    }
}

class SupKey {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.fun3(88, 99);
        e1.fun4(8,9);
    }
}
