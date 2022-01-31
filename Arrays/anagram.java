public class anagram{
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.print(optimised(str));
    }

    //not much efficient time complexity O(n * m);
    static boolean res(String str){
        String temp = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<temp.length();i++){
            char ch = temp.charAt(i);
            if(str.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }

    static boolean optimised(String str){
        for(char ch='a'; ch<='z'; ch++){
            if(!str.contains(ch + "")){
                return false;
            }
        }
        return true;
    }
}