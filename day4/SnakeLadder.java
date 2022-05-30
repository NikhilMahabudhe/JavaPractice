package day4;

import java.util.Random;

class SnakeLadder {
    static final int STARTINGPOSITION = 0;
    static final int ENDINGPOSITION = 100;
    static Random RANDOM = new Random();
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int NOPLAY = 0;
    static String TASK;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    SnakeLadder() {
    }

    public int GamePlayed(int var1, int var2) {
        if (var1 < 100) {
            int var3 = RANDOM.nextInt(6) + 1;
            int var4 = RANDOM.nextInt(3);
            switch (var4) {
                case 0:
                    var1 = var1;
                    TASK = "noPlay";
                    break;
                case 1:
                    if (var1 + var3 <= 100) {
                        var1 += var3;
                        TASK = "Ladder";
                    }
                    break;
                case 2:
                    if (var1 - var3 >= 0) {
                        var1 -= var3;
                        TASK = "Snake";
                    }
            }

            System.out.println(" | Dice: " + var3 + " for " + TASK + " and Current Position : " + var1 + "| ");
        }

        if (TASK == "Ladder" && var1 != 100) {
            var2 = this.dice_Player(var2);
            this.GamePlayed(var1, var2);
        }

        return var1;
    }

    public int dice_Player(int var1) {
        ++var1;
        return var1;
    }

    public void TwoPlayers() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        System.out.println("Game Started by two player");

        while(var1 < 100 && var2 < 100) {
            System.out.println("Player 1 :-  ");
            var1 = this.GamePlayed(var1, var3);
            var3 = this.dice_Player(var3);
            System.out.println("-------------------------------------------------------------------------------------------------- ");
            if (var1 == 100) {
                break;
            }

            System.out.println("Player 2 :-  ");
            var2 = this.GamePlayed(var2, var3);
            var3 = this.dice_Player(var3);
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        if (var1 == 100) {
            System.out.println();
            System.out.println("Player 1 Won The Match ");
        } else if (var2 == 100) {
            System.out.println();
            System.out.println("Player 2 Won The Match ");
        }

        System.out.println("Total Dice Count of both Players " + var3);
    }

    public static void main(String[] var0) {
        SnakeLadder var1 = new SnakeLadder();
        var1.TwoPlayers();
    }
}