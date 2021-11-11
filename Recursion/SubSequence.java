public class SubSequence{
    public static void main(String[] args){
        combinations("", "abc");
    }

    static void combinations(String p, String un){
        if(un.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = un.charAt(0);
        combinations(p+ch, un.substring(1));
        combinations(p, un.substring(1));
    }
}