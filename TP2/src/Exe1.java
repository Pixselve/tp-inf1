public class Exe1 {
  public static void main(String[] args) {
    double x = 0;
    for (int i = 0; i < 10; i++) {
      x += 0.1;
    }
    System.out.println(x);
    // Le résultat est 0.9999999 alors qu'il devrait être 1. Cela est dû à une erreur d'arrondis des nombres à virgules en Informatique.
  }
}
