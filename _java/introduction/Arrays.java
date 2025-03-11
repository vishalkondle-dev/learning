package _java.introduction;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }

        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        for (int number : numbers2) {
            System.out.println(number);
        }

        int[][] numbers3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int[] row : numbers3) {
            for (int number : row) {
                System.out.println(number);
            }
        }

        int[][] numbers4 = new int[2][3];
        numbers4[0][0] = 1;
        numbers4[0][1] = 2;
        numbers4[0][2] = 3;
        numbers4[1][0] = 4;
        numbers4[1][1] = 5;
        numbers4[1][2] = 6;
        for (int[] row : numbers4) {
            for (int number : row) {
                System.out.println(number);
            }
        }

        // Properties
        int[] numbers5 = { 1, 2, 3, 4, 5 };
        System.out.println(numbers5.length);
    }
}
