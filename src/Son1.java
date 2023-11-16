public class Son1 extends Mom implements Printable{
    private String disability;
    public Son1(String name,String disability) {
        super(name);
        this.disability = disability;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Инвалид 3 группы -> " + disability);
    }
}

