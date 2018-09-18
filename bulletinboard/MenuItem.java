package bulletinboard;

//Invoker（调用者）
public class MenuItem {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

}
