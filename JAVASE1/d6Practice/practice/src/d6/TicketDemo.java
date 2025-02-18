package d6;

public class TicketDemo {
    public static void main(String[] args) {
        /**
         * 机票价格计算
         * input: double orinPrice, int month, int cangType
         * output: double price
         */
        double price = jisuan(1000, 3, 1);
        System.out.println(price);
    }

    /**
     *
     * @param orinPrice 原始价格
     * @param month 月份
     * @param cangType 仓位类型 1：头等舱 2：经济舱
     * @return 机票最终价格
     */
    public static double jisuan(double orinPrice, int month, int cangType){
        double resultPrice = orinPrice;
        if (month >= 5 && month <= 10){
            //旺季
            switch (cangType){
                case 1:
                    resultPrice = orinPrice * 0.9;
                    break;
                case 2:
                    resultPrice = orinPrice * 0.85;
                    break;
            }
        }else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)){
            //淡季
            switch (cangType){
                case 1:
                    resultPrice = orinPrice * 0.7;
                    break;
                case 2:
                    resultPrice = orinPrice * 0.65;
                    break;
            }
        }else {
            System.out.println("月份不对");
        }
        return resultPrice;
    }
}
