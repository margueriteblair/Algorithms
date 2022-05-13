function longestPeak(array) {
	if (array.length < 3) return 0;
	let longest = 0;
	for (let i = 1; i < array.length-1; i++) {
		let start = i-1;
		let end = i+1;
		while (start >= 0 && array[start] < array[start+1]) {
			start--;
		}
		start++;
		while (end < array.length && array[end] < array[end-1] ) {
			end++;
		}
		end--;
		
		if (start !== i && end !== i) {
			console.log(array.slice(start, end+1));
			longest = Math.max(longest, (end-start+1));
		}

	}
	return longest;
  // Write your code here.
}