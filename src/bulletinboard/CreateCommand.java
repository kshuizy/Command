package bulletinboard;

public class CreateCommand implements Command {

    private BoardScreen boardScreen = null;

    public CreateCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    public void execute() {
        boardScreen.create();
    }
}
