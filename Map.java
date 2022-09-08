public class Map 
{
    public char[][] fullMap = new char[][] {
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 's', 's', 's', 's', 's', 's', 's', 's'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'},
        {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'}
    };
    public int mapWidth = fullMap[1].length;
    public int mapHeight = fullMap.length;
    public void getMap()
    {
        
    }
    
    public void printMap(int mapType) 
    {
        for(int yDraw = (Player.y - Player.vertViewDistance) - 1; yDraw < Player.y + Player.vertViewDistance; yDraw++) {
            for(int xDraw = (Player.x - Player.horizViewDistance) - 1; xDraw < Player.x + Player.horizViewDistance; xDraw++) {
                if(yDraw >= mapHeight || yDraw < 0 || xDraw >= mapWidth || xDraw < 0) {
                    System.out.print("\u001B[31m" + "X" + "\u001B[0m");
                } else if (xDraw + 1 == Player.x && yDraw + 1 == Player.y) {
                    System.out.print("\u001B[33m" + "Y" + "\u001B[0m");
                } else {
                    System.out.print("" + fullMap[yDraw][xDraw] + "");
                }
                
                if(xDraw + 1 >= Player.x + Player.horizViewDistance) {
                    System.out.println();
                }
            }
        }
        
        if(mapType == 1) {
            System.out.println("Path Blocked");
        } else if(mapType == 2) {
            System.out.println("Unavailable Input, Try Again");
        }
        
        Game.promptInput();
    }
}