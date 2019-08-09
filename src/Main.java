import info.ToDo;
import laboratories.lab1.Lab1_main;

public class Main {

    public static void main(String[] args) {
        final String functionName = "main()";
        final String location = Main.class.getName() + " >>> " + functionName;
        utils.PrintSystem.outBegin( location );

        ToDo.printWhatIsLefttoDo();
        Lab1_main.main();
        java8.func.lambda.LambdaExamples.main();

        utils.PrintSystem.outEnd( location );
    }
}
