public class RemoveSpacesStrategy implements TextStrategy{
    public String format(String text) {
        return text.replaceAll("\\s+", "");
    }
}
