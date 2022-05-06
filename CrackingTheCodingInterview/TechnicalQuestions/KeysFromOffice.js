function minVisitsToOffice(employees) {
    let visits = 0;
    let timeIn = 0;
    let timeOut = Infinity;
  //sortedOrder: [[1, 6], [2, 4], [6, 12], [6, 16]] 
    //sorting in order of timeIn for employees
    employees.sort((a, b) => {
      return employees[a] - employees[b];
    });
  
    for (let i = 0; i < employees.length; i++) {
      let currEmployee = employees[i];
      if (currEmployee[0] > timeOut || timeOut === Infinity) { // no overlap
        // where we need to increment, we need to update our visits
        visits++;
        console.log("currEmp", currEmployee[0]);
        timeOut = currEmployee[1];
      }
      else {
        timeOut = Math.min(currEmployee[1], timeOut);
      }
    }
    return visits;
  }
  
  console.log(minVisitsToOffice([[1,6],[2,8],[7,12],[10,16]]));
  console.log(minVisitsToOffice([[1,6],[2,8],[6,12],[10,16]]));
  console.log(minVisitsToOffice([1,6],[2,7],[3,8],[4,9]));