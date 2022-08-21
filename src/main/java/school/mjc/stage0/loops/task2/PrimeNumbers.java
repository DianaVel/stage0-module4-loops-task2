package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive){
            if(isPrime(counter)) System.out.println(counter);
            counter++;
        }
    }
    private boolean isPrime (int number){
        for(int i=2; i < number; i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}
