package Human;

//import Abstractions.Organ;
import Abstractions.OrganSystem;
import Human.OrganSystems.CardiovascularSystem.CardiovascularSystem;
import Human.OrganSystems.DigestiveSystem.DigestiveSystem;
import Human.OrganSystems.EndocrineSystem.EndocrineSystem;
import Human.OrganSystems.IntegumentarySystem.IntegumentarySystem;
import Human.OrganSystems.LymphaticSystem.LymphaticSystem;
import Human.OrganSystems.MuscularSystem.MuscularSystem;
import Human.OrganSystems.NervousSystem.NervousSystem;
import Human.OrganSystems.RenalSystem.RenalSystem;
import Human.OrganSystems.ReproductiveSystem.ReproductiveSystem;
import Human.OrganSystems.RespiratorySystem.RespiratorySystem;
import Human.OrganSystems.SkeletalSystem.SkeletalSystem;

public class Human {
    
    private String name;
    private int age;
    private char sex;
    
    private OrganSystem cardiovascularSystem;
    private OrganSystem digestiveSystem;
    private OrganSystem endocrineSystem;
    private OrganSystem integumentarySystem;
    private OrganSystem lymphaticSystem;
    private OrganSystem muscularSystem;
    private OrganSystem nervousSystem;
    private OrganSystem renalSystem;
    private OrganSystem reproductiveSystem;
    private OrganSystem respiratorySystem;
    private OrganSystem skeletalSystem;
    
    
    public Human(String name, int age, char sex) {
    
        this.name = name;
        this.age = age;
        this.sex = sex;
        
        cardiovascularSystem = new CardiovascularSystem();
        digestiveSystem = new DigestiveSystem();
        endocrineSystem = new EndocrineSystem();
        integumentarySystem = new IntegumentarySystem();
        lymphaticSystem = new LymphaticSystem();
        muscularSystem = new MuscularSystem();
        nervousSystem = new NervousSystem();
        renalSystem = new RenalSystem();
        reproductiveSystem = new ReproductiveSystem(sex);
        respiratorySystem = new RespiratorySystem();
        skeletalSystem = new SkeletalSystem();
        
    }
    
    public Human() {
        
        this("John Doe", 20, 'M');
        
    }
    
}
