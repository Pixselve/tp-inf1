import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe3 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(inverser(aPartirDe("tiger.bmp")), "inverse.bmp");
  }

  private static BitMap inverser(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int r = img.get(i, j).r;
        int g = img.get(i, j).v;
        int b = img.get(i, j).b;
        img.set(i, j, Exe1.verifierPixel(new Pixel(255 - r, 255 - g, 255 - b)));
      }
    }
    return img;
  }
}
