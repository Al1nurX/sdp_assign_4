public class DeveloperFactory {
    public Developer getDeveloper(String type) {
        if ("JavaScript".equalsIgnoreCase(type)) {
            return new JavaScriptDeveloper();
        } else if ("Python".equalsIgnoreCase(type)) {
            return new PythonDeveloper();
        }
        throw new IllegalArgumentException("Invalid developer type");
    }
}
