import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 40;
        double c = 7;


        //21
//        if(a > b && a > c) {
//            System.out.println(a);
//        } else if (b > a && b > c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }



        //22
//        if (a < b && a < c) {
//            System.out.println(a);
//        } else if (b < a && b < c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }



        //23
//        boolean check = false;
//        if(a == 1 || b == 1 || c == 1) {
//            check = true;
//        }
//        System.out.println(check);



        //24
//        boolean check = false;
//        if(a == 2 && b == 2 && c != 2 || a == 2 && c == 2 && b !=2|| b == 2 && c == 2 && a != 2) {
//            check = true;
//        }
//        System.out.println(check);



        //25
//        int y = 2;
//        if(a + b > c && b + c > a && a + c > b) {
//            y = 1;
//        }
//        System.out.println(y);



        //26
//        int check = 2;
//        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
//            check = 1;
//        }
//        System.out.println(check);



        //27
//        if(c-b == b-a) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }



        //28
//        if(c/b == b/a) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }



        //29
//        if(a > b && b > c) {
//            System.out.println(c + ", " + b + ", " + a);
//        } else if (a > c && c > b) {
//            System.out.println(b + ", " + c + ", " + a);
//        } else if (b > c && c > a) {
//            System.out.println(a + ", " + c + ", " + b);
//        } else if (b > a && a > c) {
//            System.out.println(c + ", " + a + ", " + b);
//        } else if (c > a && a > b) {
//            System.out.println(b + ", " + a + ", " + c);
//        } else {
//            System.out.println(a + ", " + b + ", " + c);
//        }



        //30
//        if(a < b && b < c) {
//            System.out.println(c + ", " + b + ", " + a);
//        } else if (a < c && c < b) {
//            System.out.println(b + ", " + c + ", " + a);
//        } else if (b < c && c < a) {
//            System.out.println(a + ", " + c + ", " + b);
//        } else if (b < a && a < c) {
//            System.out.println(c + ", " + a + ", " + b);
//        } else if (c < a && a < b) {
//            System.out.println(b + ", " + a + ", " + c);
//        } else {
//            System.out.println(a + ", " + b + ", " + c);
//        }



        //Switch Case
//        int x = 9;
//        switch (x) {
//            case 1:
//            case 3:
//            case 5:
//                System.out.println("dasi enq");
//                break;
//            case 2:
//            case 4:
//            case 6:
//                System.out.println("das chunenq");
//                break;
//            case 7:
//                System.out.println("kiraki");
//                break;
//            default:
//                System.out.println("aydisi shabta or goyutyun chuni");
//
//        }




//        int x = 10;
//        int y = 100;
//        int z = 7;
//        int k = -100;

        //31
//        if(x > y && x > y && x > z && x > k) {
//            System.out.println(x);
//        } else if(y > x && y > z && y > k) {
//            System.out.println(y);
//        } else if(z > x && z > y && z > k) {
//            System.out.println(z);
//        } else {
//            System.out.println(k);
//        }



        //32
//        if(x < y && x < y && x < z && x < k) {
//            System.out.println(x);
//        } else if(y < x && y < z && y < k) {
//            System.out.println(y);
//        } else if(z < x && z < y && z < k) {
//            System.out.println(z);
//        } else {
//            System.out.println(k);
//        }



        //33
//        boolean check = false;
//        if(x == 1 || y == 1 || z == 1 || k == 1) {
//            check = true;
//        }
//        System.out.println(check);



        //34
//        if(x + y == z + k || x + z == y + k || x + k == y + z) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }



        //35
//        if(x == y + z + k || y == x + z + k || z == x + y + k || k == x + y + z) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }



        //36
//        if((x % 2 != 0 && y % 2 != 0) || (x % 2 != 0 && z % 2 != 0) || (x % 2 != 0 && k % 2 != 0) || (y % 2 != 0 && z % 2 != 0) || (y % 2 != 0 && k % 2 != 0) || (z % 2 != 0 && k % 2 != 0)) {
//            System.out.println(1);
//        } else {
//            System.out.println(2);
//        }



        //39
//        int p = 4;
//        int q = 11;
//        int l = 7;
//        int r = 15;









//------------------------------------------Homework 2-------------------------------------------------


        //51
//        int n = 927;
//        boolean check = false;
//
//        if(n % 10 == (n / 10) % 10 + n / 100) {
//            t = true;
//        }
//        System.out.println(t);



        //52
//        int n = 579;
//        boolean check = false;
//        int miavor  = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor == tasnavor || miavor == haryuravor || tasnavor == haryuravor) {
//            check = true;
//        }
//        System.out.println(check);



        //53
//        int n = 415;
//        int k = 300;
//        double result = 0;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(n > k) {
//            result = (double) n/ (miavor + tasnavor + haryuravor);
//        } else {
//            result = (double) miavor/ n;
//        }
//        System.out.println(result);



        //54
//        int n = 915;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor >= tasnavor && miavor >= haryuravor) {
//            System.out.println(miavor);
//        } else if(tasnavor >= miavor && tasnavor >= haryuravor) {
//            System.out.println(tasnavor);
//        } else {
//            System.out.println(haryuravor);
//        }



        //55
//        int n = 378;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor <= tasnavor && miavor <= haryuravor) {
//            System.out.println(miavor);
//        } else if(tasnavor <= miavor && tasnavor <= haryuravor) {
//            System.out.println(tasnavor);
//        } else {
//            System.out.println(haryuravor);
//        }



        //56
//        int n = 915;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor > tasnavor) {
//            System.out.println((double) (miavor + tasnavor + haryuravor) / n );
//        } else {
//            System.out.println(n);
//        }



        //57
//        int n = 915;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(n > 300) {
//            System.out.println((double)tasnavor / miavor);
//        } else {
//            System.out.println((double)haryuravor / miavor);
//        }



        //58
//        int n = 915;
//        char f = 'b';
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(tasnavor + haryuravor < 5) {
//            f = 'a';
//        }
//        System.out.println(f);



        //59
//        int n = 819;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor > tasnavor && tasnavor > haryuravor) {
//            System.out.println(haryuravor + ", " + tasnavor  + ", " + miavor);
//        } else if(miavor > haryuravor && haryuravor > tasnavor) {
//            System.out.println(tasnavor + ", " + haryuravor + ", " + miavor);
//        } else if(tasnavor > miavor && miavor > haryuravor) {
//            System.out.println(haryuravor + ", " + miavor + ", " + tasnavor);
//        } else if(tasnavor > haryuravor && haryuravor > miavor) {
//            System.out.println(miavor + ", " + haryuravor + ", "+ tasnavor);
//        } else if(haryuravor > miavor && miavor > tasnavor) {
//            System.out.println(tasnavor + ", " +  miavor + ", " + haryuravor);
//        } else {
//            System.out.println(miavor + ", " + tasnavor + ", " + haryuravor);
//        }



        //60
//        int n = 819;
//        int miavor = n % 10;
//        int tasnavor = (n / 10) % 10;
//        int haryuravor = (n / 100);
//        if(miavor < tasnavor && tasnavor < haryuravor) {
//            System.out.println(haryuravor + ", " + tasnavor  + ", " + miavor);
//        } else if(miavor < haryuravor && haryuravor < tasnavor) {
//            System.out.println(tasnavor + ", " + haryuravor + ", " + miavor);
//        } else if(tasnavor < miavor && miavor < haryuravor) {
//            System.out.println(haryuravor + ", " + miavor + ", " + tasnavor);
//        } else if(tasnavor < haryuravor && haryuravor < miavor) {
//            System.out.println(miavor + ", " + haryuravor + ", " + tasnavor);
//        } else if(haryuravor < miavor && miavor < tasnavor) {
//            System.out.println(tasnavor + ", " +  miavor + ", " + haryuravor);
//        } else {
//            System.out.println(miavor + ", " + tasnavor + ", " + haryuravor);
//        }





        //Task2
//        int[] array = new int[1000];
//        for(int i = 0; i < 1000; i++) {
//            array[i] = i+1;
//        }



        //Task3
//        int[] array = new int[20];
//        int j = 0;
//        for(int i = -20; i < 20; i++) {
//            if(i % 2 != 0) {
//                array[j] = i;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(array));



        //Task4
//        int[] array = {7, -20, 16, 35, 9, 15};
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 5 == 0) {
//                System.out.println(array[i]);
//            }
//        }



        //Task5
//        double[] array = {3, 4.5, 7, 24, 34, 100};
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] > 24.12 && array[i] < 467.23) {
//                System.out.println(array[i]);
//            }
//        }



        //Task6
//        int[] array = {-4, 7, -13, -24, 8, 5, 9};
//        int count = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);



        //Task7
//        int n = 6;
//        for(int i = 1; i < 10; i++) {
//            System.out.println(n + " x " + i + " = " + n*i);
//        }



        //Task*****
//        int[] array = {345, 78, 578};
//        int[] newArray =  new int[array.length];
//        for(int i = 0, j = 0; i < array.length; i++) {
//            int temp = 0;
//            while(array[i] > 0) {
//                temp = temp * 10 + array[i] % 10;
//                array[i] /= 10;
//            }
//            newArray[j] = temp;
//            j++;
//        }
//        System.out.println(Arrays.toString(newArray));






//------------------------------------------------Homework3--------------------------------------------



        int[] array = {1, -5, 6, 14, -8, 23, 2, -12};
        int count = 0;



        //211
//        double sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i]>0){
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);



        //214
//        double sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] < 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);



        //215
//        double sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(i % 2 == 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);



        //216
//        int product = 1;
//        for(int i = 0; i < array.length; i++) {
//            if(i % 2 == 0) {
//                product *= array[i];
//            }
//        }
//        System.out.println(product);



        //217
//        int product = 1;
//        for(int i = 0; i < array.length; i++) {
//            if(i % 2 != 0) {
//                product *= array[i] * array[i];
//            }
//        }
//        System.out.println(product);



        //220
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] != 0) {
//                count++;
//            }
//        }
//        System.out.println(count);



        //227
//        int k = 3;
//        double sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % k == 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);



        //228
//        int k = 5;
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            if(i % k == 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);



        //229
//        int product = 1;
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] - i > 0) {
//                product *= array[i];
//            }
//        }
//        System.out.println(product);



        //232
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);



        //233
//        int sum = 0;
//        int product = 1;
//        for(int i : array) {
//            if(i % 2 == 0) {
//                sum += i;
//                product *= i;
//            }
//        }
//        System.out.println("sum: " + sum);
//        System.out.println("product: " + product);



       //234
//        double sum = 0;
//        for(int i : array) {
//            if(i % 2 != 0) {
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println(sum/count);



        //237
//        for(int i : array) {
//            if(i == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);



        //238
//        double sum = 0;
//        for(int i : array) {
//            if(i % 3 == 0) {
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println(sum/count);



        //240
//        for(int i : array) {
//            if(i % 7 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);



        //245
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            if((array[i] + i) % 3 == 0) {
                sum += array[i] * array[i];
            }
        }
        System.out.println(sum);











    }
}
