public class DataType {
    public static void main(String[] args) {
        /*
        * terdapat dua tipe data dalam java (primitive & non-primitive)
        * 1. Primitive   -> int, float, boolean, char, byte, short
        * 2. Non-primive -> String, Integer, Float, Boolean, Array (class)
        * */

        // tipe data number
        byte iniByte = 10; // -128 s/d 128 - 1
        short iniShort = 20; // -32rb s/d 32rb -1
        int iniInteger = 30; // -2 miliar s/d kuadriliun -1
        long iniLong = 40; // - kuadriliun s/d kuadriliun -1

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println("sebelum reassign: " + iniInteger);
        System.out.println(iniLong);

        // tipe data floating (decimal)
        float iniFloat = 5.9766f;
        double iniDouble = 6.0;

        // println -> enter diakhir printf -> tidak ada enter
        // System.out.print("halo");

        System.out.printf("%.3f \n", iniFloat); // format float
        System.out.println(iniDouble);

        // reassign
        iniInteger = 100;
        System.out.println("reassign: " + iniInteger);

        // Conversion
        /*
        * 1. Cara otomatis -> ketika kita mengubah tipe data ke yang lebih besar short -> int
        * 2. Cara manual -> ketika kita mengubbah tipe data lebih besar ke lebih kecil
        * */

        int harga = 32769;
        int newInt = iniShort;
        short newShort = (short) harga; // casting
        System.out.println("-".repeat(30));
        System.out.println(newInt);
        System.out.println(newShort);

        /*
        * naming convention
        * 1. PascalCase -> class
        * 2. camelCase -> variable, method/function
        * 3. snake_case -> variable, method
        * 4. kebab-case -> project name
        * 5. SCREAMING_CASE / SCREAMING_SNAKE_CASE -> variable constant / variabel yang tida
        * */

        // char

        char a = 'A';
        char b = 'B';

        System.out.println("-".repeat(30));

        //String
        String name = "Vincent";
        String lastName = "Gosling";
        String fullName = name + " " + lastName;
        System.out.println(fullName);

    }
}
