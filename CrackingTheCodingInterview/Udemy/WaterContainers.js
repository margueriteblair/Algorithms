const waterContainers = function(heights) {
    let p1 = 0
    let p2 = heights.length-1
    let maxArea = 0;

    while (p1 < p2) {
        const height = Math.min(heights[p1], heights[p2]);
        const width = p2- p1;
        const area = height * width;
        maxArea = Math.max(maxArea,area);

        if (heights[p1] <= heights[p2]) {
            p1++
        } else {
            p2--;
        }

    }
    return maxArea;
}

console.log(waterContainers([1,8,6,2,9,4]))