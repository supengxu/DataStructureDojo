package LeetCodeTop100;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    /**
     * 题目：合并两个有序链表
     * 描述：将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
     * 
     * 示例 1：
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     * 
     * 示例 2：
     * 输入：l1 = [], l2 = []
     * 输出：[]
     * 
     * 示例 3：
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     * 
     * 提示：
     * 两个链表的节点数目范围是 [0, 50]
     * -100 <= Node.val <= 100
     * l1 和 l2 均按 非递减顺序 排列
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 待实现
        return null;
    }

    public static void main(String[] args) {
        // 构建测试链表
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode result = solution.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}