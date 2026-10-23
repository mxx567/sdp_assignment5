public class UpperCaseStrategy implements TextStrategy {
    public String format(String text) {
        return text.toUpperCase();
    }
}