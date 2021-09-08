const trap = function(height) {
    let totalWater = 0;
    for (let i = 0; i < height.length; i++) {
        let left = 0;
        for (let j = 0; j < i; j++) {
            left = Math.max(left, height[j]);
        }
        let right = 0;
        for (let j = i+1; j < height.length; j++) {
            right = Math.max(right, height[j]);
        }

        let tmpWater = Math.min(right, left)-height[i]
        if (tmpWater > 0) {
            totalWater += tmpWater;
        }

        return tmpWater
    }

}

const trap2 = function (height) {
    let i = 0;
    let j = height.length-1;
    let totalWater = 0;
    let maxLeft = 0;
    let maxRight = 0;

    while (i < j) {
        if (height[i] < height[j]) {
            if (height[i] >= maxLeft) {
                maxLeft = height[i]
            } else {
                totalWater += maxLeft - height[i];
            }
            i++
        } else {
            if (height[j] >= maxRight) {
                maxRight = height[j]
            } else {
                totalWater += maxRight - height[j];
            }
            j--;
        } 
    }
    return totalWater
}