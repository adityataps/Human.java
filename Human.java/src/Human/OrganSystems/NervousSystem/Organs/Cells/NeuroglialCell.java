package Human.OrganSystems.NervousSystem.Organs.Cells;

import Abstractions.Cell;

public class NeuroglialCell extends Cell {

    public void doAction() {
    
    
    
    }
    
    public Cell mitosis() {
    
        return new NeuroglialCell();
        
    }

}
