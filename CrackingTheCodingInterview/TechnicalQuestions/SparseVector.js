var SparseVector = function(nums) {
    this.nums = nums; //nums is a vector
};

// Return the dotProduct of two sparse vectors
/**
 * @param {SparseVector} vec
 * @return {number}
 */
SparseVector.prototype.dotProduct = function(vec) {
    //vec is another vector, 
    let dotProduct = 0;
    for (let i = 0; i < this.nums.length; i++) {
        dotProduct += (vec.nums[i]*this.nums[i]);
    }
    return dotProduct;
    //computer the dot prod between our instance's nums, and another passed in SparseVector vec
};