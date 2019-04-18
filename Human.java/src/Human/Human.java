package Human;

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
    
    private CardiovascularSystem cardiovascularSystem;
    private DigestiveSystem digestiveSystem;
    private EndocrineSystem endocrineSystem;
    private IntegumentarySystem integumentarySystem;
    private LymphaticSystem lymphaticSystem;
    private MuscularSystem muscularSystem;
    private NervousSystem nervousSystem;
    private RenalSystem renalSystem;
    private ReproductiveSystem reproductiveSystem;
    private RespiratorySystem respiratorySystem;
    private SkeletalSystem skeletalSystem;
    
    
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
        reproductiveSystem = new ReproductiveSystem();
        respiratorySystem = new RespiratorySystem();
        skeletalSystem = new SkeletalSystem();
        
    }
    
    public Human() {
        
        this("John Doe", 20, 'M');
        
    }
    
}
