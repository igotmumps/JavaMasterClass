class Main {
  public static void main(String[] args) {
    printDayOfWeek(0);
    printDayOfWeek(1);
    printDayOfWeek(2);
    printDayOfWeek(3);
    printDayOfWeek(4);
    printDayOfWeek(5);
    printDayOfWeek(6);
    printDayOfWeek(7);

    printNumberInWord(0);
    printNumberInWord(1);
    printNumberInWord(2);
    printNumberInWord(3);
    printNumberInWord(4);
    printNumberInWord(5);
    printNumberInWord(6);
    printNumberInWord(7);
    printNumberInWord(8);
    printNumberInWord(9);

    System.out.println("Days in Jan: " + getDaysInMonth(1, 2023));
    System.out.println("Days in Feb: " + getDaysInMonth(2, 2023));
    System.out.println("Days in Mar: " + getDaysInMonth(3, 2023));
    System.out.println("Days in Apr: " + getDaysInMonth(4, 2023));
    System.out.println("Days in May: " + getDaysInMonth(5, 2023));
    System.out.println("Days in Jun: " + getDaysInMonth(6, 2023));
    System.out.println("Days in Jul: " + getDaysInMonth(7, 2023));
    System.out.println("Days in Aug: " + getDaysInMonth(8, 2023));
    System.out.println("Days in Sept: " + getDaysInMonth(9, 2023));
    System.out.println("Days in Oct: " + getDaysInMonth(10, 2023));
    System.out.println("Days in Nov: " + getDaysInMonth(11, 2023));
    System.out.println("Days in Dec: " + getDaysInMonth(12,2023));
  }

  public static void printDayOfWeek(int day) {
    String dayOfWeek = switch (day) {
      case 0 ->  "sunday";
      case 1 -> "monday";
      case 2 -> "tuesday";
      case 3 -> "wednesday";
      case 4 -> "thursday";
      case 5 -> "friday";
      case 6 -> "saturday";
      default -> "invalid day";
    };
    System.out.println("The day of the week is: " + dayOfWeek);
  }

     // write your code here
    public static void printNumberInWord(int number) {
        String word = switch(number) {
          case 0 -> "ZERO";
          case 1 -> "ONE";
          case 2 -> "TWO";
          case 3 -> "THREE";
          case 4 -> "FOUR";
          case 5 -> "FIVE";
          case 6 -> "SIX";
          case 7 -> "SEVEN";
          case 8 -> "EIGHT";
          case 9 -> "NINE";
          default -> "other";
        };
        
        System.out.println(word);
    }

      public static boolean isLeapYear(int year) {
        if (year<1 || year>9999) return false;
        else if (year%4==0 && year%100!=0) return true;
        else if (year%400==0) return true;
        return false;
    }
    
    public static int getDaysInMonth(int month, int year) {
        
        if (month<1 || month>12) return -1;
        if (year<1 || year>9999) return -1;
        int daysInMonth = switch (month) {
            case 1 -> 31;
            case 2 -> { if (isLeapYear(year)==true) yield 29; 
                        else yield 28; 
                      }
            case 3 -> 30;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 31;
            case 12 -> 31;
            default -> -1;
        };
        return daysInMonth;
    }
}