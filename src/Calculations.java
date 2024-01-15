public class Calculations {

    public static float addStuff(String snumber1, String snumber2) {
        float fnumber1 = Float.parseFloat(snumber1);
        float fnumber2 = Float.parseFloat(snumber2);
        return fnumber1 + fnumber2;
    }

    public static float minusStuff(String snumber1, String snumber2) {
        float fnumber1 = Float.parseFloat(snumber1);
        float fnumber2 = Float.parseFloat(snumber2);
        return fnumber1 - fnumber2;
    }

    public static float multiplyStuff(String snumber1, String snumber2) {
        float fnumber1 = Float.parseFloat(snumber1);
        float fnumber2 = Float.parseFloat(snumber2);
        return fnumber1 * fnumber2;
    }

    public static float divideStuff(String snumber1, String snumber2) {
        float fnumber1 = Float.parseFloat(snumber1);
        float fnumber2 = Float.parseFloat(snumber2);
        return fnumber1 / fnumber2;
    }

    public static String makeCalculations(String input1, String input2, String whatAreWeDoing) {
        String result = "";
        switch (whatAreWeDoing) {
            case "+":
                result = Float.toString(addStuff(input1, input2));
                break;
            case "-":
                result = Float.toString(minusStuff(input1, input2));
                break;
            case "*":
                result = Float.toString(multiplyStuff(input1, input2));
                break;
            case "/":
                result = Float.toString(divideStuff(input1, input2));
                break;
            default:
                result = Float.toString(addStuff(Float.toString(0f), input2));
                break;
        }
        return result;
    }
}