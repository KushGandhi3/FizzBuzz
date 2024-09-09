public class Reduce {
    public static void main(String[] args) {

        int i = 100;
        int num_steps = 1;

        while (i != 0)
        {
            if (i % 2 == 0)
            {
                i = i / 2;
            }
            else
            {
                i -= 1;
            }

            num_steps++;
        }

        System.out.println(num_steps);
    }
}
