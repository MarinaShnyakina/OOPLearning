package constructorTest;

public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(1, 2);
        fraction.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Konin");
        System.out.println(oleg);

        Employee olga = new Employee("Svetova", "Olga", 'f', "Manager");
        // так как getFirstName находится в Person, но Employee явл наследником Person, поэтому он унаследовал его метод getFirstName
        // та как на 161 мы сделали конструктор, то теперь set нам не нужны
//        olga.setFirstName("Olga");
//        olga.setLastName("Svetova");
//        olga.setGender('f');

        System.out.println(olga);
        olga.tellMWhoAreU();

        // полиморфизм
        Person olga2 = olga;
        /*получается, что мы сложили в Person - Employee, по факту ссылка хранится на Employee, но Employee явл наследником класса Person,
        * а значит мы можем называть нашего сотрудника Person, потому что по факту это одно и то же
        * Employee - это частная реализация класса Person, поэтому в Person можно сложить Employee
         */
        // вот так мы не сможем написать Employee oleg2 = oleg;
        System.out.println(olga2);
        ((Employee) olga2).tellMWhoAreU(); // мы преобразовали Person в Employee
    }   // Employee может называться Person, потому что он наследник Person
        // это как если мы называем кота - млекопитающим, (здесь млекопитающий - это класс, а кот - это наследник этого класса)

}

    // констуктор перекладывает данные
//    public Person(String name, int age, String address, String phone) {
//        id = counter++;
//        this.name = name;
//        this.age = age;
//    }

//    public void displayName(){
//        System.out.printf("Name %s \n", name ); // printf - форматированный вывод
//// %s - это строка в форматированном выводе
//    }
//
//    void  displayAge(){
//        System.out.printf("Age %d \n, age"); // %d - это число в форматированном выводе
//    }

    /* они выводят напрямую в консоль, методы немного специфичные, они не возвращают чистые данные
     * мы не знаем какое представление данных у нас будет на экране, поэтому такие методы писать внутри объекта смысла очень мало
     * но методы выдающие данные объекта как копию данных - вполне резонные
     */

// лучше использовать вот этот
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        if (age > 0 && age < 110)
//            this.age = age;
//    }


class Fraction {
    int numerator; // это числитель
    int denominator = 1; // это знаменатель

    public Fraction(int numerator, int denominator) { // если я увижу вот такой метод, то это конструктор
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Fraction add1ToNumerator() {
        this.numerator++;
        return this;
    }

}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m - male, f - female

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(){
        this("", "", '-');
    }

    public Person(String lastName){
        this(lastName, "", '-');
    }

    public Person(String lastName, String firstName, char gender){
        this(lastName, firstName);
        this.gender = gender;
    }

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Override
    public String toString(){
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
}

}

// наследование
class Employee extends Person { // через extends - мы реализуем наследование нашего класса Person
    // тут мы не написали поля, потому что все методы уже находятся в Person
    // Employee является наследником Person
    protected String function; // function - должность

    // ниже конструктор, который реализует Person
    public Employee(String lastName, String firstName, char gender, String function) {
        super(lastName, firstName, gender); // super - означает, что мы берем конструктор родителя Person
        this.function = function;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", function='" + function + '\'' +
                '}';
    }

   // создаем метод в Employee, который что-то будет делать
    public void tellMWhoAreU(){
        System.out.println("Hello, I'm Employee, and my class " + this.getClass());
    }

}

