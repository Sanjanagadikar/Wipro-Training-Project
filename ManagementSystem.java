
interface Manageable {
    void manage();
}

class Entity implements Manageable {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void manage() {
        System.out.println("Managing entity: " + name);
    }
}

class Employee extends Entity {
    private String position;

    public void setPosition(String position) {
        this.position = position;
    }

    public void manage() {
        System.out.println("Managing employee: " + name + ", Position: " + position);
    }
}

class Department extends Entity {
    public void manage() {
        System.out.println("Managing department: " + name);
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        Manageable[] entities = new Manageable[4];
        Employee emp1 = new Employee();
        emp1.setName("Employee1");
        emp1.setPosition("Developer");
        entities[0] = emp1;

        Employee emp2 = new Employee();
        emp2.setName("Employee2");
        emp2.setPosition("Manager");
        entities[1] = emp2;

        Department dept1 = new Department();
        dept1.setName("IT");
        entities[2] = dept1;

        Department dept2 = new Department();
        dept2.setName("HR");
        entities[3] = dept2;

        for (Manageable entity : entities) {
            entity.manage();
        }
    }
}
