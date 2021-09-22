const detectCycle = function (head) {
    if (head == null) {
        return null;
    }
    let hare = head;
    let tortoise = head;
    while (true) {
        hare = hare.next;
        tortoise = tortoise.next;
        if (hare == null || hare.next == null) {
            return null;
        } else {
            hare = hare.next;
        }

        if (hare == tortoise) {
            break;
        }
    }
    let t2 = tortoise;
    let h2 = head;
    while (t2 != h2) {
        t2 = t2.next;
        h2 = h2.next;
    }
    return h2;
}