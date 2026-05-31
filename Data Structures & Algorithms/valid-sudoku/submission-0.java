class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0 ; i < board.length; i++){
            List<Character> rowList = new ArrayList<>();
            List<Character> colList = new ArrayList<>();
            for(int j = 0; j < board[i].length; j++){
                //row
                if (board[i][j] != '.') {
                    if (rowList.contains(board[i][j])) {
                        return false;
                    } else {
                        rowList.add(board[i][j]);
                    }
                }
                //col
                if(board[j][i] != '.'){
                    if (colList.contains(board[j][i])) {
                        return false;
                    } else {
                        colList.add(board[j][i]);
                    }
                }
            }
        }


        for(int boxRow = 0 ; boxRow < board.length; boxRow+=3){
            for(int boxCol = 0; boxCol < board[boxRow].length; boxCol+=3){
                List<Character> boxList = new ArrayList<>();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        char current = board[boxRow + i][boxCol + j];
                        if(current != '.'){
                            if(boxList.contains(current)){
                                return false;
                            }else{
                                boxList.add(current);
                            }
                        }
                    }
                }
            }
        }    


        return true;
    }
}
