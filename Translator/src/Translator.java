import java.util.HashMap;

public class Translator {

    HashMap<Integer, String> translatorMap = new HashMap<>();

    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            this.translatorMap.put(numeric[i], alphabetic[i]);
        }
    }

    public void TranslateNumber(Integer number){
        System.out.printf("%s\n", this.translatorMap.get(number));
    }
}
