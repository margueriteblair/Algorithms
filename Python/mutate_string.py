def mutate_string(string, position, character):
    s = list(string)
    s[position] = character
    string = ''.join(s)
    return string

def mutate_string2(string, position, character):
    return string[:position] + character + string[position+1:]