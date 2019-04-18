package Abstractions;

/**
 * Cell.java
 *
 * Provides an abstract class for all types of cells.
 * @author Aditya Tapshalkar
 *
 * -----------------------------------------------------------------------------
 *
 * Cells are the basic building blocks of the human body (and all organisms).
 * We are made up of trillions of cells, each accomplishing different tasks.
 * Organelles are specialized structures that can perform specific and
 * specialized tasks within the cell.
 *
 * Cells perform functions that are essential to life:
 * - Cells provide structure and support, like bricks to a house
 * - Cells allow for growth via mitosis
 * - Cells produce energy for the body
 * - Cells aid in reproduction via meiosis
 * - Cells undergo metabolic reactions
 *
 * Albeit small, cells play a big role in our bodies.
 *
 * -----------------------------------------------------------------------------
 */

public abstract class Cell {

    private String cellType;
    private int numNuclei;
    private int numMitochondria;
    
    public String getCellType() {
        
        return cellType;
        
    }
    
    public void setCellType(String cellType) {
        
        this.cellType = cellType;
        
    }
    
    public int getNumNuclei() {
        
        return numNuclei;
        
    }
    
    public void setNumNuclei(int numNuclei) {
        
        this.numNuclei = numNuclei;
        
    }
    
    public int getNumMitochondria() {
        
        return numMitochondria;
        
    }
    
    public void setNumMitochondria(int numMitochondria) {
        
        this.numMitochondria = numMitochondria;
        
    }
    
    public abstract void doAction();
    
    public abstract Cell mitosis();
    
    private abstract class Organelle {
    
        abstract void doAction();
        
    }
    
    private class PlasmaMembrane extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class Cytoskeleton extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class Nucleus extends Organelle {
    
        void doAction() {



        }
        
    }
    
    private class Mitochondria extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class RoughEndoplasmicReticulum extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class SmoothEndoplasmicReticulum extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class GolgiBodies extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    
    private class Ribosome extends Organelle {
        
        void doAction() {
        
        
        
        }
        
    }
    

}
