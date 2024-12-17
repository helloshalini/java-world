// import java.OOPs;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal(in all 4 direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right  , digonal(with 1 step))");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right )");
    }
}