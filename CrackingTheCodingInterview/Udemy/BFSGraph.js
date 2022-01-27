const traversalBFS = function(graph) {
    const queue = [0];
    const values = [];
    const seen = {};
    while (queue.length != 0) {
        const vertex = queue.shift();
        values.push(vertex);
        seen[vertex] = true;
        const connections = graph[vertex];
        for (let i = 0; i < connections.length; i++) {
            const connection = connections[i];
            if (!seen[connection]) {
                queue.push(connection);
            }
        }
    }
    return values;
}