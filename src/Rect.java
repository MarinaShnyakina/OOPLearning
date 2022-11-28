public class Rect {
    double width;
    double height;
    String nameOfRect;

    double getArea(){
        return width * height;
    }

    void maignify(double koeff){   // maignify - расширить, растянуть
        width *= koeff;
        height *= koeff;
    }


    @Override // Override'им значит переопределяем
    public String toString () {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect=" + nameOfRect + '\'' +
                '}';
    }

}
