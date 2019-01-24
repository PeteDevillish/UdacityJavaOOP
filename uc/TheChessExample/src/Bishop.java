public class Bishop extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {
        if(Math.abs(newPosition.column - this.column == Math.abs(newPosition.row - this.row)){
            return true;
        }
        else
            return false;
    }

    boolean move(Position newPosition){
        if(isValidMove(Position newPosition)){
            this.column = newPosition.column;
            this.row = newPosition.row;

        }
}
