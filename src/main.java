import Client.CMan;

public class main {
    public static void main(String[] args) {
        CMan man = new CMan();

        man.setHeight(180);
        man.setName("Truong Khac Trieu");

        System.out.println(man.getHeight());
        System.out.println(man.getName());
        System.out.println(man.heightJugde());
    }
}
