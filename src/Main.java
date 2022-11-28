public class Main {

    public static void main(String[] args) {
        // write your code here
        Rect rect = new Rect(); // объявление переменной класса Rect
        rect.height = 10;
        rect.width = 15;
        rect.nameOfRect = "I'm rect";

        Rect rect1 = new Rect();
        rect1.height = 5;
        rect1.width = 25;
        rect1.nameOfRect = "I'm rect1";


        Rect rect2 = new Rect(); // объявление переменной класса Rect
        rect2.height = 1;
        rect2.width = 2;
        rect2.nameOfRect = "I'm rect2";


//        System.out.println(rect == rect1);
//        System.out.println(rect1);
//        rect1 = rect; // тут мы присвоили и ссылаемся теперь на другое значение
//        System.out.println(rect == rect1);
//        System.out.println(rect1);

//        System.out.println(rect.getArea());
//        System.out.println(rect1.getArea());
//        System.out.println(rect2.getArea());
//
//        rect2.maignify( 1.5);
//        System.out.println(rect2.getArea());


//        Point point1 = new Point();
//        Point point2 = new Point();
//
//        point1.input();
//        System.out.println(point1);
//
//        point2.input();
//        System.out.println(point2);
//
//        System.out.println(point1.getDistance(point2));
//
//        System.out.println("Start moving the point1");
//        point1.move( 100, 120);
//        System.out.println(point1);
//        System.out.println(point1.getDistance(point2));

        // Классы оболочки примитивных типов

        Double number = Double.valueOf(10.0);
        double numberCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer integer = Integer.parseInt(a);
        int c = integer; // автораспаковка, автоанбоксинг по-англ
        integer = c; // автоупаковка

    }
}

