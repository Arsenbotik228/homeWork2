public class Son2 extends Mom implements Printable{
    private String programist;
    public Son2(String name,String programist) {
        super(name);
        this.programist = programist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Студент гикс -> " + programist);

    }
}
