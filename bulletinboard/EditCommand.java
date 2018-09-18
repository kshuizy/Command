package bulletinboard;

public class EditCommand implements Command {

    private BoardScreen boardScreen = null;

    public EditCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    public void execute() {
        boardScreen.edit();
    }
}
