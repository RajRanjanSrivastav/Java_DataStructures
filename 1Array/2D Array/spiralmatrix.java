
public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                       { 6, 7, 8, 9, 10 },
                     { 11, 12, 13, 14, 15 },
                // { 16, 17, 18, 19, 20 } 
                      };

        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        int srtrow = 0;
        int endrow = arr.length - 1;
        int srtcol = 0;
        int endcol = arr[0].length - 1;

        while (srtrow <= endrow && srtcol <= endcol) {

            // top
            for (int i = srtrow; i <= endcol; i++) {
                System.out.print(arr[srtrow][i] + " ");
            }

            // left
            for (int i = srtrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }

            // bottom
            for (int i = endcol - 1; i >= srtcol; i--) {
                if (srtrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][i] + " ");
            }

            // right
            for (int i = endrow - 1; i >= srtrow + 1; i--) {
                System.out.print(arr[i][srtcol] + " ");
            }

            srtrow++;
            srtcol++;
            endrow--;
            endcol--;

        }

    }
}
