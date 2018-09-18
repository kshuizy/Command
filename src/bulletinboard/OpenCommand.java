package bulletinboard;

//ConcreteCommand（具体命令类）
public class OpenCommand implements Command {

    private BoardScreen boardScreen = null;

    public OpenCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    public void execute() {
        boardScreen.open();
    }

}
