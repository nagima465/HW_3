public class HW3{
    public static void main(String[] args) {
        double[] arrey = {3.0, 4.5, -6.0, -7.0, 2.5, 8.5, -1.0, 0.5, 2.0, -7.5, 9.0, 6.5, -0.0, 3.3, -1.1};
        boolean isNegativefound = false;
        double sum = 0;
        int count = 0;
        for (double num : arrey ) {
            if (!isNegativefound && num > 0) {
                if (num < 0) {
                    isNegativefound = true;
                }
            } else {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифмитическое");
        } else {
            System.out.println("Нет положительных чисел после первого отрицателльного");
            }
        }
    }