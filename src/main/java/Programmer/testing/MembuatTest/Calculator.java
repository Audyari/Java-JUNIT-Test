package Programmer.testing.MembuatTest;

import java.util.function.BiFunction;

public class Calculator {

//    public int add(int a, int b) {
//        long result = (long) a + (long) b;
//        if (result > Integer.MAX_VALUE) {
//            throw new ArithmeticException("Integer overflow");
//        } else if (result < Integer.MIN_VALUE) {
//            throw new ArithmeticException("Integer underflow");
//        }
//        return (int) result;
//    }
//
//    public int subtract(int a, int b) {
//        long result = (long) a - (long) b;
//        if (result > Integer.MAX_VALUE) {
//            throw new ArithmeticException("Integer overflow");
//        } else if (result < Integer.MIN_VALUE) {
//            throw new ArithmeticException("Integer underflow");
//        }
//        return (int) result;
//    }

//    public int multiply(int a, int b) {
//        long result = (long) a * (long) b;
//        if (result > Integer.MAX_VALUE) {
//            throw new ArithmeticException("Integer overflow");
//        } else if (result < Integer.MIN_VALUE) {
//            throw new ArithmeticException("Integer underflow");
//        }
//        return (int) result;
//    }

//    public int divide(int a, int b) {
//        if (b == 0) {
//            throw new IllegalArgumentException("Cannot divide by zero.");
//        }
//        return a / b;
//    }
//}

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }


}

