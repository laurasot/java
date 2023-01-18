public class ProjectTest {
    public static void main(String[] args) {
        Project project = new Project();
        Project projectname = new Project("a");
        Project projectnamedescript = new Project("b", "letra");
        System.out.println(project);
        System.out.println(projectname);
        System.out.println(projectnamedescript);
        projectnamedescript.elevatorPitch();
    }
}
