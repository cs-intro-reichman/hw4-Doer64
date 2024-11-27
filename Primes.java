public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        boolean[] numbers = new boolean[max+1];
        numbers[0] = false;
        numbers[1] = false;
        for(int i = 2; i < numbers.length; i++){
            numbers[i] = true;
        }

        for(int i = 2; i < numbers.length; i++){
            if(numbers[i]){
                for(int j = i*2; j < numbers.length; j = j+i){
                    numbers[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + max + ":");
        int count = 0;
        for(int i = 2; i < numbers.length; i++){
            if(numbers[i]){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + max + " (" + (count*100/max) + "% are primes)");
    }
}