package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String result = "";
        int counter = 0;
        while (counter < chars.length){
            result = result + Character.toString(chars [counter]);
            counter ++;
        }
        System.out.print(result);
    }
}
