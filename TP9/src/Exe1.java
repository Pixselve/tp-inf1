import outils.Pixel;

class Exe1 {
  static Pixel verifierPixel(Pixel p) {
    if (p.r < 0) p.r = 0;
    if (p.v < 0) p.v = 0;
    if (p.b < 0) p.b = 0;
    if (p.r > 255) p.r = 255;
    if (p.v > 255) p.v = 255;
    if (p.b > 255) p.b = 255;
    return p;
  }
}
