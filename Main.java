public class Main {


//    public static void main(String[] args) {
//
//        System.out.println("メソッドを呼び出します。");
//        hello();
//        System.out.println("メソッドの呼び出しが終わりました");
//    }
//
//    public static void hello() {
//        System.out.println("湊さん、こんには。");
//    }
//}


//    public static void methodA() {
//        System.out.println("methodA");
//        methodB();
//    }
//    public static void methodB() {
//        System.out.println("methodB");
//    }
//    public static void main(String[] args) {
//        methodA();
//    }
//}


//    public static void main(String[] args) {
//        System.out.println("メソッドを呼び出します");
//        hello("湊");
//        hello("朝香");
//        hello("菅原");
//        System.out.println("メソッドの呼び出しが終わりました。");
//    }
//    public static void hello(String name) {
//        System.out.println(name + "さん、こんにちは。");
//    }
//}


//    public static void main(String[] args) {
//        add(100, 20);
//        add(200, 50);
//    }
//    public static void add(int x, int y) {
//        int ans = x + y;
//        System.out.println(x + "+" + y + "=" + ans);
//    }
//}


//    public static int add(int x, int y) {
//        int ans = x + y;
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int ans = add(100, 10);
//        System.out.println("100 + 10 = " + ans);
//    }
//}


//    public static int add(int x, int y) {
//        int ans = x + y;
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(add(add(10, 20), add(30, 40)));
//    }
//}


//    引数の型が異なる場合
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static double add (double x, double y){
//        return x + y;
//    }
//    public static String add(String x, String y){
//        return x + y;
//    }
//    public static void main(String[] args) {
//        System.out.println(add(10, 20));
//        System.out.println(add(3.5, 2.7));
//        System.out.println(add("hello", "world"));
//    }

//    引数の数が異なる場合
//    public static int add(int x, int y){
//        return x + y;
//    }
//    public static int add(int x, int y, int z){
//        return x + y + z;
//    }
//    public static void main(String[] args) {
//        System.out.println("10 + 20 =  " + add(10, 20) );
//        System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
//    }


//    public static void printArray(int[] array){
//        for (int element : array) {
//            System.out.println(element);
//        }
//    }
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        printArray(array);
//    }


    //配列をメソッド呼び出しで渡している
//    public static void incArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            array[i]++;
//        }
//    }
//    public static void main(String[] args) {
//     int[] array = {1, 2, 3};
//     incArray(array);
//     for(int i : array){
//         System.out.println(i);
//     }
//    }
    //戻り値に配列を用いる
//    public static  int[] makeArray(int size){
//        int[] newArray = new int[size];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = i;
//        }
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        int[] array = makeArray(3);
//        for (int i : array) {
//            System.out.println(i);
//        }
//    }


    //練習問題
//    public static void main(String[] args) {
//        introduceOneself();
//    }
//    public static void introduceOneself() {
//        String name = "yuuta";
//        int age = 17;
//        double height = 170.5;
//        char zoddiac = '辰';
//        System.out.println("私の名前は" + name);
//        System.out.println("年齢は" + age);
//        System.out.println("身長は" + height);
//        System.out.println("十二支は" + zoddiac);
//    }



//    public static void main(String[] args) {
//        String title = "おはようございます";
//        String address = "yuuta@gmail.com";
//        String text = "朝の挨拶です。";
//        email(title, address, text);
//    }
//    public static void email(String title, String address, String text){
//        System.out.println(address + "に、メールを受信しました。");
//        System.out.println("件名　：" + title);
//        System.out.println("本文　：" + text);
//    }
//    public static void email(String title, String address, String text){
//        System.out.println(address + "に、以下のメールを送りました。");
//        System.out.println("件名　：　無題");
//        System.out.println("本文　：　");
//    } //オーバーロードが分からない・・・


    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積" + triangleArea + "平方cm");
        double circleArea = calcCircleArea(5.0);
        System.out.println("円の面積" + circleArea);
    }
    public static double calcTriangleArea(double botton, double height){
        double area = (botton * height) / 2;
        return area;
    }
    public static double calcCircleArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
}
