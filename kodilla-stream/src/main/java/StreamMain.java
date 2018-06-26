import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("example text", text -> text.toUpperCase());
        beautifier.beautify("another text", text -> text.substring(text.length() < 3 ? 0 : text.length()/ 2 + 2).replace('t', 'T'));
        beautifier.beautify("one more time", text -> "".concat("..::||" ).concat(text).concat("||::.."));
    }

}