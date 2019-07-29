package info;

public class ToDo {
    public static String[] whatIsLeftToDo = {
            "4. ogarnac (zaczete)",
            "5. ogarnac (cale)",
            "6. solid - olać",
            "7. grafika - olać",
            "8. wątki - ogarnąć",
            "9. aplikacje sieciowe - ogarnac (zaczete)",
            "10. SQL/BD - ogarnac (zaczete)",
            "11. calc - nie obowiazuje",
            "12. refleksja - olać"
    };

    public static String[] getWhatIsLeftToDo() {
        return whatIsLeftToDo;
    }

    public static void setWhatIsLeftToDo(String[] whatIsLeftToDo) {
        ToDo.whatIsLeftToDo = whatIsLeftToDo;
    }

    public static String getWhatIsLeftToDo2String() {
        String builtString = null;
        for ( String entry : whatIsLeftToDo ) {
            if( builtString == null || builtString.isEmpty() || builtString.isBlank() ) {
                builtString = "{ ";
            }
            else {
                builtString += ", ";
            }
            builtString += "\"" + entry + "\"";
        }
        builtString += " }";
        return builtString;
    }

    public static void printWhatIsLefttoDo() {
        System.out.println(getWhatIsLeftToDo2String());
    }
}
