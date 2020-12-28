package pl.sztuczkap;

public class Main {

    public static void main(String[] args) {

//        TextConverter textConverter = new SpaceTextConverter();
//        String result =  textConverter.convert("  Przykładowy text   !");
//        System.out.println(result);
//        textConverter.display();

        TextConverter textConverter = new TextConverter() {
            @Override
            public String convert(String text) {
                return text.replace(" ", ".");
            }

            @Override
            public void display() {
                System.out.println("Hello from TextConverter");
            }
        };

        String result = textConverter.convert("   Przykładowy tekst  ");
        System.out.println(result);
        textConverter.display();
    }
}
