public class stringRotation {

    static String[] rotate(String[] str){
        String last = str[str.length -1];
        String next = str[0];
        for(int x = 0; x < str.length -1; x++){
            String temp = str[x + 1];
            str[x + 1] = next;
            next = temp;
        }
        str[0] = last;

        return str;
    }

    static boolean check(String s1, String s2){
        String[] spl1 = s1.split("");
        String[] spl2 = s2.split("");
        for(int x = 0; x < spl1.length; x++){
            int count = 0;
            for(int i = 0; i < spl1.length; i++){
                if(spl1[i].equals(spl2[i])){
                    count ++;
                }
            }
            if(count == spl1.length) return true;
            spl1 = rotate(spl1);
        }

        return false;
    }

    public static void main (String[] args) {
     
        System.out.println(check("petwasa","wasupet"));
    } 
}
