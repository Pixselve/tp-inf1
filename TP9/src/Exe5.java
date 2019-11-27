import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe5 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(filtreMonochrome(aPartirDe("tiger.bmp")), "b&w.bmp");
    BitMap.enregistreBitMap(filtreGris(aPartirDe("tiger.bmp")), "b&w2.bmp");
    BitMap.enregistreBitMap(filtreGrisV2(aPartirDe("tiger.bmp")), "b&w3.bmp");
    BitMap.enregistreBitMap(filtreSepia(aPartirDe("tiger.bmp")), "filtreSepia.bmp");
  }

  private static BitMap filtreMonochrome(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int mean = (img.get(i, j).r + img.get(i, j).v + img.get(i, j).b) / 3;
        img.set(i, j, mean < 128 ? new Pixel(0, 0, 0) : new Pixel(255, 255, 255));
      }
    }
    return img;
  }

  //  Version la plus réaliste
  private static BitMap filtreGris(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int mean = (img.get(i, j).r + img.get(i, j).v + img.get(i, j).b) / 3;
        img.set(i, j, Exe1.verifierPixel(new Pixel(mean, mean, mean)));
      }
    }
    return img;
  }

  private static BitMap filtreGrisV2(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int color = (int) (0.2125 * (img.get(i, j).r + 0.7154 * img.get(i, j).v + 0.0721 * img.get(i, j).b));
        img.set(i, j, Exe1.verifierPixel(new Pixel(color, color, color)));
      }
    }
    return img;
  }

  private static BitMap filtreSepia(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        int r = img.get(i, j).r;
        int v = img.get(i, j).v;
        int b = img.get(i, j).b;
        int r1 = (int) (0.393 * r + 0.769 * v + 0.189 * b);
        int v1 = (int) (0.349 * r + 0.686 * v + 0.168 * b);
        int b1 = (int) (0.272 * r + 0.534 * v + 0.131 * b);
        img.set(i, j, Exe1.verifierPixel(Exe1.verifierPixel(new Pixel(r1, v1, b1))));
      }
    }
    return img;
  }
}
