//class MyJava{
 // public static void main (String args []){
  //  int mobile [] = {8108674628,7718944525,9594835685,9594893102,9847462883,8080467272,7345645383,8932756398,7846564739,5466987649,}
    
  //}
//}

class MyJava {
    public static void main(String[] args) {
        long[] mobileNumbers = { 9876543210L, 8765432109L, 7654321098L, 6543210987L, 5432109876L, 4321098765L,
                3210987654L, 2109876543L, 1098765432L, 1987654321L };
        int loc;
        long temp;
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            if (String.valueOf(mobileNumbers[i]).length() != 10) {
                flag = false;
            }
        }
        if (flag == true) {
            for (int i = 1; i < 9; i++) {
                temp = mobileNumbers[i];
                loc = i - 1;
                while (loc >= 0 && mobileNumbers[loc] > temp) {
                    mobileNumbers[loc + 1] = mobileNumbers[loc];
                    loc--;
                }
                mobileNumbers[loc + 1] = temp;
            }
            for (int i = 0; i < mobileNumbers.length; i++) {
                if (i >= 3 && i <= 6) {
                    System.out.println(mobileNumbers[i] + " Hello");
                } else {
                    System.out.println(mobileNumbers[i] + " Hi");
                }
            }
        }
    }
}