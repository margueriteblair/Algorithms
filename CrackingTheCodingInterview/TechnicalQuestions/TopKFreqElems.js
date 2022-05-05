var topKFrequent = function(nums, k) {
    let map = new Map();
    for (const num of nums) {
        map.set(num, map.get(num)+1 || 1);
    }
    const mapArr = [];
    for (const [num, freq] of map) {
        mapArr.push([num, freq]);
    }
    
    mapArr.sort((a, b) => { return a[1] - b[1]});
    console.log(mapArr);
    
    const res = [];
    for (let i = mapArr.length-1; i > mapArr.length-1-k; i--) {
        res.push(mapArr[i][0]);
    }
    return res;
};
//heap implementation more optimal