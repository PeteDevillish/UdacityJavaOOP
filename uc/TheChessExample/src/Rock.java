public class Rock extends Piece{
    private int column;
    private int row;

    boolean isValidMove(Position newPosition){
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}
