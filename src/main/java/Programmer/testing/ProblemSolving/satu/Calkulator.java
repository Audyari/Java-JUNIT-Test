package Programmer.testing.ProblemSolving.satu;

public class Calkulator {


    private static Integer parseInteger(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                System.out.println(" FORMAT YG ANDA MASUKKAN SALAH");
                return null;
            }
        } else if (obj instanceof Integer) {
            return (Integer) obj;
        } else {

            return null;
        }
    }


    public static Integer add(Object dataSatu, Object dataDua) {
        try {
            int num1 = Calkulator.parseInteger(dataSatu);
            int num2 = Calkulator.parseInteger(dataDua);
            return num1 + num2;
        } catch (NumberFormatException e) {
            return null;
        } catch (NullPointerException e) {
            System.out.println("FORMAT YG ANDA MASUKKAN SALAH");
            return null;
        }
    }


    public static Integer divide(Integer first, Integer second) {
        if (second == null || second == 0) {
            return null;
        }

        try {
            return first / second;
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan saat pembagian: " + e.getMessage());
            return null;
        }
    }

}