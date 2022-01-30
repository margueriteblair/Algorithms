const traversalDFS = function(vertex, graph, values, seen) {
    values.push(vertex);
    seen[vertex] = true;
    const connections = graph[vertex];
    for (let i = 0; i < connections.length; i++) {
        const connection = connections[i];
        if (!seen[connection]) {
            traversalDFS(connection, graph, values, seen);
        }
    }
    return values;
}