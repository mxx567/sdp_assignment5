public class TextProcessor {
    TextStrategy textStrategy;

    TextProcessor(TextStrategy textStrategy){
        this.textStrategy = textStrategy;
    }

    public String ProcessString(String text){
        return textStrategy.format(text);
    }

    public void setTextStrategy(TextStrategy textStrategy){
        this.textStrategy = textStrategy;
    }
}
