package plusOne;

public class plusOne66 {
    public plusOne66() {
    }

    public int[] plusOne(int[] digits) {
        int arrayLength = digits.length;
        boolean carry = true;
        int i = arrayLength -1;
        while(carry && i>-1){
            if(digits[i] < 9){
                digits[i] ++;
                carry= false;
            }else{
                digits[i] = 0;
                carry = true;
            }
            i--;
        }
        if(carry) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }

}
