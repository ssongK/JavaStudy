package ch06;

public class Exercise9_9 {
    static String delChar(String src, String delCh){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<src.length();i++){
            String s = Character.toString(src.charAt(i));
            if(delCh.indexOf(s)==-1){
                sb.append(s);
            }   
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1  2    3    4\t5)"+" -> "+delChar("(1  2    3    4\t5)","\t"));

    }
}
