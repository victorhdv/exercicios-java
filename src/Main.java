public class Main {
    public static void main(String[] args) {
        /*
        Em um novo programa, inicie as seguintes variáveis:
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        Em seguida, usando os valores das variáveis, produza a
        seguinte saída na tela do console:
        Products:
        Computer, which price is $ 2100,00
        Office desk, which price is $ 650,50
        Record: 30 years old, code 5290 and gender: F
        Measue with eight decimal places: 53,23456700
        Rouded (three decimal places): 53,235
        US decimal point: 53.235
         */
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("%s, which price is $ %.2f \n" +
                "%s, which price is $ %.2f\n" +
                "\nRecord: %d years old, code %d and gender: %s\n" +
                "\nMeasure with eight decimal places: %.8f\n" +
                "Rounded (three decimal places): %.3f\n" +
                "US decimal point: %.3f", product1, price1, product2,price2, age, code, gender, measure, measure, measure);

    }
}