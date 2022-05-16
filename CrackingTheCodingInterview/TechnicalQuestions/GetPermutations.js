function getPermutations(array) {
	if (array.length === 0) return [];
  // Write your code here.
	let perms = [];
	function _backtrack(currArr) {
		if (currArr.length === array.length) {
			perms.push([...currArr]);
			return;
		}
		
		for (let i = 0; i < array.length; i++) {
			if (!currArr.includes(array[i])) {
				currArr.push(array[i]);
				_backtrack(currArr);
				currArr.pop();
			}
		}
	}
	_backtrack([]);
	return perms;
}