package FinalProject;
// преобразовать в int не удалось  ---  Unchecked

public class MyArrayDataException extends MyArrayException {
    private int row;
    private int column;

    public MyArrayDataException(int row, int column) {
        super();
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column; 
    }
}
