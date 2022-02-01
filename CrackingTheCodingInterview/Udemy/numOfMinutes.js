var numOfMinutes = function(n, headID, manager, informTime) {
    const adjList = manager.map(() => []);
    for (let e = 0; e < n; e++) {
        const man = manager[e];
        if (man == -1) {
            continue;
        }
        adjList[man].push(e);
    }
    console.log(adjList);
};