import java.util.Arrays;

public class Exe2 {
  public static void main(String[] args) {
    int[] jourHiver = {2, 1, 1, 0, 0, 0, -1, -1, 0, 1, 2, 4, 4, 6, 7, 8, 9, 9, 9, 7, 5, 4, 3, 2};
//    System.out.println(temperatureMax(jourHiver));
//    System.out.println(aGele(jourHiver));
//    System.out.println(temperatureMoyenne(jourHiver));
//    System.out.println(temperatureMoyenneIntervalle(jourHiver, 2, 6));
//    System.out.println(plusChaud(jourHiver, jourHiver));
//    System.out.println(deuxiemeTemperatureMax(jourHiver));
    System.out.println(intervalleMax(jourHiver, 0));
  }

  private static int temperatureMax(int[] tab) {
    Arrays.sort(tab);
    return tab[tab.length - 1];
  }

  private static boolean aGele(int[] tab) {
    boolean aGele = false;
    for (int temp : tab) {
      if (temp < 0) {
        aGele = true;
        break;
      }
    }
    return aGele;
  }

  private static double temperatureMoyenne(int[] tab) {
    double avg = 0;
    for (int temp :
        tab) {
      avg += temp;
    }
    return avg / tab.length;
  }

  private static double temperatureMoyenneIntervalle(int[] tab, int h1, int h2) {
    int[] selectedTab = Arrays.copyOfRange(tab, h1, h2 + 1);
    double avg = 0;
    for (int temp :
        selectedTab) {
      avg += temp;
    }
    return avg / selectedTab.length;
  }

  private static boolean plusChaud(int[] tab1, int[] tab2) {
    double avgTab1 = temperatureMoyenne(tab1);
    double avgTab2 = temperatureMoyenne(tab2);
    return avgTab1 > avgTab2;
  }

  private static int deuxiemeTemperatureMax(int[] tab) {
    Arrays.sort(tab);
    int tempMax = tab[tab.length - 1];
    int secondMax = tempMax;
    int i = tab.length - 1;
    while (tempMax == secondMax) {
      i--;
      secondMax = tab[i];

      if (i > tab.length - 1) {
        break;
      }
    }
    return secondMax;
  }

  private static int intervalleMax(int[] tab, int t) {
    int currentIntervalLength = 0;
    int lastIntervalLength = 0;
    boolean counting = false;
    for (int temp :
        tab) {
      if (temp == t) {
        counting = true;
        currentIntervalLength += 1;
      } else if (counting) {
        counting = false;
        if (currentIntervalLength > lastIntervalLength) {
          lastIntervalLength = currentIntervalLength;
          currentIntervalLength = 0;
        } else {
          currentIntervalLength = 0;
        }
      }
    }
    return lastIntervalLength - 1;
  }
}
