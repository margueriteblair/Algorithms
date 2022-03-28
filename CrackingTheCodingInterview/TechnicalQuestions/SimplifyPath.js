var simplifyPath = function(path) {
    let stack = [];
    let components = path.split("/");
    for (let i = 0; i < components.length; i++) {
        if (components[i] == "." || components[i].length === 0) {
            continue; //we don't need to have our final path know we're in the current directory;
        }else if (components[i] == "..") {
            if (stack.length !== 0) stack.pop(); //we're left with the file before
        } else {
            stack.push(components[i]);
        }
    }
    
    let finalPath = "";
    
    while (stack.length > 1) {
        finalPath = "/" + stack.pop() + finalPath;
    }
    finalPath = "/" + (stack.length > 0 ? stack.pop() : "") + finalPath;
    return finalPath;
    
};