package superkeyword;

public class Child extends Father{

    //
    public Child(){
        super(20);

    }

    //super keyword in method
    public void higherEducation() {
        super.education();
    }

    //]super keyword in variable
    public void athleticSkills(){
        int numberOfSport = super.numberOfSport;
        System.out.println("child is practicing "+numberOfSport+" sport");
    }
}
