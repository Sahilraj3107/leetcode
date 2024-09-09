/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat =new int[m][];

        for(int i=0;i<m;i++){
            mat[i]= new int[n];
            Arrays.fill(mat[i],-1);
        }

        int tR =0, bR =m-1, lC=0,rC =n-1;
        while(head!=null){
            for(int i=lC;i<=rC && head!=null;i++){
                mat[tR][i]=head.val;
                head =head.next;
            }
            tR++;

            for(int i=tR;i<=bR && head!=null;i++){
                mat[i][rC]=head.val;
                head=head.next;
            }
            rC--;

            for(int i=rC;i>=lC&& head!=null ;i--){
                mat[bR][i]=head.val;
                head =head.next;
            }
            bR--;

            for(int i=bR;i>=tR && head!=null ;i--){
                mat[i][lC]=head.val;
                head =head.next;
            }
            lC++;
        }
        return mat;
    }
}