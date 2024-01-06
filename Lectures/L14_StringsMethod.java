

public class L14_StringsMethod {
    public static void main(String[] args) {
        //Lecture 14 --> Strings Method
        String name = "Harry";
        System.out.println(name);

        // 1) .length()
        int value = name.length();
        System.out.println(value);

        // 2) .toLowerCase() & .toUpperCase()
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        // 3) .trim()
        String nonTrimmedString = "   Harry    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        // 4) .substring()
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4));

        // 5) .replace()
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("y","ier"));

        // 6) .startsWith() & .endsWith()
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("py"));

        // 7) .charAt() , .indexOf() & .lastIndexOf()
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf("ry"));

        String modname = "Harryrryrryrry";
        // System.out.println(modname.indexOf("rry"));
        // System.out.println(modname.indexOf("rry",6));
        System.out.println(modname.lastIndexOf("rr",7));

        // 8) .equals & .equalsIgnoreCase
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harry"));
    }
}
