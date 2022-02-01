var numOfMinutes = function(n, headID, manager, informTime) {
    const adjList = manager.map(() => []);
    for (let e = 0; e < n; e++) {
        const man = manager[e];
        if (man == -1) {
            continue;
        }
        adjList[man].push(e);
    }
    return dfs(headID, adjList, informTime);
};

const dfs = function(currentId, adjList, informTime) {
  if(adjList[currentId].length === 0) {
    return 0;
  }
  
  let max = 0;
  const subordinates = adjList[currentId];
  for(let i = 0; i < subordinates.length; i++) {
    max = Math.max(max, dfs(subordinates[i], adjList, informTime));
  }
  
  return max + informTime[currentId];
}