//
public class Main {
    int modeloAno;
    String modelNome;

    public Main(int ano, String nome) {
        this.modeloAno = ano;
        this.modelNome = nome;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1990, "Maverick");
        System.out.println(myCar.modeloAno + " " + myCar.modelNome);
    }
}