import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("example text", (text) -> text.toUpperCase());
        beautifier.beautify("another text", (text) -> text.substring(8).replace('t', 'T'));
        beautifier.beautify("one more time", (text) -> "".concat("..::||" + text + "||::.."));

    }

}