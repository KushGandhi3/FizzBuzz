public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int num_multiple = 0;

        while (i < 1000)
        {
            if (i % 3 == 0)
            {
                num_multiple++;
            }

            if (i % 5 == 0)
            {
                num_multiple++;
            }

            i++;

        }

        System.out.println(num_multiple);
    }
}
