package pl.sztuczkap;

public class Main {

    public static void main(String[] args) {

        TextConverter textConverter = text -> text.replace(" ", ".");

/*        new TextConverter() {
            @Override
            public String convert(String text) {
                return text.replace(" ", ".");
            }

        };*/

        String result = textConverter.convert("   Przykładowy tekst  ");
        System.out.println(result);
        textConverter.displayText();
        String lowerCaseResult = TextConverter.convertToLowerCase("To jest TEXT");
        System.out.println(lowerCaseResult);
    }
}
