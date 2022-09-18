
    class ReverseInteger {
        public static void main(String[] args) {
            int r=123345;
            System.out.println(reverse(r));
        }
        public static int reverse(int num){
            String number =Integer.toString(num);
            String newNum ="";
            for(int i=number.length();i>=0;i--){
                newNum += number.charAt(i);
            }
            return Integer.parseInt(newNum);
        }
    }


