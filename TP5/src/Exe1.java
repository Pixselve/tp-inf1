public class Exe1 {
  public static void main(String[] args) {
    System.out.println(joursEntreDates(19, 5, 2015, 19, 5, 2050));
  }

  private static boolean anneeBissextile(int annee) {
    return annee % 400 == 0 || annee % 4 == 0 && annee % 100 != 0;
  }

  private static int jourDansMois(int mois, int annee) {
    if (mois == 2) {
      if (anneeBissextile(annee)) {
        return 29;
      } else {
        return 28;
      }
    } else {
      if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
        return 31;
      } else {
        return 30;
      }
    }

  }

  private static boolean dateValide(int jour, int mois, int annee) {
    if (mois > 12 || mois <= 0 || annee <= 0) {
      return false;
    } else {
      return jour <= jourDansMois(mois, annee);
    }
  }

  private static int joursEntreDates(int jour1, int mois1, int annee1, int jour2, int mois2, int annee2) {
    int days = 0;
    for (int i = annee1; i < annee2; i++) {
      days += daysInAYear(i);
    }
    days -= daysBetweenJanuaryAndDate(jour1, mois1, annee1);
    days += daysBetweenJanuaryAndDate(jour2, mois2, annee2);

    return days;
  }

  private static int daysBetweenJanuaryAndDate(int jour1, int mois1, int annee1) {
    int days = 0;
    for (int i = mois1; i <= 12; i++) {
      days += jourDansMois(i, annee1);
    }
    days -= jour1;
    return days;
  }

  private static int daysInAYear(int annee1) {
    if (anneeBissextile(annee1)) {
      return 366;
    } else {
      return 365;
    }
  }

}
