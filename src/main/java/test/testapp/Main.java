package test.testapp;

import static java.lang.String.format;

public enum Main {;

    public static void main(final String... args) {
        System.err.println(format("Package: %s", Main.class.getPackage()));
        System.err.println(format("Title  : %s", Main.class.getPackage().getImplementationTitle()));
        System.err.println(format("Vendor : %s", Main.class.getPackage().getImplementationVendor()));
        System.err.println(format("Version: %s", Main.class.getPackage().getImplementationVersion()));
    }

}
