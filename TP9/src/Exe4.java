import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe4 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(bruit(aPartirDe("tiger.bmp"), 50), "bruit.bmp");
  }

  static BitMap bruit(BitMap img, int m) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int r = img.get(i, j).r;
        int g = img.get(i, j).v;
        int b = img.get(i, j).b;
        img.set(i, j, Exe1.verifierPixel(new Pixel(r + random(m), g + random(m), b + random(m))));
      }
    }
    return img;
  }

  private static int random(int max) {
    return (int) (Math.random() * max);
  }
}
