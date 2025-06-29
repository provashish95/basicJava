package problems_solving;

public class Box {
    double height, width, depth; 
    
//    Box(double h, double w, double d){
//        height = h; 
//        width = w; 
//        depth = d; 
//    }
    
    
    //This keyword...
    Box(double height, double width, double depth){
        this.height = height; 
        this.width = width; 
        this.depth = depth; 
    }
    
    void displayVol(){
        double vol = height * width * depth; 
        System.out.println("Volumn: "+ vol);
    }
}
