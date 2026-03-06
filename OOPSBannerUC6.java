public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] banner = {
            getOPattern()[0] + " " + getOPattern()[0] + " " + getPPattern()[0] + " " + getSPattern()[0],
            getOPattern()[1] + " " + getOPattern()[1] + " " + getPPattern()[1] + " " + getSPattern()[1],
            getOPattern()[2] + " " + getOPattern()[2] + " " + getPPattern()[2] + " " + getSPattern()[2],
            getOPattern()[3] + " " + getOPattern()[3] + " " + getPPattern()[3] + " " + getSPattern()[3],
            getOPattern()[4] + " " + getOPattern()[4] + " " + getPPattern()[4] + " " + getSPattern()[4],
            getOPattern()[5] + " " + getOPattern()[5] + " " + getPPattern()[5] + " " + getSPattern()[5],
            getOPattern()[6] + " " + getOPattern()[6] + " " + getPPattern()[6] + " " + getSPattern()[6]
        };

        for(String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            " ******",
            "*     *",
            "*     *",
            " ******",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ******"
        };
    }
}