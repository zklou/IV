package oa;

public class UnitConverter {
    // 定义单位转换常量
    private static final double M_TO_FT = 3.28;
    private static final double FT_TO_IN = 12;
    private static final double HR_TO_MIN = 60;
    private static final double MIN_TO_SEC = 60;

    public static void main(String[] args) {
        // 示例查询
        double meters = 2;
        double inchesResult = metersToInches(meters);
        System.out.println(meters + " m = " + inchesResult + " in");

        double inches = 13;
        double metersResult = inchesToMeters(inches);
        System.out.println(inches + " in = " + metersResult + " m");

        double hoursResult = inchesToHours(inches);
        if (hoursResult == -1) {
            System.out.println(inches + " in = " + "not convertible!");
        } else {
            System.out.println(inches + " in = " + hoursResult + " hr");
        }
    }

    // 将米转换为英寸
    public static double metersToInches(double meters) {
        double feet = meters * M_TO_FT;
        return feet * FT_TO_IN;
    }

    // 将英寸转换为米
    public static double inchesToMeters(double inches) {
        double feet = inches / FT_TO_IN;
        return feet / M_TO_FT;
    }

    // 将英寸转换为小时（不可转换，返回-1表示不可转换）
    public static double inchesToHours(double inches) {
        return -1; // 因为英寸不能转换为小时
    }
}
