package strings;
public class oneaway {

    static boolean check(String a, String b){

        // insert a character
        // remove a character
        // replace a charcter

        String[] as = a.split("");
        String[] bs = b.split("");

        int diff = as.length - bs.length;
        if(diff > 1 || diff < -1) return false;
   
        if(diff == 0 ){
            int tolerence = 1;

            for(int x = 0 ; x < as.length; x++){
                if(as[x] != bs[x]){
                    tolerence --;
                }

            }
            if(tolerence >= 0) return true;
        }else if(diff > 0){
            int j = 0;
            for(int x = 0; x < as.length; x++){
                
                //System.out.println(as[x] + " " + bs[j] + " " +x + " " + j);
                if(!as[x].equals(bs[j])){
                    j--;
                }if(x-j > 1) return false;
                j++;
                
            }
        }else{
            int j = 0;
            for(int x = 0; x < bs.length; x++){
                
                //System.out.println(as[x] + " " + bs[j] + " " +x + " " + j);
                if(!bs[x].equals(as[j])){
                    j--;
                }if(x-j > 1) return false;
                j++;
                
            }
        }
        


        return true; 
    }

      public static void main (String[] args) {
        System.out.println(check("hello", "hetllo"));
    } 
    
}
