public class Project {
    String name;
    String description;
    
    public Project() {
        super();
    }
    public Project(String name) { 
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nombre)
    {
        this.name = nombre;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String descripcion)
    {
        this.description = descripcion;
    }
    String elevatorPitch(){
        System.out.println(getName()+":" + getDescription());
        return getName() + ":" + getDescription();
    }
}
