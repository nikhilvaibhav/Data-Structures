public class StringFilter{
    public static void main(String[] args){
        sort("", "nikhil");
    }

    static void sort(String p,  String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'i'){
            sort(p, up.substring(1));
        }
        else{
            sort(p+ch, up.substring(1));
        }
    }
}