package strings;
public class urlify {

    static char[] replace(char[] chars){  // replace all spaces with %20
        for (int i=0 ; i < chars.length -1; i++){
            
            if(chars[i] == ' '){

                char current = chars[i + 1];

                for(int x = 0; x < 2; x++){
                    for(int j = i + 1; j < chars.length - 2; j++){

                    int targetP = j + 1 ;
                    char next = chars[targetP];

                    chars[targetP] = current;
                    current = next;

                }
            }

                chars[i] = '%';
                chars[i+1] = '2';
                chars[i+2] = '0';

            }

        }



        return chars;
    }

    public static void main (String[] args) {

        char[] ins = "hello st mary the third               ".toCharArray();
        System.out.println(new String(replace(ins)));
    } 
    
}
