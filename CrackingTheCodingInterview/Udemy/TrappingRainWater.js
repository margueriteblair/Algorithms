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