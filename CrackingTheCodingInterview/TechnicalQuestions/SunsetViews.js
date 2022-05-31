function sunsetViews(buildings, direction) {
    // Write your code here.
    let sunsets = [];
    if (!buildings.length) return sunsets;
    //return an array of the indicies of the buildings that can see the sunset
    //output array should be sorted in ascending order
    //right for east
    //left for west
    if (direction === "EAST") {
      let runningMax = buildings[buildings.length-1];
      sunsets.unshift(buildings.length-1);
      for (let i = buildings.length-2; i >= 0; i--) {
        if (buildings[i] > runningMax) {
          sunsets.unshift(i);
          runningMax = buildings[i];
        }
      }
    } else {
      //it's west
      let runningMax = buildings[0]
      sunsets.push(0)
      for (let i = 1; i < buildings.length; i++) {
        if (buildings[i] > runningMax) {
          sunsets.push(i);
          runningMax = buildings[i];
        }
      }
    }
    return sunsets;
  }