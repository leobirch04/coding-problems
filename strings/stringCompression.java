package strings;

public class stringCompression {
    static String compress(String input){

        StringBuilder str = new StringBuilder();
        String[] splitted = input.split("");

        int count = 1;
        

        for(int i = 0; i < splitted.length -1; i++){
            if(!splitted[i].equals(splitted[i+1])){
                str.append(splitted[i] + count);
                count = 1;
            }else{
                count++;
            }
        }
        str.append(splitted[splitted.length -1] + count);

        return str.toString();
    }

    public static void main (String[] args) {
        System.out.println(compress("aaaabbbbbccdddee"));
    } 
}
