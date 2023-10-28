public class Main {
    public static void main(String[] args) {

    DeveloperFactory factory = new DeveloperFactory();

    Developer javaScriptDeveloper = factory.getDeveloper("JavaScript");
    javaScriptDeveloper.develop();
    javaScriptDeveloper.debug();

    Developer pythonDeveloper = factory.getDeveloper("Python");
    pythonDeveloper.develop();
    pythonDeveloper.debug();

    }
}
