import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args){
        LOGGER.info("Switch on computer and play movie");
        Computer computer = new Computer(new Video());
        computer.runTask();

        LOGGER.info("Find music");
        computer.setNewTask(new Music());
        computer.runTask();

        LOGGER.info("Find game");
        computer.setNewTask(new Game());
        computer.runTask();

        // Java 8
        Computer functionalComputer = new Computer(
                () -> LOGGER.info("Write program")
        );
        functionalComputer.runTask();

        functionalComputer = new Computer(
                () -> LOGGER.info("Execute some code")
        );
        functionalComputer.runTask();
    }
}
