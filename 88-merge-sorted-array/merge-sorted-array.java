
class Solution {
    public void merge(int[] a, int i, int[] b, int j) {

        int[] c = new int[i + j];

        int k = 0;
        int x = 0;
        int y = 0;

        // Merge a and b into c
        while (x < i && y < j) {

            if (a[x] < b[y]) {
                c[k++] = a[x++];
            } else {
                c[k++] = b[y++];
            }
        }

        // Remaining elements of a
        while (x < i) {
            c[k++] = a[x++];
        }

        // Remaining elements of b
        while (y < j) {
            c[k++] = b[y++];
        }

        // Copy c back into a
        for (int p = 0; p < c.length; p++) {
            a[p] = c[p];
        }
    }
}

