package Human.OrganSystems.NervousSystem.Organs.Cells;

import Abstractions.Cell;

public abstract class Neuron extends Cell {
    
    boolean isPostsynaptic;
    boolean isPresynaptic;
    
    public void doAction() {
    
    
    
    }
    
    //public abstract Cell mitosis();
    
    private abstract class Components {
    
        abstract void doAction();
    
    }
    
    private class Soma extends Components {
        
        void doAction(){}
        
    }
    
    private class Dendrite extends Components {
        
        void doAction(){}
        
    }
    
    private class Axon extends Components {
        
        void doAction(){}
        
    }
    
    private class AxonTerminal extends Components {
        
        void doAction(){}
        
    }
    
    private class AfferentNeuron extends Neuron {
        
        public AfferentNeuron() {
        
        
        
        }
        
        public Cell mitosis() {
            
            return new NeuralStemCell();
            
        }
    
    }
    
    private class EfferentNeuron extends Neuron {
        
        public EfferentNeuron() {
        
        
        
        }
    
        public Cell mitosis() {
        
            return null;
        
        }
    
    }
    
    private class Interneuron extends Neuron {
        
        public Interneuron() {
        
        
        
        }
    
        public Cell mitosis() {
        
            return null;
        
        }
    
    }

}
