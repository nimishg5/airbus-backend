package com.backend.airbus.utils;

public class DjangoCodeUtil {

    public static String helloWorldCode() {
        return "import django.http from HttpResponse\n" +
                "\n" +
                "def print(request):\n" +
                "      return HttpResponse(\"Hello World!\")";
    }

    public static String interfaceWithTwoMethods() {
        return "from abc import ABC, abstractmethod\n" +
                "\n" +
                "class AccountingSystem(ABC):\n" +
                "\n" +
                "    @abstractmethod\n" +
                "    def create_purchase_invoice(self, purchase):\n" +
                "        pass\n" +
                "\n" +
                "    @abstractmethod\n" +
                "    def create_sale_invoice(self, sale):\n" +
                "        log.debug('Creating sale invoice', sale)";
    }

    public static String basicSwitchCase() {
        return "switch (expression)  {\n" +
                "    case constant1:\n" +
                "        // code to be executed if \n" +
                "        // expression is equal to constant1;\n" +
                "        break;\n" +
                "\n" +
                "    case constant2:\n" +
                "        // code to be executed if\n" +
                "        // expression is equal to constant2;\n" +
                "        break;\n" +
                "        .\n" +
                "        .\n" +
                "    default:\n" +
                "        // code to be executed if\n" +
                "        // expression doesn't match any constant\n" +
                "})";
    }

}
