package strings;
public class permutations {
    
    public static boolean isPermutation(String a, String b){
        // can string a be rearanged insto string b

        String[] sa = a.split("");
        String[] sb = b.split("");

        if(sa.length != sb.length) return false;

        for (int i = 0; i < sa.length; i++){
            for(int j = 0; j < sb.length; j++){
                if(sa[i].equals(sb[j])){
                    sb[j] = "";
                    break;
                }else if(j == sb.length -1){
                    return false;
                }
            }
        }

        return true;
    }


     public static void main (String[] args) {
        System.out.println(isPermutation("string", "string"));
    } 
}
