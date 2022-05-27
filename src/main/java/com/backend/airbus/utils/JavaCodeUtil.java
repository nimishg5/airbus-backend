package com.backend.airbus.utils;

public class JavaCodeUtil {

    public static String helloWorldCode() {
        return "class Test {\n" +
                "\t\n" +
                "\tpublic static void main (String[] args) {\n" +
                "\t\tSystem.out.println(\"Hello World\");\n" +
                "\t}\n" +
                "\n" +
                "}";
    }

    public static String interfaceWithTwoMethods() {
        return "interface printable{  \n" +
                "void print();  \n" +
                "void testMe();  \n" +
                "}  ";
    }

    public static String basicSwitchCase() {
        return "class Test {\n" +
                "\t\n" +
                "\tpublic static void main (String[] args) {\n" +
                "\t\t\n" +
                "\t\tString s = \"a\";\n" +
                "\n" +
                "\t\tswitch (s) {\n" +
                "\t\t\tcase \"a\":\n" +
                "\t\t\t\tSystem.out.println(\"a\");\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t\tcase \"b\":\n" +
                "\t\t\t\tSystem.out.println(\"b\");\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t\tdefault:\n" +
                "\t\t\t\tSystem.out.println(\"default\");\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "}";
    }
}
