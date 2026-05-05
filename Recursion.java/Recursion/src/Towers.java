public class Towers {
    private int numDiscs; // Number of discs

    public Towers(int n) {
        this.numDiscs = n;
        // Move numDiscs from peg 1 to peg 3 using peg 2 as temporary
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            // Recursive call - creates another whole copy of method in RAM
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}