package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int result = 1;
        System.out.println(result);
        while (counter<=printToInclusive){
            result *=counter;
            counter++;
            System.out.println(result);
        }
    }
}
