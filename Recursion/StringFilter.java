public class StringFilter{
    public static void main(String[] args){
        String str = "nikhil";
        int i=0;
        String res = "";
        System.out.println(sort(str, i, res));
    }

    static String sort(String str, int i, String res) {
        if(i == str.length()){
            return res;
        }
        if(str.charAt(i) == 'i'){
            return sort(str, i+1, res);
        }
        else{
            res = res + str.charAt(i);
            return sort(str, i+1, res);
        }
    }
}