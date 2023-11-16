public class Son3 extends Mom implements Printable{
    private String Kitchiner;
    public Son3(String name,String kitchiner) {
        super(name);
        this.Kitchiner = kitchiner;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Огузок -> " + Kitchiner);

    }
}
