package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0) {
            System.out.println("too much power");
        }else {
            int counter = 0;
            int result =1;
            while (counter <= power){
                for(int i=0; i<counter; i++){
                    result *=2;
                }
                System.out.println(result);
                result =1;
                counter++;
            }
        }
    }
}
