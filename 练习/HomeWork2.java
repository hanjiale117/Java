public class HomeWork2 {
        public static void main(String[] args) {
            double money = 100000;
            int n = 0;
            while (true){
                if (money > 50000) {
                    money *= 0.95;
                    n++;
                } else if (money >= 1000) {
                    money -= 1000;
                    n++;
                }else{
                    break;
                }
            }
            System.out.println(n);
        }
}

