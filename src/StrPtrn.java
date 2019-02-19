import com.sun.deploy.util.StringUtils;


public class StrPtrn {
    /**
     * @param str string to repeat
     * @param times repeat str times time
     * @return generated string
     */
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public static void main(String[] args){


        int i,
            k,
            j;

        //go through each row
        for(i = 0; i < 7; i += 2) {
            //leave a corresponding number of empty spaces
            for(k = 6; k > 0; k += 2){
                System.out.print(" ");

            }

            if(i ==0){
                System.out.print("      ");
            }
            if(i ==2){
                System.out.print("    ");
            }
            if(i ==4){
                System.out.print("  ");
            }
            //print actual asterisk
            for(j = 0; j <= i; j++){

                System.out.print("* ");
            }
            //insert a newline after each row
            System.out.println();
        }


    }

}
