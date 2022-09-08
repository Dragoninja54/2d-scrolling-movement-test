public class Tile {
    public String id;
    public String name;
    public char mapDisplay;
    
    public String color;
    
    public boolean walkable = true;
    
    
    public Tile(String idInput, String nameInput, char mapDisplayInput, String colorInput) {
        this.id = idInput;
        this.name = nameInput;
        this.mapDisplay = mapDisplayInput;
        this.color = colorInput;
        
        Game.tileMap.put(this.mapDisplay, this);
    }
    
    public void printInfo() {
        System.out.println("(" + this.mapDisplay + ", " + this.id + ") " + this.name);
    }
}