public class Main {
    public static void main(String[] args) {

        //6.1
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 3);
        Point point3 = new Point(5, 8);

        System.out.println("Point1: " + point1.toString());
        System.out.println("Point2: " + point2.toString());
        System.out.println("Point3: " + point3.toString());

        System.out.println("Point1==Point2: " + compare2Points(point1, point2));
        System.out.println("Point1==Point3: " + compare2Points(point1, point3));
        System.out.println("Point2==Point3: " + compare2Points(point2, point3));

//        //4.1
//        double fraction = Module4.fraction(4.563136);
//        System.out.println("fraction: " + Math.round(fraction * 1000f) / 1000f);
//
//        //4.2
//        System.out.println("sumLastNums: " + Module4.sumLastNums(4456));
//
//        //4.3
//        System.out.println("charToNum: " + Module4.charToNum('9'));
//
//        //4.4
//        System.out.println("isPositive: " + Module4.isPositive(-1));
//
//        //4.5
//        System.out.println("is2Digits: " + Module4.is2Digits(10));
//
//        //4.6
//        System.out.println("isUpperCase: " + Module4.isUpperCase('h'));
//
//        //4.7
//        System.out.println("isInRange: " + Module4.isInRange(5, 1, 5));
//
//        //4.8
//        System.out.println("isDivisor: " + Module4.isDivisor(6, 3));
//        System.out.println("isDivisor: " + Module4.isDivisor(3, 6));
//        System.out.println("isDivisor: " + Module4.isDivisor(0, 15));
//
//        //4.9
//        System.out.println("isEqual: " + Module4.isEqual(1, 1, 1));
//        System.out.println("isEqual: " + Module4.isEqual(1, 1, 2));
//
//        //4.10
//        int lstNumSum = Module4.lastNumSum(5, 11);
//        lstNumSum = Module4.lastNumSum(lstNumSum, 123);
//        lstNumSum = Module4.lastNumSum(lstNumSum, 14);
//        System.out.println("lastNumSum: " + Module4.lastNumSum(lstNumSum, 1));
//
//        //4.11
//        System.out.println("abs: " + Module4.abs(10));
//        System.out.println("abs: " + Module4.abs(-5));
//        System.out.println("abs: " + Module4.abs(0));
//
//        //4.12
//        System.out.println("safeDiv: " + Module4.safeDiv(10, 3));
//        System.out.println("safeDiv: " + Module4.safeDiv(10, 0));
//
//        //4.13
//        System.out.println("max: " + Module4.max(-10, 3));
//        System.out.println("max: " + Module4.max(4, 13));
//
//        //4.14
//        System.out.println("makeDecision: " + Module4.makeDecision(-10, 3));
//        System.out.println("makeDecision: " + Module4.makeDecision(10, 3));
//        System.out.println("makeDecision: " + Module4.makeDecision(3, 3));
//
//        //4.15
//        System.out.println("max3: " + Module4.max3(-10, 3, 5));
//        System.out.println("max3: " + Module4.max3(10, 3, 5));
//        System.out.println("max3: " + Module4.max3(10, 30, 5));
//        System.out.println("max3: " + Module4.max3(10, 10, 10));
//
//        //4.16
//        System.out.println("sum3: " + Module4.sum3(1, 2, 3));
//        System.out.println("sum3: " + Module4.sum3(2, 5, 3));
//        System.out.println("sum3: " + Module4.sum3(2, 1, 1));
//
//        //4.17
//        System.out.println("sum2: " + Module4.sum2(1, 2));
//        System.out.println("sum2: " + Module4.sum2(12, -2));
//
//        //4.18
//        System.out.println("is35: " + Module4.is35(15));
//        System.out.println("is35: " + Module4.is35(3));
//        System.out.println("is35: " + Module4.is35(5));
//        System.out.println("is35: " + Module4.is35(4));
//
//        //4.19
//        System.out.println("is35: " + Module4.magic6(6,1));
//        System.out.println("is35: " + Module4.magic6(1,6));
//        System.out.println("is35: " + Module4.magic6(2,4));
//        System.out.println("is35: " + Module4.magic6(10,4));
//        System.out.println("is35: " + Module4.magic6(3,8));
//
//        //4.20
//        System.out.println("age: " + Module4.age(22));
//        System.out.println("age: " + Module4.age(11));
//        System.out.println("age: " + Module4.age(5));
//        System.out.println("age: " + Module4.age(44));
//
//        //4.21
//        System.out.println("day: " + Module4.day(3));
//        System.out.println("day: " + Module4.day(22));
//
//        //4.22
//        System.out.println("printDays: ");
//        Module4.printDays("Среда");

//        //5.1
//        System.out.println("listNums: " + Module5.listNums(5));
//
//        //5.2
//        System.out.println("reverseListNums: " + Module5.reverseListNums(0));
//
//        //5.3
//        System.out.println("chet: " + Module5.chet(0));
//
//        //5.4
//        System.out.println("pow: " + Module5.pow(3,0));
//        System.out.println("pow: " + Module5.pow(2,5));
//
//        //5.5
//        System.out.println("numLen: " + Module5.numLen(0));
//        System.out.println("numLen: " + Module5.numLen(32));
//        System.out.println("numLen: " + Module5.numLen(-12345));
//
//        //5.6
//        System.out.println("equalNum: " + Module5.equalNum(0));
//        System.out.println("equalNum: " + Module5.equalNum(1));
//        System.out.println("equalNum: " + Module5.equalNum(232));
//        System.out.println("equalNum: " + Module5.equalNum(555));
//
//        //5.7
//        System.out.println("square: ");
//        Module5.square(2);
//
//        //5.8
//        System.out.println("leftTriangle: ");
//        Module5.leftTriangle(5);
//
//        //5.9
//        System.out.println("rightTriangle: ");
//        Module5.rightTriangle(2);
//
//        //5.10
//        System.out.println("guessGame: ");
//        Module5.guessGame();

//        //5.11
//        int[] arr = {-1, -1, -1, -3, 1};
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {6, 7, 8};
//        int[] resArr;
//        System.out.println("findFirst: " + Module5.findFirst(arr, 555));
//        System.out.println("findFirst: " + Module5.findFirst(arr, 1));
//
//        //5.12
//        System.out.println("findLast: " + Module5.findLast(arr, 555));
//        System.out.println("findLast: " + Module5.findLast(arr, 1));
//
//        //5.13
//        System.out.println("maxAbs: " + Module5.maxAbs(arr));
//
//        //5.14
//        System.out.println("countPositive: " + Module5.countPositive(arr));
//
//        //5.15
//        System.out.println("palindrom: " + Module5.palindrom(arr));
//
//        //5.16
//        Module5.reverse(arr);
//        System.out.println("reverse: " + Arrays.toString(arr));
//
//        //5.17
//        arr = Module5.reverseBack(arr);
//        System.out.println("reverseBack: " + Arrays.toString(arr));
//
//        //5.18
//        resArr = Module5.concat(arr1, arr2);
//        System.out.println("concat: " + Arrays.toString(resArr));
//
//        //5.19
//        int[] indexes = Module5.findAll(arr, 0);
//        System.out.println("findAll: " + Arrays.toString(indexes));
//
//        //5.20
//        int[] arrPositive = Module5.deleteNegative(arr);
//        System.out.println("deleteNegative: " + Arrays.toString(arrPositive));
//
//        //5.21
//        int[] modifiedArr = Module5.add(arr, 9, 4);
//        System.out.println("modifiedArr: " + Arrays.toString(modifiedArr));
//
//        //5.22
//        int[] modifiedArrIns = Module5.add(arr, arr2, 6);
//        System.out.println("modifiedArrIns: " + Arrays.toString(modifiedArrIns));

    }

    public static boolean compare2Points(Point firstPoint, Point secondPoint) {
        return firstPoint.x == secondPoint.x && firstPoint.y == secondPoint.y;
    }
}
