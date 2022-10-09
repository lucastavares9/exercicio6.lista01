import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.print("Digite a medida do raio do circulo: ");

    double raio = sc.nextFloat();
    sc.close();
    double area = Math.PI * raio * raio;

    System.out.println("A area do circulo corresponde a : " + area);

    }
}
