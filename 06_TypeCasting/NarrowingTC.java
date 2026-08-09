public class NarrowingTC {
    public static void main(String[] args)
    {
        //Narrowing casting means converting Larger Data type to Smaller type
        //byte<-short<-char<-int<-long<-float<-double
        double num = 10.5;
        int value = (int) num;// here We convert data type

        System.out.println("Number ="+ num);
        System.out.println("Value ="+ value);

    }
}
