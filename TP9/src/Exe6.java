import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe6 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(posteriser(aPartirDe("tiger.bmp"), 100), "posteriser.bmp");


  }

  private static BitMap posteriser(BitMap img, int n) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int r = img.get(i, j).r;
        int v = img.get(i, j).v;
        int b = img.get(i, j).b;
        int r1 = arrondi(r, n);
        int v1 = arrondi(v, n);
        int b1 = arrondi(b, n);

        img.set(i, j, Exe1.verifierPixel(Exe1.verifierPixel(new Pixel(r1, v1, b1))));
      }
    }
    return img;
  }
  private static int arrondi(int i, int n) {
    int borneInf = (i / n) * n;
    int borneSup = (i / n + 1) * n;
    return i - borneInf > borneSup - i ? borneSup : borneInf;
  }

}
