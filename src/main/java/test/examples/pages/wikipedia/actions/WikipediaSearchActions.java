package test.examples.pages.wikipedia.actions;

import java.util.ArrayList;

public class WikipediaSearchActions {

    public static final String ONE = "one";
    public static final String TWO_AGAIN= "two";

    String outer = "outer";
    WikipediaSearchActions instance = new WikipediaSearchActions();
    Inner inner = new WikipediaSearchActions.Inner();

    public boolean isLoggedInUsingConstant (String login, String password){
        boolean isSuccess;
        switch (login) {
            case ONE:
                isSuccess = true;
                break;
            case TWO_AGAIN:
                isSuccess = false;
                break;
            default:
            isSuccess = false;
                break;
        }
        return isSuccess;
    }

    public boolean isLoggedInUsingEnum (AValues values, String password){
        switch (values.getDescription()) {
            case "dog":
                return true;
            case "aaaa":
                return false;
            case "bolt":
                return false;
            default:
                return false;
        }
    }

    static class Inner {
        String inner = "inner";
        void dos (){
            System.out.println("DOOO");
//            List<String> arrayList = Arrays.asList("one", "two", "three");
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add("one");
        }
        static void staticDos(){
            System.out.println("STATIC DOOO");
        }
        private <T> String returnString(T input){
            return String.valueOf(input);
        }
    }

    enum Types {
        ONE, TWO, THREE;

        String[] strings = {"one", "two"};
        StringBuilder builder = new StringBuilder("a");
        String made (String a){
            builder.append("a");
            builder.toString();
            return builder.toString();
        }
    }

    enum AValues{
        FIRST("dog"),
        THIRD("aaaa"),
        FIFTH("bolt");

        AValues(String description) {
            this.description = description;
        }
        private String description;

        public String getDescription() {
            return description;
        }
    }
}

class Second {

    Integer integer;
    String second = "second";
}
