package data_access_object;

public class Testing extends HttpServlet {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        int[] a = {0,2,4,1,3};
        for(int i = 0; i < a.length; i++){

            a[i] = a[(a[i] + 3) % a.length];
            System.out.println(a[i]);


        }

        init();
    }
}
