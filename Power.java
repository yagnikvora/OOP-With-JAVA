public class Power {
    public static int pow(int base,int power){
        if(power == 0)
            return 1;
        else{
            int answer = base;
            int increment = base;
            for(int i =1 ;i<power; i++){
                for(int j =1 ;j<base ;j++){
                    answer += increment;
                }
                increment = answer;
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(3,5));
    }
}
