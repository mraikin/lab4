import comp102x.ColorImage;
import comp102x.Canvas; 

/**
 * The Choice class represents a choice made by the player or the computer.
 * It can be either "rock", "paper", or "scissors".
 */
public class Choice
{
    private int type; //stores the choice type: 0=rock, 1=paper, 2=scissors
    private ColorImage choiceImage; //stores the image to be displayed on the canvas
    
    /**
     * The constructor
     * 
     * @param   type   the choice type to be represented by this Choice object
     */
    public Choice(int type)
    {
        //initialize the "type" instance varialble
        this.type = type;
    }
    
    /**
     * Get a number that represents the choice type
     * 
     * @return  a number that represents the choice type: 0=rock, 1=paper, 2=scissors
     */
    public int getType()
    {
        return type;
    }
    
    /**
     * Compare "this" with anotherChoice
     * 
     * @param   anotherChoice   the choice to be compared
     * @return  either 1, -1, or 0 which indicates the comparison result: 1 means "this" wins anotherChoice; -1 means "this" loses to anotherChoice; 0 means "this" and anotherChoice are the same
     */
    public int compareWith(Choice anotherChoice)
    {
        // write your code after this line
        int ret = 0;
        switch (this.type){
            case 0: 
                    if (anotherChoice.type == 0) {ret = 0;}
                    if (anotherChoice.type == 1) {ret = -1;}
                    if (anotherChoice.type == 2) {ret = 1;}
                    break;
            case 1: 
                    if (anotherChoice.type == 0) {ret = 1;}
                    if (anotherChoice.type == 1) {ret = 0;}
                    if (anotherChoice.type == 2) {ret = -1;}
                    break;
            case 2: 
                    if (anotherChoice.type == 0) {ret = -1;}
                    if (anotherChoice.type == 1) {ret = 1;}
                    if (anotherChoice.type == 2) {ret = 0;}
                    break;                   
        }
        return ret;

    }
    
    /**
     * Draw the choice image (rock/paper/scissors) on the given canvas
     * 
     * @param   canvas      the canvas to draw on
     * @param   x           the x-position of the choice image to be drawn
     * @param   y           the y-position of the choice image to be drawn
     * @param   rotation    the rotation of the choice image to be drawn
     */ 
    public void draw(Canvas canvas, int x, int y, int rotation)
    {
       // write your code after this line
       
       switch (this.type) {
           case 0:
               this.choiceImage = new ColorImage("rock.png");
               break;
           case 1:
               this.choiceImage = new ColorImage("paper.png");
               break;
           case 2:
               this.choiceImage = new ColorImage("scissors.png");
               break;
    }
        this.choiceImage.setX(x);
        this.choiceImage.setY(y);  
        this.choiceImage.setRotation(rotation);
        canvas.add(this.choiceImage,x,y);      
       
       
    }
}
