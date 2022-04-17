def count_substring(string, sub_string):
    substring_len = len(sub_string)
    count = 0
    for i in range(len(string)-substring_len+1):
        curr_string = string[i: i+substring_len]
        #print(curr_string)
        if curr_string == sub_string:
            count += 1
    return count