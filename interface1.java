public class interface1 {
    public static void main(String agrs[]){
Queen q= new Queen();
q.moves();
Rook r= new Rook();
r.moves();

    }

    
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up ,down, left, right, diagonal(in all direction)");

    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up ,down, left, right, diagonal");
        
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up ,down, left, right, diagonal(by 1 steps)");
        
    }
}

