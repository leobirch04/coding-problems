package strings;
public class palindrome {

    static boolean palin( String str){

        String[] splitted = str.split("");

        if(str.length() % 2 != 0) return false;

        for(int i = 0; i <str.length() / 2 ; i++){
            System.out.println(splitted[i]);
            if(!splitted[i].equals(splitted[splitted.length - (i+1)])) return false;
        }

        return true;
    }
    
    public static void main (String[] args) {
        System.out.println(palin("meloppolem"));
    } 

}
