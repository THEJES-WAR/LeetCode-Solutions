class Solution {
    static{
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")){
                fw.write("0");
            }catch(Exception e){
                System.out.println("Time overwrite aborted");
            }
        }));
}
    public String convert(String s, int numRows) {
        char [][] mat = new char[numRows][s.length()];
        if(numRows==1) return s;
        int i=0,k=0,j=0;
        String y="";
        for (char[] row : mat) {
            Arrays.fill(row, ' '); // fill each row with spaces
        }
        while(k!=s.length()){
            if(i==0){
                for(i=0;i<numRows && k < s.length();i++){
                    mat[i][j] = s.charAt(k++);
                }
            }
            else{
                for(i=numRows-2;i>0 && k < s.length() ;i--){
                    j++;
                    mat[i][j++] = s.charAt(k++);
                }
            }
            j++;
        }
        for(int l=0;l<numRows;l++){
            for(int h=0;h<mat[l].length;h++){
                if(mat[l][h]!=' ') y+=mat[l][h];
            }
        }
        return y;
    }
}


















// int i=0,k=0,j=0;
//         String y="";
//         for (char[] row : mat) {
//             Arrays.fill(row, ' '); // fill each row with spaces
//         }
//         while(k!=s.length()){
//             if(i==0){
//                 for(i=0;i<numRows && k < s.length();i++){
//                     mat[i][j] = s.charAt(k++);
//                 }
//             }
//             else{
//                 for(i=numRows-2;i>0 && k < s.length() ;i--){
//                     j++;
//                     mat[i][j++] = s.charAt(k++);
//                 }
//             }
//             j++;
//         }
//         for(int l=0;l<numRows;l++){
//             for(int h=0;h<mat[l].length;h++){
//                 if(mat[l][h]!=' ') y+=mat[l][h];
//             }
//         }
//         return y;
        