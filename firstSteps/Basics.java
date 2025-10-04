public class Basics {
    public static void main(String[] args) {
        //print format
        System.out.println("Hello world");
        //----------------------------------------
    
        //variables - the name can be repeated-----------
        String name = "Fefe";
        int a = 10;
        char b = 'b';
        double number = 1.2034;
        float number1 = 1.23f; //only takes two decimals
        boolean condition = true; //or false
        //----------------------------------------------
    
        //logic operators------------------------------
        /*
        && and
        || or
        ! not
        % remainder
        */
        //--------------------------------------------

        //relacional operators--------------------
        /*
        == equal
        != different
        > greater than
        < lesser than
        >= greater than or equal
        <= lesser than or equal
        */
        //----------------------------------------

        //Condicionals----------------------------
        if(condition1) {
            System.out.println(condition1);
        } else if (condition2) {
            System.out.println(condition1);
        } else {
            System.out.println(3);
        }
        //----------------------------------------

        //Repetitions--------------------------------
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }

        int i = 0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        //do while the function is executed at least once
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<5);
        //----------------------------------------

        //vectors
        String names[] = new String[3];
        for (int i = 0; i<3; i++) {
            System.out.println(names[i]);
        }
    }
}
