public class Main {

    public static void main(String[] args) {
        final String functionName = "main()";
        final String location = Main.class.getName() + " >>> " + functionName;
        utils.PrintSystem.outBegin( location );

        menu.Menu.main();

        utils.PrintSystem.outEnd( location );
    }

}
