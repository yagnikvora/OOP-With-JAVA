public class NumFormate8B2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide at least one integer number.");
            return;
        }
        int sum = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                check(num);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only integers....");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }   
        System.out.println("Total sum of valid numbers is: " + sum);
    }

    public static void check(int num) throws Exception {
        if (num < 0)
            throw new Exception("Negative number - " + num);
        else if (num % 10 == 0)
            throw new Exception("Number divisible by 10 - " + num);
        else if (num > 1000 && num < 2000)
            throw new Exception("Number between 1000 and 2000 - " + num);
        else if (num > 7000)
            throw new Exception("Number greater than 7000 - " + num);
    }
}
