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
            j,
            numLevels = 7;
        //store the entire pattern in a String variable and
        //reverse it so that it can be used again to print the bottom row
        String starPtrn = "";

        //outer loop: handles each row
        for(i = 0; i < numLevels; i++){

            //a middle loop: print (numLevels -1) spaces
            // then decreasing by 2 each time the out loop runs
            for(j = (numLevels-i); j > 1; j--){
                //print spaces
                System.out.print(" ");
                starPtrn += " ";
            }

            //inner loop: handles each column
            for(j = 0; j <= i; j++){
                //print stars
                System.out.print("* ");
                starPtrn += "* ";
            }

            //end line after each row
            System.out.println();
            starPtrn += "\n";

            //print bottom stars
        }

        System.out.println(starPtrn);


    }

}
