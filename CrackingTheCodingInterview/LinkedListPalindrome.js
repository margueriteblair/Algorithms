class LinkedList {
    constructor(value) {
      this.value = value;
      this.next = null;
    }
  }
  
  function linkedListPalindrome(head) {
    // Write your code here.
      let arr = [];
      while (head) {
          arr.push(head.value);
          head = head.next;
      }
      
      let i = 0;
      let j = arr.length-1;
      while (i < j) {
          if (arr[i] !== arr[j]) {
              return false;
          }
          
          j--;
          i++;
      }
    return true;
  }