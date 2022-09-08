public class Game
{
    public static Scanner getInput = new Scanner(System.in);
    
    public static Map map = new Map();
    
    public static HashMap<Character, Tile> tileMap = new HashMap<Character, Tile>();
    
    public static TileSet tileSet = new TileSet();
    
    public static void main(String[] args)
    {
        start();
    }
    
    public static void start()
    {
        System.out.println("Welcome!");
        System.out.println("S - Start");
        
        //  get user input for welcome screen prompt
        String input = getInput.nextLine();
        //  check the input
        if ("s".equals(input.toLowerCase()) || "start".equals(input.toLowerCase())) {
            System.out.print("\033[H\033[2J");
            map.printMap(0);
        } else {
            System.out.print("\033[H\033[2J");
            System.out.println("Unavailable Input, Try Again");
            start();
        }
    }
    
    public static void promptInput()
    {
        System.out.println("What would you like to do?");
        System.out.println("u - up | d - down | l - left | r - right | i - info | o - more options");
        
        String input = getInput.nextLine();
        if ("u".equals(input.toLowerCase()) || "up".equals(input.toLowerCase())) {
            if (checkPosAvailable(1, 1)) {
                System.out.print("\033[H\033[2J");
                Player.y--;
                map.printMap(0);
            } else {
                System.out.print("\033[H\033[2J");
                map.printMap(1);
            }
        } else if ("d".equals(input.toLowerCase()) || "down".equals(input.toLowerCase())) {
            if (checkPosAvailable(1, 3)) {
                System.out.print("\033[H\033[2J");
                Player.y++;
                map.printMap(0);
            } else { 
                System.out.print("\033[H\033[2J");
                map.printMap(1);
            }
        } else if ("l".equals(input.toLowerCase()) || "left".equals(input.toLowerCase())) {
            if (checkPosAvailable(1, 4)) {
                System.out.print("\033[H\033[2J");
                Player.x--;
                map.printMap(0);
            } else { 
                System.out.print("\033[H\033[2J");
                map.printMap(1);
            }
        } else if ("r".equals(input.toLowerCase()) || "right".equals(input.toLowerCase())) {
            if (checkPosAvailable(1, 2)) {
                System.out.print("\033[H\033[2J");
                Player.x++;
                map.printMap(0);
            } else { 
                System.out.print("\033[H\033[2J");
                map.printMap(1);
            }
        } else if ("o".equals(input.toLowerCase()) || "options".equals(input.toLowerCase())) {
            System.out.print("\033[H\033[2J");
            System.out.println();
            System.out.println("u - up | d - down | l - left | r - right | o - more options");
            map.printMap(0);
        } else if ("i".equals(input.toLowerCase()) || "information".equals(input.toLowerCase())) {
            System.out.print("\033[H\033[2J");
            tileMap.get(map.fullMap[Player.y][Player.x]).printInfo();
            map.printMap(0);
        } else {
            System.out.print("\033[H\033[2J");
            map.printMap(2);
        }
    }
    
        public static boolean checkPosAvailable(int speed, int direction)
    {
        //  limits for the map vertically
        if (direction == 1 && Player.y - speed <= 0) {
            return false;
        } else if (direction == 2 && Player.x + speed > map.mapWidth) {
            return false;
        } else if (direction == 3 && Player.y + speed > map.mapHeight) {
            return false;
        } else if (direction == 4 && Player.x - speed <= 0) {
            return false;
        } else { return true; }
    }
}