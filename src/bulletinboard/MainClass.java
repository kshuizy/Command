package bulletinboard;


//与MenuItem和Command关联
/*1. 确实可以两个类来搞定。但我们要牢记命令模式的初衷：
对命令请求者（Invoker）和命令实现者（Receiver）的解耦，方便对命令进行各种控制。

 */
public class MainClass {

    public static void main(String[] args) {

        BoardScreen bs = new BoardScreen();

        Command command = new OpenCommand(bs);
        Command command2 = new CreateCommand(bs);
        Command command3 = new EditCommand(bs);
        Command command4 = new CloseCommand(bs);

        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        MenuItem menuItem3 = new MenuItem();
        MenuItem menuItem4 = new MenuItem();
        menuItem1.setCommand(command2);
        menuItem2.setCommand(command3);
        menuItem3.setCommand(command);
        menuItem4.setCommand(command4);

        Menu menu = new Menu();
        menu.addMenu(menuItem1);
        menu.addMenu(menuItem2);
        menu.addMenu(menuItem3);
        menu.addMenu(menuItem4);

        menu.run();


    }


}
