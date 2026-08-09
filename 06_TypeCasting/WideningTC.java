public class WideningTC {
    public static void main(String[] args)
    {
        //widening casting means converting samller Data Type to Larger type
        //byte->short->char->int->long->float->double
        int num = 10;
        double value = num;// here We convert data type

        System.out.println("Number ="+ num);
        System.out.println("Value ="+ value);

    }
}
