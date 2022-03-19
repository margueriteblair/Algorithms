var maxArea = function(height) {
    let maxProd = 0;
    for (let i = 0; i < height.length-1; i++) {
        for (let j = i+1; j < height.length; j++) {
            let currProd = 1;
            currProd = Math.min(height[i], height[j])*(j-i);
            if (currProd > maxProd) maxProd = currProd;
        }
    }
    return maxProd;
};