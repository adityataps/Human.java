package Human.OrganSystems.ReproductiveSystem;

import Abstractions.Organ;
import Abstractions.OrganSystem;
import Human.OrganSystems.ReproductiveSystem.Organs.*;

public class ReproductiveSystem extends OrganSystem {
    
    private Organ penis;
    private Organ testes;
    
    private Organ vagina;
    private Organ ovaries;
    
    
    public ReproductiveSystem(char sex) {
    
        if (sex == 'M') {
        
            penis = new Penis();
            testes = new Testes();
        
        } else if (sex == 'F') {
            
            vagina = new Vagina();
            ovaries = new Ovaries();
            
        }
    
    }
    
}
