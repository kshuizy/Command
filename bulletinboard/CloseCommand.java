package bulletinboard;

public class CloseCommand implements Command{

    //应该把创建接受者对象放到客户端，否则一旦请求过多，内存占用也多
    BoardScreen boardScreen = null;

    public CloseCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    public void execute() {
        boardScreen.close();
    }
}
