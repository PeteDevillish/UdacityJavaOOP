public class Queen extends Bishop {
        boolean isValidMove(Position newPosition){
//            if(Math.abs(newPosition.column - this.column == Math.abs(newPosition.row - this.row)) ||
            if(newPosition.column == this.column || newPosition.row == this.row)
                return true;
            else
                return false;
        }

}
