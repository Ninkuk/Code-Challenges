import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3header = new ListNode();

        int carryOver = 0;
        int sum = 0;

        sum = l1.val + l2.val + carryOver;
        l1 = l1.next;
        l2 = l2.next;
        carryOver = (int) (sum / 10);

        l3header.val = sum % 10;

        while (l1 != null || l2 != null) {

            if (l1 == null) {
                sum = l2.val + carryOver;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val + carryOver;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carryOver;
                l1 = l1.next;
                l2 = l2.next;
            }

            carryOver = (int) (sum / 10);

            ListNode temp = l3header;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new ListNode(sum % 10);
        }

        if (carryOver > 0) {
            ListNode temp = l3header;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(carryOver);
        }

        return l3header;
    }
}
