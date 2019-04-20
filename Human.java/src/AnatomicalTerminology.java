public class AnatomicalTerminology {

    private enum Region {
        
        ANTERIOR("Anterior"),                   //0
        POSTERIOR("Posterior"),                 //1
        SUPERIOR("Superior"),                   //2
        INFERIOR("Inferior"),                   //3
        PROXIMAL("Proximal"),                   //4
        DISTAL("Distal"),                       //5
        SUPERFICIAL("Superficial"),             //6
        DEEP("Deep"),                           //7
        MEDIAL("Medial"),                       //8
        LATERAL("Lateral"),                     //9
        VENTRAL("Ventral"),                     //10
        DORSAL("Dorsal");                       //11
    
        String name;
    
        Region(String name) {
            
            this.name = name;
            
        }
        
    }

}
