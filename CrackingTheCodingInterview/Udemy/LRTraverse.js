
const leftTraverse = new Array(arr.length).fill(0);
leftTraverse[0] = arr[0];
for (let i = 1; i < arr.length; i++) {
    let prev = arr[i-1];
    if (arr[i] === '.') arr[i] = prev;
}
const rightTraverse = new Array(arr.length).fill(0);
rightTraverse[arr.length-1] = arr[arr.length-1];
for (let i = arr.length-2; i>=0; i--) {
    let prev = arr[i+1];
    if (arr[i] === '.') arr[i] = prev;
}

for (let i = 0; i < arr.length; i++) {
    if (leftTraverse[i] === rightTraverse[i]) {
        arr[i] = leftTraverse[i];
    } else if (i) {

    }
}