import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe8 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(bordure(aPartirDe("tiger.bmp"), 50), "bordure.bmp");

  }

  private static BitMap bordure(BitMap img, int n) {
    BitMap result = new BitMap(img.largeur() + n * 2, img.hauteur() + n * 2);
    for (int i = 0; i < img.hauteur() + n * 2; i++) {
      for (int j = 0; j < img.largeur() + n * 2; j++) {
        if ((i > n && i - n < img.hauteur()) && (j > n && j - n < img.largeur())) {
          result.set(i, j, img.get(i - n, j - n));
        } else {
          result.set(i, j, new Pixel(random(255), random(255), random(255)));
        }
      }
    }
    return result;
  }

  private static int random(int max) {
    return (int) (Math.random() * max + 1);
  }
}
