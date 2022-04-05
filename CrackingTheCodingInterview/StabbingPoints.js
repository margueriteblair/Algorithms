/* Prompt: 
// Given a set of intervals, each with a start and end point, find the smallest set of points that "stabs" such that every interval contains at least one of the points.

Notes:
-Input not guaranteed to be sorted
-Maybe implement some type of sorting algorithm, to avoid O(N^2) time complexity
-Assume positive intervals

// Function Signature: func stabPoints(input: [(Int, Int)]) -> [Int]
|---------------------|
1    4 5   7    9 10 12
[(1, 4), (4, 5), (7, 9), (9, 12)] => [4, 9].

For each interval, if the start is greater than the latest endpoint, add the end of this interval to the output list and update latest endpoint.

|---------------------|
1   3 4 5            12
[[1,4]
 [5,9]
 [4, 12]] => [2, 9]
1. sort intervals based off of endpoint
2. start iteration over sorted endpoints:
3. conditional logic below:
prevEndpoint = 4; 
currEnd = 9;
if (!currEnd is included in 5 && 9) {
  set.add(4);
}
if (if start > latest) {
  set.add(latest);
  latest = start;
}
  currEnd = 9;

4. Return set;



-pick the max, storing the endpoint of an interval
-sorted by endpoint number

[[1, 4], (5, 9)] => [4, 9]
[(1, 4), (3, 9)] => [4]
1, 2, 3, 4     3, 4, 5, 6, 7, 8, 9
[(1, 4), (4, 5), (7, 9), (9, 12)] => [4, 9]



def get_points(intervals):
    intervals.sort(key=lambda x: (x[1], x[0]))

    points = []
    latest_endpoint = None

    for start, end in intervals:
        if start <= latest_endpoint:
            continue
        else:
            points.append(end)
            latest_endpoint = end

    return points
*/ 

function getPoints(intervals) {
    intervals.sort((a, b) => a[1] > b[1]);
    console.log(intervals);
    let points = new Set();
    let latestEndpoint = null;
    
    for (let [start, end] of intervals) {
      if (start <= latestEndpoint) {
        continue;
        //new start val is inclusive
      } else {
        points.add(end);
        latestEndpoint = end;
      }
    }
    return points;
  }
  
  console.log(getPoints([[-1, 2], [0, 1], [4, 5], [7, 9], [9, 12]]))