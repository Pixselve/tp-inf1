import outils.BitMap;
import outils.Pixel;

import static outils.BitMap.aPartirDe;

public class Exe7 {
  public static void main(String[] args) {
    BitMap.enregistreBitMap(flou(aPartirDe("tiger.bmp")), "flou.bmp");

  }

  private static BitMap flou(BitMap img) {
    for (int i = 0; i < img.hauteur(); i++) {
      for (int j = 0; j < img.largeur(); j++) {
        img.set(i, j, moyennePixelsAdjacents(img, i, j));
      }
    }
    return img;
  }


  private static Pixel moyennePixelsAdjacents(BitMap img, int i, int j) {
    int resultR = img.get(i, j).r;
    int resultG = img.get(i, j).v;
    int resultB = img.get(i, j).b;
    int count = 1;

    if (i - 1 < img.hauteur() && i - 1 >= 0) {
      if (j - 1 < img.largeur() && j - 1 >= 0) {
        resultR += img.get(i - 1, j - 1).r;
        resultG += img.get(i - 1, j - 1).v;
        resultB += img.get(i - 1, j - 1).b;
        count++;
      }
      if (j < img.largeur() && j >= 0) {
        resultR += img.get(i - 1, j).r;
        resultG += img.get(i - 1, j).v;
        resultB += img.get(i - 1, j).b;
        count++;
      }
      if (j + 1 < img.largeur() && j + 1 >= 0) {
        resultR += img.get(i - 1, j + 1).r;
        resultG += img.get(i - 1, j + 1).v;
        resultB += img.get(i - 1, j + 1).b;
        count++;
      }
    }
    if (i < img.hauteur() && i >= 0) {
      if (j - 1 < img.largeur() && j - 1 >= 0) {
        resultR += img.get(i, j - 1).r;
        resultG += img.get(i, j - 1).v;
        resultB += img.get(i, j - 1).b;
        count++;
      }
      if (j < img.largeur() && j >= 0) {
        resultR += img.get(i, j).r;
        resultG += img.get(i, j).v;
        resultB += img.get(i, j).b;
        count++;
      }
      if (j + 1 < img.largeur() && j + 1 >= 0) {
        resultR += img.get(i, j + 1).r;
        resultG += img.get(i, j + 1).v;
        resultB += img.get(i, j + 1).b;
        count++;
      }
    }
    if (i + 1 < img.hauteur() && i - 1 >= 0) {
      if (j - 1 < img.largeur() && j - 1 >= 0) {
        resultR += img.get(i + 1, j - 1).r;
        resultG += img.get(i + 1, j - 1).v;
        resultB += img.get(i + 1, j - 1).b;
        count++;
      }
      if (j < img.largeur() && j >= 0) {
        resultR += img.get(i + 1, j).r;
        resultG += img.get(i + 1, j).v;
        resultB += img.get(i + 1, j).b;
        count++;
      }
      if (j + 1 < img.largeur() && j + 1 >= 0) {
        resultR += img.get(i + 1, j + 1).r;
        resultG += img.get(i + 1, j + 1).v;
        resultB += img.get(i + 1, j + 1).b;
        count++;
      }
    }
    return Exe1.verifierPixel(new Pixel(resultR / count, resultG / count, resultB / count));
  }

}
