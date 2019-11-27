import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe2 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(composanteRouge(aPartirDe("tiger.bmp")), "red.bmp");
    BitMap.enregistreBitMap(composanteVert(aPartirDe("tiger.bmp")), "green.bmp");
    BitMap.enregistreBitMap(composanteBleu(aPartirDe("tiger.bmp")), "blue.bmp");
  }

  private static BitMap composanteRouge(BitMap img) {
    BitMap result = new BitMap(img.largeur(), img.hauteur());
    for (int i = 0; i < img.largeur(); i++) {
      for (int j = 0; j < img.hauteur(); j++) {
        result.set(j, i, Exe1.verifierPixel(new Pixel(img.get(j, i).r, 0, 0)));
      }
    }
    return result;
  }

  private static BitMap composanteVert(BitMap img) {
    BitMap result = new BitMap(img.largeur(), img.hauteur());
    for (int i = 0; i < img.largeur(); i++) {
      for (int j = 0; j < img.hauteur(); j++) {
        result.set(j, i, Exe1.verifierPixel(new Pixel(0, img.get(j, i).v, 0)));
      }
    }
    return result;
  }

  private static BitMap composanteBleu(BitMap img) {
    BitMap result = new BitMap(img.largeur(), img.hauteur());
    for (int i = 0; i < img.largeur(); i++) {
      for (int j = 0; j < img.hauteur(); j++) {
        result.set(j, i, Exe1.verifierPixel(new Pixel(0, 0, img.get(j, i).b)));
      }
    }
    return result;
  }
}
