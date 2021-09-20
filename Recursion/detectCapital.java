public class detectCapital{
    public static void main(String[] args) {
        String str = "geekAsforeeks";
        char res = upper(str, 0);
        if(res == ' '){
            System.out.print("upper case letter not found");
        }
        else{
            System.out.print(res);
        }
    }

    static char upper(String str, int i){
        if (i == str.length()){
            return ' ';
        }

        char ch = str.charAt(i);
        if(ch >= 'A' && ch <= 'Z'){
            return ch;
        }

        return upper(str, i+1);
    }
}