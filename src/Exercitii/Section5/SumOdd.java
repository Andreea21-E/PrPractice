package Exercitii.Section5;

public class SumOdd {

//public  int sumOdd = 0;
//
//
//    public static Boolean isOdd(int number) {
//        if (number > 0 && number % 2 != 0 ) {
//            return true;
//        }
//        return false;
//    }
//
//    public int calculateSumOdd(int start, int end)
//    {
//        sumOdd = 0;
//        if (start <= end && start > 0 && end > 0)
//        {
//            for (int i = start; i <= end; i++)
//            {
//
//
//                    if (isOdd(i))
//                    {
//                       sumOdd += i;
//                    }
//            }
//           return sumOdd;
//        }
//        return -1;
//
//    }
//}
    //    public staic int sumOdd = 0;
    public static int sumOdd = 0;


    public static Boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0 ) {
            return true;
        }
        return false;
    }

    public static int calculateSumOdd(int start, int end)
    {
        sumOdd = 0;
        if (start <= end && start > 0 && end > 0)
        {
            for (int i = start; i <= end; i++)
            {
                if (isOdd(i))
                {
                    sumOdd += i;
                }
            }
            return sumOdd;
        }
        return -1;

    }
}
