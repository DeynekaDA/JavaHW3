import java.util.Scanner;

public class T1 {

    static int getRandom(int limit) {
        return (int) (Math.random() * 9);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Угадай число от 0 до 9 ");
            int x = getRandom(9);
            int cnt = 0;
            int n;
            boolean b1 = false;
            while (cnt < 3){
                cnt++;
                System.out.println("Попытка №" + cnt);
                n = in.nextInt();
                if (n==x){
                    b1 = true;
                    break;
                } else {
                    if(n>x){
                        System.out.println("Число меньше");
                    } else {
                        System.out.println("Число больше");
                    }
                }
            }
            if (b1 == true){
                System.out.println("Угадал");
            }
            else
            {
                System.out.println("Не угадал");
            }
            System.out.println("Повторить еще раз? 1 - да; 0 - нет;");
            int exit = in.nextInt();
            if (exit == 0){
                break;
            }

        }

    }
}