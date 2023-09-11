package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 999; i++) {
            for (int j = 1; j <= 999; j++) {
                System.out.print(i++ + " - ");
            }
            System.out.println("1000");

            System.out.println();
            System.out.println();


            //2
            for (int k = 1; k <= 100; k++) {
                if (k % 2 == 0) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
            System.out.println();

            //3
            int[] array = {2, 5, 8, 4, 9, 3, 7};
            {
                int max = array[0];

                for (int x = 1; x < array.length; x++) {
                    if (array[x] > max) {
                        max = array[x];

                    }
                }
                System.out.println(max + " ");
            }
        }

    }
}














