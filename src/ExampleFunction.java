public class ExampleFunction {
    public static void main(String[] args) {

        /*
        * Struktur dari function
        *
        * access_modifier / specifier return_type method_name(parameters...){
        *   code/statement
        * }
        *
        * function yang tidak memiliki return -> procedure
        * */

        System.out.println(multiply(10, 15));
        System.out.println(multiply(3, 7));

    }

        public static int multiply(int a, int b) {
            return a * b;
        }

}
