public class Module5 {

    // 5.1
    public static String listNums(int x) {
        String nums = "";
        for (int i = 0; i <= x; i++) {
            nums += i + " ";
        }
        return nums;
    }

    //5.2
    public static String reverseListNums(int x) {
        String nums = "";
        for (int i = x; i >= 0; i--) {
            nums += i + " ";
        }
        return nums;
    }

    //5.3
    public static String chet(int x) {
        String nums = "";
        for (int i = 0; i <= x; i += 2) {
            nums += i + " ";
        }
        return nums;
    }

    //5.4
    public static int pow(int x, int y) {
        if (y == 0) return 1;

        int pow = 1;
        for (int i = 0; i < y; i++) {
            pow *= x;
        }

        return pow;
    }

    //5.5
    public static int numLen(long x) {
        int numLen = 0;

        do {
            numLen++;
            x /= 10;
        } while (x != 0);

        return numLen;
    }

    //5.6
    public static boolean equalNum(int x) {
        int baseNum = x % 10;

        while (x != 0) {
            if (x % 10 != baseNum) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    //5.7
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    //5.8
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            if (i != x - 1) {
                System.out.println();
            }
        }
    }

    //5.9
    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    //5.10
    public static void guessGame() {
        int randomNum = 3;
        int attempsNum = 1;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("What number am I thinking (0 to 9)? : ");
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                attempsNum++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Number of attempts: " + attempsNum);
                break;
            }
        }
    }

    //5.11
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    //5.12
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    //5.13
    public static int maxAbs(int[] arr) {
        int maxAbs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbs)) {
                maxAbs = arr[i];
            }
        }

        return maxAbs;
    }

    //5.14
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        return count;
    }

    //5.15
    public static boolean palindrom(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i == j) {
                return true;
            }
            if (!(arr[i] == arr[j])) {
                return false;
            } else {
                j--;
            }
        }

        return true;
    }

    //5.16
    public static void reverse(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i == j) {
                break;
            }

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            j--;
        }
    }

    //5.17
    public static int[] reverseBack(int[] arr) {
        int[] reverseArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }

        return reverseArr;
    }

    //5.18
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        int j = arr1.length;

        for (int i = 0; i < arr2.length; i++) {
            newArr[j] = arr2[i];
            j++;
        }

        return newArr;
    }

    //5.19
    public static int[] findAll(int[] arr, int x) {
        int countX = 0;
        int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                tmp[countX] = i;
                countX++;
            }
        }

        if (countX == arr.length) {
            return tmp;
        }

        int[] indexes = new int[countX];
        for (int i = 0; i < countX; i++) {
            indexes[i] = tmp[i];
        }

        return indexes;
    }

    //5.20
    public static int[] deleteNegative(int[] arr) {
        int countPositive = 0;
        int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                tmp[countPositive] = arr[i];
                countPositive++;
            }
        }

        if (countPositive == arr.length) {
            return tmp;
        }

        int[] arrPositive = new int[countPositive];
        for (int i = 0; i < countPositive; i++) {
            arrPositive[i] = tmp[i];
        }

        return arrPositive;
    }

    //5.21
    public static int[] add(int[] arr, int x, int pos) {

        int modifiedArrLength;

        if (pos < arr.length) {
            modifiedArrLength = arr.length + 1;
        } else {
            modifiedArrLength = pos + 1;
        }

        int[] modifiedArr = new int[modifiedArrLength];
        int originIndex = 0;

        for (int i = 0; i < modifiedArrLength; i++) {
            if (i == pos) {
                modifiedArr[i] = x;
            } else {
                if (originIndex < arr.length) {
                    modifiedArr[i] = arr[originIndex];
                    originIndex++;
                }
            }
        }

        return modifiedArr;
    }

    //5.22
    public static int[] add(int[] arr, int[] ins, int pos) {
        int modifiedArrLength;

        if (pos < arr.length) {
            modifiedArrLength = arr.length + ins.length;
        } else {
            modifiedArrLength = pos + ins.length;
        }

        int[] modifiedArr = new int[modifiedArrLength];
        int originIndex = 0;
        int insIndex = 0;

        for (int i = 0; i < modifiedArrLength; i++) {
            if (i >= pos && i < pos + ins.length) {
                modifiedArr[i] = ins[insIndex];
                insIndex++;
            } else {
                if (originIndex < arr.length) {
                    modifiedArr[i] = arr[originIndex];
                    originIndex++;
                }
            }
        }

        return modifiedArr;
    }
}
