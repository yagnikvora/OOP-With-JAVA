import java.util.InputMismatchException;

class NumExc8A1 {

    static int pow(int a, int b) {
        if (b < 0 || a < 0) {
            throw new IllegalArgumentException("numbers should be in positive....");
        }
        int ans = 1;
        while (b > 0) {
            ans *= a;
            b--;
        }
        return ans;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("please enter two command line argument");
        } else {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int power = pow(a, b);
                System.out.println("Answer is :- " + power);
            } catch (NumberFormatException e) {
                System.out.println("please enter only inegers.....");
            } catch(InputMismatchException e){
                System.out.println("Please enter only Numbers");
            }catch(IllegalArgumentException e){
                System.err.println(e.getMessage());
            }
        }
    }
}