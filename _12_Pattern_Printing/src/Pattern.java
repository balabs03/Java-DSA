public class Pattern {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int totalCol = 0;
        for (int row = 1; row <= (2*n)-1 ; row++) {
            if(row <= n){
                totalCol = row;
            }else{
                totalCol--;
            }
            for (int col = 1; col <= totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        int totalCol = 0;
        for (int row = 1; row <= (2*n)-1 ; row++) {
            if(row <= n){
                totalCol = row;
            }else{
                totalCol--;
            }
            int spaces = n - totalCol - 1;
            for (int spa = 1; spa <= spaces ; spa++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol ; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int spa = 1; spa <= spaces; spa++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        int totalCol = 0;
        int spaces = 0;
        for (int row = 1; row <= (2*n)-1 ; row++) {
                if(row <= n){
                    spaces = n - row;
                    totalCol = row;
                }else {
                    spaces = row - n;
                    totalCol--;
                }
                for (int s = 1; s <= spaces ; s++) {
                    System.out.print("  ");
                }
                for (int col = totalCol; col >= 1 ; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= totalCol ; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
        }
    }
    static void pattern31Example(int n){
        for (int row = 0; row <= (2*n) ; row++) {
            for (int col = 0; col <= (2*n)  ; col++) {
                int ele = Math.min(Math.min(col,(2*n)-col),Math.min(row,(2*n)-row));
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for (int row = 1; row <= (2*n)-1 ; row++) {
            for (int col = 1; col <= (2*n)-1 ; col++) {
                int ele = n-(Math.min(Math.min(col-1,(2*n)-col-1),Math.min(row-1,(2*n)-row-1)));
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

