public class No04_ReplaceSpaceInString {

    public static String testString = "You need to replace all spaces inside this string with '%20',and the time complexity has to be O(n)";

    public static void main(String[] args){

    }


    private String replaceSpace(char[] originString){
        int spaceCount = 0;

        for(int i = 0;i < originString.length; i++){
             if(originString[i] == ' '){
                 spaceCount++;
             }
         }
        return "";
    }



}
