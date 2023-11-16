public class Main {
    public static void main(String[] args) {
        Son1 son1 = new Son1("Emir", "Отсутствие яичка");
        Son2 son2 = new Son2("Arsen", "Адроид разработчик");
        Son3 son3 = new Son3("Maxim Lavrov", "Шеф-повар ресторана Claude Monet");


        son1.print();
        son2.print();
        son3.print();


        Printable obj2 = createObject("1й", "");
        Printable obj3 = createObject("2й", "");
        Printable obj4 = createObject("3й", "");



            }
    public static Printable createObject(String className, String name) {
        switch (className) {
            case "2й":
                return new Son1(name, "Отсутствие яичка");
            case "3й":
                return new Son2(name, "Адроид разработчик");
            case "4й":
                return new Son3(name, "Шеф-повар ресторана Claude Monet");
            default:
                throw new IllegalArgumentException(" " + className);


        }
    }
}
