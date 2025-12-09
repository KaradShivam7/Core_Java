package Basic;

class number_pattern
{
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            for (int j = i; j <=i; j++) {
                System.out.print(" ");
            }

            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }

                    System.out.println();
        }
    }
}