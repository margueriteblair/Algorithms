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

var maxArea = function(height) {
    let i = 0;
    let j = height.length-1;
    let maxWater = 0;
    
    while (i < j) {
        let width = j-i;
        let currWater = width * Math.min(height[i], height[j]);
        if (currWater > maxWater) maxWater = currWater;
        if (height[i] > height[j]) {
            j--;
        } else {
            i++;
        }
    }
    return maxWater;
};