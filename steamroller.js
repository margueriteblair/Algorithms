function steamrollArray(arr) {

    let flattened = arr.flat(Infinity)
    console.log(flattened);
    return flattened;
  }
  
  steamrollArray([1, [2], [3, [[4]]]]);


  function steamrollArray2(arr) {

    let flattened = [].concat(...arr)
    return flattened.some(Array.isArray) ? steamrollArray2(flattened) : flattened;
  }
  
  steamrollArray2([1, [2], [3, [[4]]]]);

  function steamrollArray3(arr) {
    while (arr.some(Array.isArray)) {
      arr = [].concat(...arr)
    }
    return arr;
  }
  steamrollArray3([1, [2], [3, [[4]]]]);
  