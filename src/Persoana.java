import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persoana {

    private int ID;
    private String nume;
    private char initialaTata;
    private short anNastere;
    private String email;
    private String limbajProgramare;
    private List<String> listFromCvs;
    private String[] listaPentruPrint = {"Id = ","nume = ", "initiala tatalui = ", "anul nasterii = ", "email = ", "limbajProgramare = "};

    public Persoana(String cvs){
        listFromCvs = new ArrayList<String>(Arrays.asList(cvs.split(",")));
        ID = Integer.parseInt(listFromCvs.get(0));
        nume = listFromCvs.get(1);
        initialaTata = listFromCvs.get(2).charAt(0);
        anNastere = Short.parseShort(listFromCvs.get(3));
        email = listFromCvs.get(4);
        limbajProgramare = listFromCvs.get(5);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getNume() {
        return nume;
    }

    public char getInitialaTata() {
        return initialaTata;
    }

    public short getAnNastere() {
        return anNastere;
    }

    public String getLimbajProgramare() {
        return limbajProgramare;
    }

    public void setLimbajProgramare(String limbajProgramare) {
        this.limbajProgramare = limbajProgramare;
    }

    public void printIndex(int index){
        System.out.println(listaPentruPrint[index-1] + listFromCvs.get(index-1));
    }

    public void printID(){
        System.out.println(ID);
    }
    public void printName(){
        System.out.println(nume);
    }
    public void printInitialaTata(){
        System.out.println(initialaTata);
    }
    public void printAnulNasterii(){
        System.out.println(anNastere);
    }
    public void printEmail(){
        System.out.println(email);
    }
    public void printLimbajProgramare(){
        System.out.println(limbajProgramare);
    }

    @Override
    public String toString() {
        return "ID = " + ID + ", nume = " + nume + ", initiala tatalui = " + initialaTata + ", anul nasterii = " + anNastere + ", email = " + email + ", limbaj de programare = " + limbajProgramare;
    }


}
