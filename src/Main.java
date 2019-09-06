public class Main {

    public static void main(String[] args) {
        String cvs = "1,Ana,V,1994,ana@mail.com,Java";
        Persoana pers1 = new Persoana(cvs);
        System.out.println(pers1);
        pers1.printIndex(2);
        pers1.printAnulNasterii();
        pers1.printIndex(4);
        pers1.printID();
    }

}
