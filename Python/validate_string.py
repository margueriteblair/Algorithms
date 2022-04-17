def validate(s):
    is_alphaNum = False
    is_alpha = False
    is_digit = False
    is_lower = False
    is_upper = False
    for i in range(0, len(s)):
        if s[i].isalnum():
            is_alphaNum = True
        if s[i].isalpha():
           # print(is_alpha)
            is_alpha = True
           # print(is_alpha)
        if s[i].isdigit():
            is_digit = True;
        if s[i].islower():
            is_lower = True
        if s[i].isupper():
            is_upper = True
        
    print(is_alphaNum)
    print(is_alpha)
    print(is_digit)
    print(is_lower)
    print(is_upper)