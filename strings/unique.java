package strings;
public class unique {

    public static boolean un(String str) { //Function to check if all characters in a string are unique

        String[] split = str.split(""); 
        
        for (int i= 0; i < split.length; i++){
            for(int j = i +1; j < split.length; j++ ){
                if (split[i].equals(split[j])){
                    return false;
                }
            }
        }

        return true;
    }



    public static void main (String[] args) {
        System.out.println(un("string"));
    } 
}